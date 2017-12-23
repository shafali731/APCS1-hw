

public class Loopier{

    public static void populate(int[] anArray){
	for (int i =0;i< anArray.length; i++)
	    anArray[i]=(int)(Math.random() * 100);
	// anArray;
    }
    public static String stringify(int[] anArray){
	String result="[";
	for (int i=0; i<anArray.length; i++){
	    result+= anArray[i] + ",";
	    // System.out.println(result);
	}
	result = result.substring(0, result.length() -2);
	result+= "]";
	return result;
    }

    public static int linSearch(int[] a, int target){
	for(int i=0; i< a.length; i++)
	    if (a[i]== target){
		return i;}
	return -1;
    }
    public static int linSearchR(int[]a, int target){
	if (a.length <2){
	    if (a[0]!= target){
		return -1; }
	    else{
		return 0;}
	}
	
	return SearchR(a, target, 0);
    }
    public static int SearchR(int[] a, int target, int ctr){
	while (ctr< a.length){
	if (a[ctr] == target){
	    return ctr; }
	return  SearchR(a, target, ctr+1);}
	return -1;
	
	}
	    

	
    public static void main(String[] args){
	int[] hi;
	hi= new int[10];
	populate(hi);
	System.out.println(stringify(hi));
	System.out.println(linSearch(hi, 10));
	System.out.println(linSearch(hi, 15));
	System.out.println(linSearch(hi,63));
	System.out.println(linSearchR(hi, 10));
	System.out.println(linSearchR(hi, 15));
	System.out.println(linSearchR(hi,63));
	//	System.out.println

	// populate(some);
    }

}
