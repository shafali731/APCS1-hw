//Team Turkey
//George Liang & Shafali Gupta
//APCS PD08
//2017-12-13
//HW#53 - Solid Comparative Analysis
import java.util.ArrayList;
public class SortTester{
    //=================== HELPER METHODS ===================
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi )
    {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al )
    {
	int randomIndex;
	//setup for traversal fr right to left
	for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
	    randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
	    al.set( i, al.set( randomIndex, al.get(i) ) );
	}
    }
  
    //======================================================
    public static void main(String[]args){
	ArrayList worstBubble = new ArrayList<Integer>();
	ArrayList bestBubble = new ArrayList<Integer>();
	ArrayList worstSelection = new ArrayList<Integer>();
	ArrayList bestSelection = new ArrayList<Integer>();
	ArrayList worstInsertion = new ArrayList<Integer>();
	ArrayList bestInsertion = new ArrayList<Integer>();
	//Adding elements for worst and best bubble cases
	for(int i = 1; i < 6; i++){
	    bestBubble.add(i);
	}

	for(int i = 5; i != 0; i--){
	    worstBubble.add(i);
	}

	//Adding elements for worst and best selection cases(which are the same)
	for(int i = 1; i < 6; i++){
	    bestSelection.add(i);
	}
		
	for(int i = 5; i != 0; i--){
	    worstSelection.add(i);
	}
	//Adding elements for worst and best insertion cases
        for(int i = 1; i < 6; i++){
	    bestInsertion.add(i);
	}

	for(int i = 5; i != 0; i--){
	    worstInsertion.add(i);
	}
	
	//Calls for bubbleSort()
	System.out.println("    **************** bubbleSortV() ***************");
	/****** Based on observation of what was printed in the terminal and our 
		traces, the best scenario for bubbleSort is when it is given an 
		an ArrayList that is already in ascending order resulting in 0 
		swaps. The worst scenario resulted in 10 swaps in a 5 element 
		ArrayList arranged in reverse order. Both the worst and best 
	        scenario made a total of 16 comparisons for 5 elements. *******/
    
	System.out.println("Best bubbleSortV() case");
	System.out.println(bestBubble);
	MySorts.bubbleSortV(bestBubble);
	System.out.println(bestBubble);
	System.out.println();
	System.out.println("Worst bubbleSortV() case");
	System.out.println(worstBubble);
	MySorts.bubbleSortV(worstBubble);
	System.out.println(worstBubble);
	System.out.println();
	//Calls for selectionSort()
	System.out.println("    **************** selectionSortV() ***************");
	/****** Based only on our trace, we believed that there was no best case or
	        worst case for selectionSort since it swaps even if an element is in
                its final position. We decided to also test this by copying our 
                previous worst and best scenarios to see if our conclusion was true.
	        After observing what was printed in the terminal, the same amount of 
                comparisons and swaps were made for Arraylists in order and in reverse
                order. Thus, we can conclude that there is no best or worst scenario for
                selectionSort. *******/
	System.out.println("Best selectionSortV() case");
	System.out.println(bestSelection);
	MySorts.selectionSortV(bestSelection);
	System.out.println(bestSelection);
	System.out.println();
	System.out.println("Worst selectionSortV() case");
	System.out.println(worstSelection);
	MySorts.selectionSortV(worstSelection);
	System.out.println(worstSelection);
	System.out.println();
	//Calls for insertionSort()	
	System.out.println("    **************** insertionSortV() ***************");
        /****** Based on observation of what was printed in the terminal and our 
		traces, the best scenario for insertionSort is when it is given an 
		an ArrayList that is already in ascending order resulting in 0 swaps.
		The worst scenario resulted in 10 swaps in a 5 element ArrayList 
		arranged in reverse order. The best case scenario for a 5 element
	        array also made only 4 comparisons, versus the 10 made by the reverse
	        order ArrayList. *******/
	System.out.println("Best insertionSortV() case");
	System.out.println(bestInsertion);
	MySorts.insertionSortV(bestInsertion);
	System.out.println(bestInsertion);
	System.out.println();
	System.out.println("Worst insertionSortV() case");
	System.out.println(worstInsertion);
	MySorts.insertionSortV(worstInsertion);
	System.out.println(worstInsertion);
    }
}

    
