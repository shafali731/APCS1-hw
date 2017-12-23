//Shafali Gupta
//APCS1 - pd08
//HW51 -- Selection
//2017-12-12

/***************************************
 * class SelectionSort -- implements SelectionSort algorithm
 ***************************************/

import java.util.ArrayList;

public class SelectionSort 
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data ) 
  {
      /* YOUR IMPLEMENTATION HERE */
      
      int a = 0; //exit 
      while(a <data.size()){
	  Comparable minum = data.get(a);
	  int minumindex = a; 
	  //finding the minimum
	  //compares the first unchanged index to the next ones to see the min
	  for(int b = a ; b<data.size()-1; b++){
	      //  System.out.println("b - " + b); 
	      if (minum.compareTo(data.get(b+1)) > 0){
		  minum = data.get(b+1);
		  // System.out.println("minum - " + minum); 
		  minumindex = b+1;
		  //System.out.println("minumindex - " + minumindex); 
	      }
	  }
	  //swap values of the index of minimum with first index
	  //  System.out.println("after swap"); 
	  data.set(a, data.set(minumindex, data.get(a)));
	  //System.out.println("minumindex - " + minumindex);
	  //System.out.println("a " + a);
	  //System.out.println(data); 
	  a++; //increment counter 
	  
      }
      
  }//end selectionSortV



  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable>selectionSort( ArrayList<Comparable> input ) 
  {
    /* YOUR IMPLEMENTATION HERE */
      ArrayList<Comparable> temp = new ArrayList<Comparable>();
      //add values of data into tmep 
      for( Comparable c: input)
	  temp.add(c);
      selectionSortV(temp); //sort temp but not data
      return temp; 
  }//end selectionSort 


  public static void main( String [] args ) 
  {
       /*===============for VOID methods=============

    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

         ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      selectionSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      ============================================*/

     	ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n" 
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n" 
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
    /*==========for AL-returning methods==========
     ============================================*/

  }//end main

}//end class SelectionSort
