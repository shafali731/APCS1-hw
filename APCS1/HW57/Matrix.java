//Shafali Gupta
//APCS1 pd08
//HW57 -- How deep does the rabbit hole go?
//2017-12-20


/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column): 
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1] 
 *
 * TASK:
 * Implement methods below, categorize runtime of each. 
 * Test in main method.
 ***/


public class Matrix 
{
    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix( ) 
    {
	matrix = new Object [DEFAULT_SIZE] [DEFAULT_SIZE]; 
    }


    //constructor intializes an a*a matrix
    public Matrix( int a ) 
    {
	matrix = new Object [a] [a];
    }


    //return size of this matrix, where size is 1 dimension
    private int size() 
    {
	return matrix[0].length;
    }


    //return the item at the specified row & column   
    private Object get( int r, int c ) 
    {
	return matrix[r][c]; 
    }


    //return true if this matrix is empty, false otherwise
    private boolean isEmpty( int r, int c ) 
    {
	int i= 0;
	int f= 0; 
	for(Object[] a: matrix){
	    i++;
	    if (i==r){
		for(Object b: a){
		    f++;
		    if (f== c){
			if (b!= null){
			    return false; }
		    }}
	    }}
	return true; 
    }
	      



    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) 
    {
	Object a = matrix[r-1][c-1];
	matrix[r-1][c-1] = newVal;
	return a; 
    }


    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() 
    {
	String retStr = " | ";
	int i = 0; 
	for(Object[] a: matrix){
	    if(i !=0){ 
		retStr += " \n | "; 
		i=0; }
	    for(Object j: a){
		i++;
		retStr += j + " " ;
		if(i==this.size()){
		    retStr +="|"; 
		}
	    }
	}
	return retStr; }


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) 
    {
	if ((this.size() == ((Matrix)rightSide).size())){

	    int i =0;
	    //  int r = 0; 
	    for(Object[] a: matrix){
	        int r = 0; 
		for(Object b : a){
		    if(this.get(i,r) != ((Matrix)rightSide).get(i, r)){
			return false; }
		    r++;
		}
		i++;
	    }
	}
	return true; 
	    
    }


    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R


    public void swapColumns( int c1, int c2  ) 
    {
	for(Object[] a: matrix){
	    Object temp = a[c1-1];
	    a[c1-1] = a[c2-1];
	    a[c2 - 1]= temp;
	}
    }


    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) 
    {
	Object[] temp = new Object[matrix[r1-1].length];
	int i = 0; 
	for(Object k: matrix[r1-1]){
	    temp[i] = k;
	    i ++;
	}
	i = 0;
	for (Object k: matrix[r2 - 1]){
	    matrix[r1-1][i] = k;
	    i ++;
	}
	i = 0;
	for (Object k:temp){
	    matrix[r2-1][i] = k;
	    i ++;
	}
    }
    //main method for testing
    public static void main( String[] args ) 
    {
	Matrix foo = new Matrix(3);
	System.out.println(foo);
	//isEmpty(2,3);
	Matrix death = new Matrix(3);
	System.out.println(foo.equals(death));
	foo.set(1,1,1);
	foo.set(1,2,2);
	foo.set(1,3,3);
	foo.set(2,1,4);
	foo.set(2,2,5);
	foo.set(2,3,6);
	foo.set(3,1,7);
	foo.set(3,2,8);
	foo.set(3,3,9);
	//death.set(2,1,10);
	//death.set(2,1,11);
	//death.set(3,1,12);
	
	System.out.println(foo);
	System.out.println("\n");
	foo.swapRows(1, 3);
	System.out.println(foo);
	System.out.println("\n");
	foo.swapColumns(1, 3);
	System.out.println(foo);
	System.out.println("\n");


    }
     

}//end class Matrix
