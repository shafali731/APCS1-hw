/* 
Shafali Gupta 
APCS1 pd08 
HW40 -- Make It Better
2017-11-24
*/

/*Improvements in v2:
- Index numbers for users to see the row and column #s
- Exception handling for when the indexes inputted are wrong 
*/
import cs1.Keyboard;
public class Swapper{
    public static void print (String [] [] a){
	int ctr = 0;
	System.out.println( "1 \t 2 \t 3 \t \n"); 	
	for( String [] row: a){
	     String outp = "";
	    // outp += "1 \t 2 \t 3 \t \n";
	     // System.out.println(ctr + "\t ");
	     // ctr +=1;
	    for (String col: row){
		outp += (ctr + "\t " + col + "\t");
		ctr +=1;
		//System.out.println(ctr); 
		//		ctr +=1;
	    }
	    System.out.println(outp); 
	}}
      public static void swap(String[][] array){
	System.out.print("row # of first location: ");
	int Rowloc1 = Keyboard.readInt();
	System.out.print("column # of first location: ");
	int Colloc1 = Keyboard.readInt();
	System.out.print("row # of second location: ");
	int Rowloc2 = Keyboard.readInt();
	System.out.print("column # of second location: ");
	int Colloc2 = Keyboard.readInt();
	try{
	    String temp = array[Rowloc1][Colloc1];
	    array[Rowloc1][Colloc1] = array[Rowloc2][Colloc2];
	    array[Rowloc2][Colloc2] = temp;
	    System.out.println(array[Rowloc1][Colloc1]+ " was switched with " + temp);//tells user what change they made
	}
	catch (Exception e){//if error- use proper index
	    System.out.println("Invalid index #s. Run again with proper index #s");
	}
	
      }
     public static void main(String[] args){
	
	String [][] array = { {"a", "b", "c"},
			      {"d", "e", "f"},
				  {"g","h","i"},
				    {"j", "k", "l"}};
	    print(array);//prints the array
	     swap(array);// enter input and swaps
	     print(array);//prints array with swap 
    }
	
}//end of class Swappers


  
