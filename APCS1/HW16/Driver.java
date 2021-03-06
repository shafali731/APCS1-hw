/* Shafali Gupta 
APCS1 pd8 
HW16 -- Get it While You Can 
2017-10-15 */


/***
    driver for class Coin
    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run.
    2. Move the "TOP" line below the first statement. 
    (with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    3. Compile and run again. 
    4. Resolve errors 1 at a time until it works
    5. Repeat 2-4 until TOP meets BOTTOM
***/

public class Driver{
    public static int count;
    public  static int number;

	    
    public static void main( String[] args )
    {

	//build Objects from blueprint specified by class Coin

	//test default constructor
	Coin mine = new Coin();
    
	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );

	head(1, yours, wayne);
	matching(1, yours, wayne);
	year(2001, yours, wayne);

	//test toString() methods of each Coin
	// System.out.println("mine: " + mine);
	// System.out.println("yours: " + yours);
	// System.out.println("wayne: " + wayne);

	// //test flip() method
	// System.out.println("\nAfter flipping...");
	// yours.flip();
	// wayne.flip();
	// System.out.println("yours: " + yours);
	// System.out.println("wayne: " + wayne);

	// //test equals() method
	// if ( yours.equals(wayne) ) 
	//     System.out.println( "Matchee matchee!" );
	// else
	//     System.out.println( "No match. Firestarter you can not be." );
	
    
    }//end main()

    public static void head(int x, Coin a, Coin  b){
	count = a.headsCtr + b.headsCtr;
	while (count != x){
	    // System.out.println(a.headsCtr + "- yours" );
	    // System.out.println(b.headsCtr + "- xwayne");
	    // System.out.println(count + "count");
	    a.flip();
	    b.flip();
	    count = a.headsCtr + b.headsCtr;}
	System.out.println("yours:" + a);
	System.out.println("wayne:" + b);
	System.out.println(count);
	   
    }
    // until the sum of headsCtr of both coins is eqqual to x, the coins will keep on flipping. It will then print the summary info. 

    public static void matching(int y, Coin a, Coin b){
	number = 0;

	while ( number != y){
	    if (a.equals(b)){
		number += 1;}
	    // System.out.println(a.headsCtr + "- yours" );
	    // System.out.println(b.headsCtr + "- wayne");
	    // System.out.println(number + "number");
	}
	System.out.println("------------matching-------------");
	System.out.println("yours:" + a);
	System.out.println("wayne:" + b);
	System.out.println(number);
    }


    
     public static void year(int y, Coin a, Coin b){
	number = 0;

	while ( number <13000 && ((number%y) != y)){
	    if (a.equals(b)){
		number += 1;}
	    // System.out.println(a.headsCtr + "- yours" );
	    // System.out.println(b.headsCtr + "- wayne");
	    // System.out.println(number + "number");
	}
	System.out.println("------------c-------------");
	System.out.println("yours:" + a);
	System.out.println("wayne:" + b);
	System.out.println(number);
    }

    
}//end class
