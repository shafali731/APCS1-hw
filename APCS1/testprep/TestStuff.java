
public class TestStuff {
    // public static boolean booya(int a){
    // 	a = 4; return true;
    // }
    // public static int hooya(){
    // 	int a = 1; int b = 2; int c = 3;
    // 	if (a == 1 || booya(a)) {return c;}
    // 	else  if(b == 1 || booya(a)) {return b;}
    // }
    // public static void fooya(){
    // 	int a = 42;
    // 	System.out.println(hooya()+this.c);
    // }
     public static int fib(int n){
     	
    	if (n==0){
    	    //return r;
	     return 0;
	}
    	if (n==1){
    	    return 1;}
    	else{return fib(n-2) + fib(n-1);}
     }
	    

    public static void main(String[] args) {
	//	fooya();
	System.out.println(fib(3)); 
      
    }
}
