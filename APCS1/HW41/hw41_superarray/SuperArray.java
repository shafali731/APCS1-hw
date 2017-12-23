/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

//Shafali Gupta
//APCS1 pd 08
//HW41 -- Array of Steel
//2017-11-27

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    /* YOUR IMPLEMENTATION HERE */
      _data = new int[10];
      _size = _data.length;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    /* YOUR IMPLEMENTATION HERE */
      
      String retString = "";
      retString += "[";
      int i = 0; 
      while (i<_size-1){
	  retString += _data[i] + ","; //adds a comma after every number except the last one
	      i +=1; }
      retString += _data[i] + "]"; 
      // for (int i = 0; i< _data.length; i++){
      //     retString += _data[i] + ",";
      // }
      //retString = retString.substring(0, retString.length() - 3) + "]";
      return retString;

  }


  //double capacity of SuperArray
  private void expand()
  {
    /* YOUR IMPLEMENTATION HERE */
      int[]_data2 = new int[_size * 2];
      for(int i = 0; i < _size; i++){
	  _data2[i] = _data[i];
            }
      _data= _data2; //_data2 is now an alias of _data
      _size = _data.length; //need to update the size 
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    /* YOUR IMPLEMENTATION HERE */

      return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    /* YOUR IMPLEMENTATION HERE */

      int old = _data[index];
      _data[index] = newVal;
      return old;
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
      }
      // System.out.println(curtis.get(3)); 
  /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
