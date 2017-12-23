public class Commafier{
    public static String commafyR(int a){
	String strInt= Integer.toString(a);
	int L= strInt.length();
	String newNum= "";
	if (L<=3){
	    return strInt + newNum;
	}
	
	newNum = commafyR(Integer.parseInt(strInt.substring(0, L-3)))+ "," + (strInt.substring(L-3))+  newNum;
	strInt= strInt.substring(0, L-3); 
	return newNum; 
    }

    public static String commafyF(int a){
	String strInt= Integer.toString(a);
	//int L= strInt.length();
	String newNum= "";
	for(int L= strInt.length(); L>3 ; strInt = strInt.substring(0, L-3), L-=3){
	    newNum= "," + strInt.substring(L-3);
	}
	return strInt + newNum;
    }
					 


    public static void main(String[] args){
	// System.out.println(commafyR(1));
	// System.out.println(commafyR(1000));
	// System.out.println(commafyR(1000000));
	//System.out.println(commafyF(1));
	//System.out.println(commafyF(1000));
	//System.out.println(commafyF(1000000));
	for (String s: args){ sop(commafyR (s));}
			  }}
