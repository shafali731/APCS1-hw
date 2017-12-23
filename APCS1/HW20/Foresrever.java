/* Shafali Gupta 
APCS1 pd8
HW20 -- For the Love of Strings
2017-10-19 */

public class Foresrever{
    public static String revR ="";
    public static String fenceF(int posts){
	String fen = "";
	for(fen = "|"; posts !=0; fen +="--|"){
	    posts -=1;
	}
	return fen;
    }
    public static String reverseF(String s){
	String rev= "";
	int last= s.length();
	int Ctr = last-1;
	for (rev="";Ctr >= 0 && last >=0; Ctr -=1){
	    rev+= s.substring(Ctr, last); //Ctr is included in the string but not last 
	    last -=1;
	}
	return rev;
    }
   
   
    public static String reverseR(String s){
	int last= s.length();
	int Ctr = last - 1;
	if (last >=0 && Ctr >=0){
	
	    revR +=s.substring(Ctr, last);
	    reverseR(s.substring(0, Ctr));}
	return revR;
    }

    public static void main(String [] args){
	System.out.println("--------Fences-----------");
	System.out.println(fenceF(3));
	System.out.println(fenceF(6));
	System.out.println("------------- Hello reversed-----------");
	System.out.println(reverseF("hello"));
	System.out.println(reverseR("hello"));
    }
}
	    
