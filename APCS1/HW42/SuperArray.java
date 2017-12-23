// Team IDK(Shafali Gupta, Ying Xin Jiang)
// Shafali Gupta
// APCS1 pd08
// HW42 -- expanding SuperArray functionality, encapsulation
// 2017-11-29w

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates resizing,
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }


  //adds an item after the last item
  public void add( int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */
      int[] temp = new int[_size + 1];
      if (_size != 0){ //if there are already set numbers, you have to add the previous ones first 
	  for(int i = 0; i<_size; i++){
	      temp[i] = _data[i];}
	  temp[_size] = newVal;}
      else{
	  temp[0] = newVal; }
      _data = temp;
      _size +=1; //updated size
	  
  }


  //inserts an item at index
  public void add( int index, int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */
      int[] temp = new int[_size+1]; 
	  for(int a = 0; a<index; a++){
	      temp[a] = _data[a];}
	  temp[index] = newVal;
	  // if (_size > index){ ***DON'T NEED IF STATEMENT- IT WILL JUST IGNORE THE FOR LOOP BECAUSE DOESN'T MATCH BOOLEAN***
	      for(int a= index; a<_size; a++){
		  temp[a+1] = _data[a];}
	      //	  }
	  _data= temp;
	  _size +=1; //updated size
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index )
  {
    /* YOUR IMPLEMENTATION HERE */
      int [] temp = new int[_size - 1];
      for(int a = 0; a<index; a++){//transfer elements before
	  temp[a] = _data[a]; 
      }
     
      for(int a= index; a<_size; a++){//transfere elements after adjusted to left by 1
	  temp[a-1]= _data[a];
      }
      _data= temp;
      _size -=1;} //updated size


  //return number of meaningful items in _data
  public int size()
  {
    /* YOUR IMPLEMENTATION HERE */
      return _size; 
  }



  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
    System.out.println( "Printing empty SuperArray curtis..." );
    System.out.println( curtis );

    for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
    }

    System.out.println("Printing populated SuperArray curtis...");
    System.out.println(curtis);

    for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      System.out.println("new length of underlying array: "
                         + curtis._data.length );
    }

    SuperArray mayfield = new SuperArray();
    System.out.println("Printing empty SuperArray mayfield...");
    System.out.println(mayfield);

    mayfield.add(5);
    mayfield.add(4);
    mayfield.add(3);
    mayfield.add(2);
    mayfield.add(1);
  
    System.out.println("Printing populated SuperArray mayfield...");
    System.out.println(mayfield);

    mayfield.remove(3);
    System.out.println("Printing SuperArray mayfield post-remove...");
    System.out.println(mayfield);
    mayfield.remove(3);
    System.out.println("Printing SuperArray mayfield post-remove...");
    System.out.println(mayfield);

    mayfield.add(3,99);
    System.out.println("Printing SuperArray mayfield post-insert...");
    System.out.println(mayfield);
    mayfield.add(2,88);
    System.out.println("Printing SuperArray mayfield post-insert...");
    System.out.println(mayfield);
    mayfield.add(1,77);
    System.out.println("Printing SuperArray mayfield post-insert...");
    System.out.println(mayfield);
  /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
