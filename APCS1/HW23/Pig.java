//Team YAS(Aleksandra Koroza,Shafali Gupta, Ying Xin Jiang)
//APCS1 pd 8
//HW #23: Etterbay Odingcay Oughthray Ollabortationcay
//2017-10-25  

/*In the cases with punctuation, we should first check whether or not the character is a latter. If it is, we'll convert it to Pig Latin. All excess spaces adn mid-sentence puncutation are cleaned up except if the end a sentence. Numbers are left alone as well. */

public class Pig
{

    //Q: How does this initialization make your life easier?
    //A: I can use VOWELS to compare input strings and see if they contain vowels
    private static final String VOWELS = "aeiouAEIOU";


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

//pre: w.length() > 0
//post: engToPig("apple")  --> "appleway"
//      engToPig("strong") --> "ongstray"
//      engToPig("java")   --> "avajay"
//Pig Latin Rules for APCS! 

//1. Move the leading consonant to the end of the word and then append "ay"
//2. If the leading character is a vowel, append "way"


public static String engToPig(String w) {
    String result="";

    //for vowels
    if (beginsWithVowel(w)){
	result+= (w + "way");
	return result;
    }
    

    //consonant sound

     int indexFirstVowel=0;
     for (int i=0; i< w.length();i++){
	 if (isAVowel(w.substring(i,i+1))){
	     indexFirstVowel=i;
	     //System.out.println(indexFirstVowel);
	     break;
	 }}
     String base= w.substring(indexFirstVowel);
     result+= base+w.substring(0,indexFirstVowel).toLowerCase()+"ay"; //java
   
     if (w.substring(0,1).equals(w.substring(0,1).toLowerCase()))
{
	 return result;
     }
     return capital(result);
    
}

    public static String capital(String w){
	// if (w.equals(w.lower())){
	//     return w 
	//     }
	int Low= VOWELS.indexOf(w.substring(0,1));
	String Bo= VOWELS.substring(Low +5, Low+6);
	return Bo + (w.substring(1)).toLowerCase(); 
	
	    
	    
    }

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
	System.out.println("-colder- should be o");
	System.out.println(firstVowel("blhj"));
	System.out.println("-blhj- should be \"\"");
	System.out.println("------------------------");
	System.out.println("beginsWithVowel");
	System.out.println(beginsWithVowel("at"));
	System.out.println("-at- should be true");
	System.out.println(beginsWithVowel(""));
	System.out.println("-\"\" - should be false");
	System.out.println("-----------------------");
	System.out.println("engToPig");
	System.out.println(engToPig("apple"));
	System.out.println("-apple- should be appleway");
	System.out.println(engToPig("java"));
	System.out.println("-java- should be avajay");
	System.out.println(engToPig("Love"));
	System.out.println("-Love- should be Ovelay");
    }//end main()
}//end class Pig
