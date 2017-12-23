public class CodingBat{
    public static String  helloName(String name) {
        return "Hello " + name + "!";
    }
    /*-----------------------------------------------------*/
    public String makeAbba(String a, String b){
        return a+b+b+a;
    }
    /*-----------------------------------------------------*/
    public static String doubleChar(String chara){
        String dub= "";
        int start= 0;
        int end = 1;
        for(dub = ""; start <chara.length() && end <= chara.length(); start+=1)\
	    {
		dub += chara.substring(start, end);
		dub += chara.substring(start, end);
		end +=1;
	    }
        return dub;
    }

    // Return the number of times that the string "hi" appears anywhere in the given string.
    public static int countHi(String str) {
	int times = 0;
	if (str.length() <= 1){
	    return times;
	}
	int len = str.length() - 2;
	for (int i = 0; i < len; i++){
	    if(str.substring(i, i + 2).equals("hi")){
		times += 1;
	    }
	}
	if (str.substring(len, str.length()).equals("hi")){
	    times += 1;
	}
	return times;
    }

    // Return true if the string "cat" and "dog" appear the same number of times in the given string.
    public static boolean catDog(String str) {
	int catTimes = 0;
	int dogTimes = 0;
	int lengths = str.length() - 3;

	if (str.length() <= 2){
	    return catTimes == dogTimes;
	}
	// cat/dog loop
	for (int i = 0; i < lengths; i++){
	    if(str.substring(i, i + 3).equals("cat")){
		catTimes += 1;
	    }
	    if(str.substring(i, i + 3).equals("dog")){
		dogTimes += 1;
	    }
	}
	if (str.substring(lengths, str.length()).equals("cat")){
	    catTimes += 1;
	} 
	if (str.substring(lengths, str.length()).equals("dog")){
	    dogTimes += 1;
	}
	return catTimes == dogTimes;
    }


    // Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    public static int countCode(String str) {
	int times = 0;
	if (str.length() <= 3){
	    return times;
	}
	int lengths = str.length() - 4;
	for (int i = 0; i < lengths; i++){
	    if(str.substring(i, i + 2).equals("co")){
		if (str.substring(i + 3, i + 4).equals("e")){ 
		    times += 1;
		}
	    }
	}
	if (str.substring(str.length() - 4, str.length() - 2).equals("co")){
	    if (str.substring(str.length() - 1, str.length()).equals("e")){ 
		times += 1;
	    }
	}
	return times;
    }


public boolean xyzThere(String str) {
  int times = 0;
   int i =0;
	if (str.length() < 3){
	    return str.length()> 3;
	}
	int len = str.length() - 3;
	while(i <= len){
      if(str.substring(i, i + 3).equals("xyz")){ 
          if ((i!=0 ) && (str.substring(i-1, i).equals("."))){
          i++;
          }
         else {return 3>2;}
     
//		return 2<3;
	    }
       i++;
	}
	 return 3<2;
}
