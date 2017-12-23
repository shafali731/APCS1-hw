//Team YAS (Aleksandra Koroza, Shafali Gupta, Ying Xin Jiang)
//APCS1 pd 8
//HW #24: Imetay Otay Ineshay
//2017-10-29
import java.util.Scanner;

public class Pig
{
    /*In cases with punctuation, we should first check whether or not the character is a letter. If it is, we'll convert it to Pig Latin. All excess spaces and mid-sentence punctuation are cleaned up except if they end a sentence. Numbers are left alone as well. 

      another  useful method for piglatin to english converter:
    one that would check the ending of word and return the index of the first letter
    of the english string. This letter can then be located, and the word broken up into a) ending, b) first letter, and c)rest of word.

    NOTE: our code does not recognize certian words as containing y as a vowel (such as rye, bye or in other cases where there are other vowels besides the y letter)*/

    //Q: How does this initialization make your life easier?
    //A: I can use VOWELS to compare input strings and see if they contain vowels
    private static final String VOWELS = "aeiouAEIOU";
    private static final String PUNCTUATION=",.-'!?~`@#$%^&*()_:;/";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
	if ((w.indexOf(letter))==-1){return false;}
	return true;
    }//end hasA()


    /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
    public static boolean isAVowel( String letter ) 
    {
	if ((VOWELS.indexOf(letter))==-1){return false;}
	return true;}



/*=====================================
  int countVowels(String) -- counts vowels in a String
  pre:  w != null
  post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  {
      int result=0;
      for (int i=0; i<w.length();i++){
	  if (isAVowel(w.substring(i,i+1))){
	      result+=1;}
      }
      return result;
  }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
      =====================================*/
    public static boolean hasAVowel( String w ) 
    {
	if (countVowels(w)==0){return false;}
	return true;
    }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w ) 
    {
	String result="";
	for (int i=0; i<w.length();i++){
	    if (isAVowel(w.substring(i,i+1))){
		result+=w.substring(i,i+1);}
	}
	return result;
    }


    public static String firstVowel(String w){
	//pre: w!= null 
	// post:firstvowel("") --> ""
	// 	firstvowel("zzz") --> ""
	// 	firstvowel("meatball") --> "e"
	int index = 0; 
	while (index< w.length()){
	    if (isAVowel(w.substring(index, index + 1))){
		return w.substring(index, index + 1);
	    }
	    index+=1; }
	return "";
    }

    //pre: w != null and w.length() > 0
    //post: beginsWithVowel("apple")  --> true
    //      beginsWithVowel("strong") --> false
    public static boolean beginsWithVowel(String w) {
	if(w.length()>=1 && isAVowel( w.substring(0, 1))== true){
	    return true; }
	return false;
    }

    //checks if first letter is capital
    public static boolean firstIsCapital(String s){
	return s.substring(0,1).equals(s.substring(0,1).toUpperCase());}


    //method for capitalizing the first character of a given string.
    public static String capital(String w){

        String Low= (w.substring(0,1)).toUpperCase();
	String Bo= w.substring(1);
	return Low + Bo; 
    }

    //method to check if y acts as a vowel in the word
    public static boolean isYVowel(String s){
	if ((hasAVowel(s)== false) && (hasA(s, "y") || hasA(s, "Y")) ){
	    return true;}
	return false;
    }


    //method to find the index of y in words where it functions as a vowel
    public static int yIndex(String s){
	int yIndex=0;
	for(int cnt = 0; cnt< s.length(); cnt++){
	    if((s.substring(cnt,cnt+1).equals("y"))||(s.substring(cnt,cnt+1).equals("Y"))){
		yIndex= cnt;
		break;
	    }}
        

	return yIndex;
    }

    //checking if word ends with a punctuation mark
    public static boolean hasAPunctuation(String s){
	for (int cnt=0; cnt < PUNCTUATION.length(); cnt++){
	    if (s.substring(s.length()-1).equals(PUNCTUATION.substring(cnt,cnt+1))){
		return true;
	    }
	     
	}
	return false;
    }

    //checking if word is all caps; necessary to change the capitalization of "ay" or "way"
    public static boolean isAllCaps(String s){
	if (s.equals(s.toUpperCase())){return true;
	}
	return false;
    }

    //getting the index of the vowel sound
    public static int vowelIndex(String s){
	int indexFirstVowel=0;
	for (int i=0; i< s.length();i++){
	    if (isAVowel(s.substring(i,i+1))){
		indexFirstVowel=i;
		//System.out.println(indexFirstVowel);
		break;
	    }}
	return indexFirstVowel;
    }

    //pre: w.length() > 0
    //post: engToPig("apple")  --> "appleway"
    //      engToPig("strong") --> "ongstray"
    //      engToPig("java")   --> "avajay"
    //Pig Latin Rules for APCS! 
    //1. Move the leading consonant to the end of the word and then append "ay"
    //2. If the leading character is a vowel, append "way"

    public static String engToPig(String w) {
	int vowel=0;
	String punc="";
	String base="";
	    
	//checking/ getting punctuation marks and setting base of word accordingly
	if (hasAPunctuation(w)){
	    punc=w.substring(w.length()-1);

	    if (isYVowel(w)){
		base= w.substring(yIndex(w),(w.length()-1));
	    }
	    else{base= w.substring(vowelIndex(w),(w.length()-1));}
	    }
	else {
	    if (isYVowel(w)){base= w.substring(yIndex(w));}
	    else{base= w.substring(vowelIndex(w));}}


	//for words that begin with vowel (and have punctuation)
	if (beginsWithVowel(w)){
	    if(isAllCaps(w) && hasAPunctuation(w)){
		return base+"WAY"+punc;}
	    if(isAllCaps(w)){
		return w+"WAY";}
	    if (firstIsCapital(w)&& hasAPunctuation(w)){
		return base+"way"+punc;}
	    if (firstIsCapital(w)){
		return w+"way";}
	    if (hasAPunctuation(w)){
		return base+"way"+punc;}
	    return w+"way";
	}

	//set index of vowel
	if (isYVowel(w)){
	    vowel= yIndex(w);
	}
	else{vowel=vowelIndex(w);}

	//building up each translation
        
	if(isAllCaps(w) && hasAPunctuation(w)){
	    return base+ w.substring(0,vowel)+"AY"+punc;}
	if(isAllCaps(w)){
	    return base+w.substring(0,vowel)+"AY";}
	if (firstIsCapital(w) && hasAPunctuation(w)){
	    return capital(base)+w.substring(0,vowel).toLowerCase()+"ay"+punc;}
	if (firstIsCapital(w)){
	    return capital(base)+w.substring(0,vowel).toLowerCase()+"ay";}
	if (hasAPunctuation(w)){
	    return base+w.substring(0,vowel)+"ay"+punc;}
	return base+w.substring(0,vowel)+"ay";
    }






    //main method with hardcoded test cases and scanner functionality
      public static void main( String[] args ) 
    {
	/* YOUR TEST CALLS HERE */
	System.out.println("hasA method:");
	System.out.println(hasA("cat", "a"));
	System.out.println("-cat, a - should be true");
	System.out.println(hasA("cat", "C"));
	System.out.println("-cat, c  - should be false");
	System.out.println(hasA("cat", "d"));
	System.out.println("-cat, d -should be false");
	System.out.println("-----------------------");
	System.out.println("isAVowel");
	System.out.println(isAVowel("a"));
	System.out.println("- a- should be true");
	System.out.println(isAVowel("b"));
	System.out.println("-b- shoudl be false");
	System.out.println(isAVowel("e"));
	System.out.println("-e- shoudl be true");
	System.out.println(isAVowel("i"));
	System.out.println("-i- Should be true");
	System.out.println(isAVowel("o"));
	System.out.println("-o- should be true");
	System.out.println(isAVowel("u"));
	System.out.println("-u- should be true");
	System.out.println("---------------------");
	System.out.println("countVowels:");
	System.out.println(countVowels("cat"));
	System.out.println("-cat- should be 1");
	System.out.println(countVowels("coolio"));
	System.out.println("-coolio- shoudl be 4");
	System.out.println(countVowels("hello"));
	System.out.println("-hello- should be 2");  
	System.out.println("----------------------");
	System.out.println("hasAVowel");
	System.out.println(hasAVowel("cat"));
	System.out.println("-cat- should be true");
	System.out.println(hasAVowel("coolio"));
	System.out.println("should be true");
	System.out.println(hasAVowel("blh"));
	System.out.println("-blh-should be false");
	System.out.println("-----------------------");
	System.out.println("allVowels");
	System.out.println(allVowels("cat"));
	System.out.println("-cat- should be a");
	System.out.println(allVowels("coolio"));
	System.out.println("-coolio- should be ooio");
	System.out.println(allVowels("tired"));
	System.out.println("-tired- should be ie");
	System.out.println("-----------------------");
	System.out.println("firstVowel");
	System.out.println(firstVowel("colder"));
	System.out.println(beginsWithVowel("at"));
	System.out.println(beginsWithVowel(""));
	System.out.println("------------");
	System.out.println("engToPig");
	System.out.println(engToPig("apple"));
	System.out.println(engToPig("java"));
	System.out.println(engToPig("Love"));

	System.out.println("type in a word to change to piglatin");
        
        
	Scanner sc = new Scanner(System.in);
	while (sc.hasNext()){
	    System.out.println(engToPig(sc.next()));}
    }//end main()
}//end class Pig
