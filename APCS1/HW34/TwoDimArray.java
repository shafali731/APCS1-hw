/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/
// Shafali Gupta
// APCS1 pd08
// HW34 -- 2D arrays
// 2017-11-17

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
      for(int i = 0; i < a.length; i++){
	  System.out.println(a[i]);
      }
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
      for(int[] arr: a){
	  System.out.println(arr);
  }
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
      int ret = 0; 
      for (int[] arr: a){
	  for(int num: arr){
	      ret += num;
	  }
      }
      return ret;
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
      int ret = 0; 
      for(int i = 0; i < m.length; i++){
	  ret += sumRow(i, m);
      }
      return ret;
     }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
      int ret = 0;
      for(int i = 0; i < a[r].length; i++){
	  ret+= a[r][i];
	  }
      return ret;
  }
      


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] a)
  {
      int ret = 0;
      for(int num:a[r]){
	  ret += num;
      }
      return ret;
  }


  public static void main( String [] args )
  {
      //test cases succesful!
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
System.out.println("m1 \n");
      print1(m1);
     System.out.println("m2 \n");
      print1(m2);
      System.out.println("m3 \n");
      print1(m3);
      System.out.println("m1 \n");
      print2(m1);
      System.out.println("m2 \n");
      print2(m2);
      System.out.println("m3 \n");
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));//tests for sumRow as well
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      System.out.println(sumRow2(1, m2));//tests succesfully for 15
  }
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
}//end class TwoDimArray
