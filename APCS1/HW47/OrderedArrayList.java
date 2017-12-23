//Shafali Gupta
//APCS1 pd08
//HW47 - ascending
//2017 - 12-06

/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList()
    {
	// *** YOUR IMPLEMENTATION HERE ***
	_data = new ArrayList<Comparable>();
    }


    public String toString()
    {
	// *** YOUR IMPLEMENTATION HERE ***

	return _data.toString(); 
     
	// return ""; //placeholder
    }


    public Comparable remove( int index )
    {	
	// *** YOUR IMPLEMENTATION HERE ***
	return _data.remove(index); 
	// return ""; //placeholder 
    }


    public int size()
    { 
	// *** YOUR IMPLEMENTATION HERE ***
	return _data.size();
	//return -1; //placeholder 
    }

    
    public Comparable get( int index )
    { 
	// *** YOUR IMPLEMENTATION HERE ***
	return _data.get(index); 
	//return ""; //placeholder  
    }


    public void add(Comparable newVal)
    { 
	// *** YOUR IMPLEMENTATION HERE **
	//	System.out.println("newVal = " + newVal); 
	int i = _data.size()-1;
	if( _data.size() == 0){ //if empty- just add
	    _data.add(newVal);
	    //    System.out.println(_data); 
	}
	//	int i = _data.size()-1;
	else if(_data.size()-1>=0){ //as long as it's not empty 
	    while((_data.get(i).compareTo(newVal) >0) && (i >0)){ //if last element is greater than newVal
		i-=1; //decrease i by 1
	    }
	    //  System.out.println(_data);
	    if (_data.get(i).compareTo(newVal) <0){ //if last element is less than newVal
		_data.add(i+1, newVal); }//add it before the last
	}
	else{
	    _data.add(i, newVal);}
	 
	      
    }

    

    // main method solely for testing purposes
    public static void main( String[] args )
    {
	OrderedArrayList Franz = new OrderedArrayList();
	System.out.println(Franz); 
   
	// testing linear search
	for( int i = 0; i < 15; i++ )
	    Franz.add( (int)( 50 * Math.random() ) );
	System.out.println(Franz); 
	System.out.println( Franz );

	//check for sorted-ness
	//if msg does not appear, list was sorted
	for( int i=0; i<Franz.size()-1; i++ ) {
	System.out.println("at i: " + Franz.get(i) );
	if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
        System.out.println( " *** NOT sorted *** " );
        break;
	}
	}
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class OrderedArrayList
