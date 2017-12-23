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
    _data = new ArrayList<Comparable>();    
  }


  public String toString()
  {
    return _data.toString(); 
  }


  public Comparable remove( int index )
  {	
    return _data.remove(index); 
  }


  public int size()
  { 
    return _data.size();
  }

    
  public Comparable get( int index )
  { 
    return _data.get(index); 
  }


  /***
   * add takes as input any comparable object 
   * (i.e., any object of a class implementing interface Comparable)
   * inserts newVal at the appropriate index
   * maintains ascending order of elements
   * uses a linear search to find appropriate index
   ***/
  public void add( Comparable newVal )
  { 
    for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { 
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
	    }
    }
    _data.add( newVal ); //newVal > every item in oal, so add to end 
  }

    public void addBin(Comparable newVal){
	_data.add(getMiddle(newVal, _data), newVal); 
    }
    public int getMiddle(Comparable newVal, java.lang.Object o){
	int range = _data.size() -1; 
	int mid= 0; 
	if ((_data.size() %2) != 0){
	    mid = _data.size() /2;
	    if (_data.get(mid).compareTo(newVal)>0){
		range /= 2; 
		ArrayList temp = new ArrayList[range];
		for(int p = 0; p< range; p++){
		    temp[p] = _data[p];
		}
		getMiddle(newVal, temp);}
	    if (_data.get(mid).compareTo(newVal)<0){
		
		ArrayList temp = new ArrayList[range/2];
		range /= 2;
		int i= 0; 
		for(int p = mid; i< range; i++){
		    temp[i] = _data[p];
		    p++;}
		getMiddle(newVal, temp);
	    }}
	if ((_data.size() %2) = 0){
	    range = _data.size(); 
	    mid = _data.size() / 2;
    	    if((_data.get(mid).compareTo(newVal) >= 0)){
		if(_data.get(mid-1).compareTo(newVal) =< 0){
		    mid = mid; }}
	    else{
		if(_data.get(mid). compareTo(newVal) < 0){
		    range /=2;
		    ArrayList temp = new ArrayList[range];
		    int i= 0; 
		    for(int p = mid; i< range; p++){
			    temp[i] = _data[p];
			    i++;}
		    getMiddle(newVal, temp); }
		if(_data.get(mid). compareTo(newVal) > 0){
		    range /=2;
		    ArrayList temp = new ArrayList[range];
		    for(int p = 0; p< range; p++){
			temp[p] = _data[p];}
		    getMiddle(newVal, temp); }}}
	return mid; }
	    
		    
		
		
		

  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.add( (int)( 50 * Math.random() ) );
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
    Franz.addBin(5); 
    
    /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class OrderedArrayList
