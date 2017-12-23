public class Fooya{

    public static int traces(){
		int i = 0;
		int x = 0;
	x = i++ +2;
	return i;
	//	x = ++i +2; 
	//	return x;
    }
   
    public static void main(String args[]){
	//	System.out.println("Did you know that \"organges\" spelled backwards is \"gullible\"");
	//	System.out.println(traces());
	for(String s : args){
	  System.out.println(s);
	}


    }
}
