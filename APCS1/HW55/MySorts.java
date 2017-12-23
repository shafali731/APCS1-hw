//Team Turkey
//George Liang & Shafali Gupta
//APCS PD08
//2017-12-14
//HW#54 - Never Fear, Big Oh is Here!
import java.util.ArrayList;
public class MySorts{

     /****** Based on observation of what was printed in the terminal and our 
	    traces, the best scenario for bubbleSort is when it is given an 
	    an ArrayList that is already in ascending order resulting in 0 
	    swaps. The worst scenario resulted in 10 swaps in a 5 element 
	    ArrayList arranged in reverse order. Both the worst and best 
	    scenario made a total of 16 comparisons for 5 elements.

	    We believe that the time complexity of this algorithm is
	    O(n^2) since we have a for loop that iterates through each
	    element, and a nested for loop where for each element it must 
	    iterate for another n times no matter what(independent of best
	    and worst). 
    *******/

    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data )
    {
	int swaps = 0; //ctr for how many swaps 
	int comparisons = 0; //ctr for how many comparisons 
	//make n-1 passes across collection
	for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {
	    //System.out.println( "commencing pass #" + passCtr + "..." );

	    //iterate from first to next-to-last element
	    for( int i = 0; i < data.size()-1; i++ ) {
		//if element at i > element at i+1, swap
		comparisons += 1;
		if ( data.get(i).compareTo(data.get(i+1) ) > 0 ){ 
		    data.set( i, data.set(i+1,data.get(i)) );
		    swaps += 1;
		}
		//System.out.println(data); //diag: show current state of list
	    }
	}
	System.out.println(comparisons + " Comparisons were made");
	System.out.println(swaps + " Swaps were made");
    }

    /****** Based only on our trace, we believed that there was no best case or
	    worst case for selectionSort since it swaps even if an element is in
	    its final position. We decided to also test this by copying our 
	    previous worst and best scenarios to see if our conclusion was true.
	    After observing what was printed in the terminal, the same amount of 
	    comparisons and swaps were made for Arraylists in order and in reverse
	    order. Thus, we can conclude that there is no best or worst scenario for
	    selectionSort.
	    
	    The time complexity of selectionSort is O(n). For each pass, that nested
	    for loop doesn't run through n elements so we cannot say that its O(n^2).
	    The nested for loop actually gets shorted as pass gets closer and closer to 1.
    *******/

    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) 
    {
	//note: this version places greatest value at rightmost end,

	//maxPos will point to position of SELECTION (greatest value)
	int maxPos;
	int swaps = 0; //ctr for how many swaps 
	int comparisons = 0; //ctr for how many comparisons
	for( int pass = data.size()-1; pass > 0; pass-- ) {
	    //System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
	    maxPos = 0;
	    for( int i = 1; i <= pass; i++ ) {
		//System.out.println( "maxPos: " + maxPos );//diag
		//System.out.println( data );//diag
		comparisons += 1;
		if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
		    maxPos = i;
	       
	    }
	    //Swaps are made even if the if statement before was false 
	    data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
	    swaps += 1;
	    //System.out.println( "after swap: " +  data );//diag
	}
	System.out.println(comparisons + " Comparisons were made");
	System.out.println(swaps + " Swaps were made");
    }//end selectionSortV

    /****** Based on observation of what was printed in the terminal and our 
	     traces, the best scenario for insertionSort is when it is given an 
	     an ArrayList that is already in ascending order resulting in 0 swaps.
	     The worst scenario resulted in 10 swaps in a 5 element ArrayList 
	     arranged in reverse order. The best case scenario for a 5 element
	     array also made only 4 comparisons, versus the 10 made by the reverse
	     order ArrayList. 

	     From what we see based on comparisons. It seems that in the best case,
	     insertionSort will be linear, as it will need to only pass n - 1 times.
	     So we will say that in the best case, insertionSort has O(n) complexity.
	     For the worst case, you would actually have to iterate through each n, 
	     but then it doesn't exactly iterate n times for each n in the second 
	     for loop so we will also say worst case has about an O(n) complexity. 
	     
    *******/
    // VOID version of InsertionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void insertionSortV( ArrayList<Comparable> data )
    {
	int swaps = 0; //ctr for how many swaps 
	int comparisons = 0; //ctr for how many comparisons 
	for( int partition = 1; partition < data.size(); partition++ ) {
	    //partition marks first item in unsorted region

	    //diag:
	    System.out.println( "\npartition: " + partition + "\tdataset:");
	    System.out.println( data ); 

	    //traverse sorted region from right to left
	    for( int i = partition; i > 0; i-- ) {

		// "walk" the current item to where it belongs
		// by swapping adjacent items
		comparisons += 1;
		if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
		    //diag:
		    //System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
		    data.set( i, data.set( i-1, data.get(i) ) );
		    swaps += 1;
		}
		else 
		    break; 
	    }
	}
	System.out.println(comparisons + " Comparisons were made");
	System.out.println(swaps + " Swaps were made");
    }//end insertionSortV

    /******* Lets talk about add() and addBin()! *******/

    /*** 
	 add() is linear with an O(n) because it goes through n times in the for loop.
	 It does a few operationes but those are negligible if we look only at that n
	 coefficient. For the best or the worst case it will course through the for loop
	 n times. (Assuming that the best and worst case have same amount of elements)
    ***/ 


    /***
	addBin() is a logarithmic because for n elements it ends up doing log(n) passes 
	in order to get to the result. This is observed as we have n = 2 and we only 
	need one pass to decide if we are going to choose the element on the left or the
	right. If we have n = 4, we will need to halve the elements then decide if its the
	left or the right which is 2 operations. 
    ***/

    

    
}
