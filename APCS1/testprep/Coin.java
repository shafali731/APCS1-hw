public class Coin{
    // instance vars
    private double value;
    private String upFace;
    private String name;
    private int flipCtr;
    private int headsCtr, tailsCtr;
    private double bias;
    
       
    public Coin(){
	upFace = "heads";
	bias= .5;
    } ///end overloaded

    public Coin(String s){
	this();
	name = s;
    } //end 1st overloaded

    public Coin(String s, String a){
	this();
	name = s;
	upFace = a;
    }  //end 2nd overloaded
    
    public String toString(){
	return name + " " +  upFace;
    }// overridden toString method

    public String flip(){
	if (Math.random()< bias){
	    upFace= "heads";
	    return "heads";}
	else{
	    upFace= "tails";
	    return "tails";}
    } // flip

    public boolean equals(Coin instance){
	return upFace.equals(instance.upFace);
    }

    private double assignValue( String s ){ 
    if ( name.equals("penny") ) {
	    value = 0.01;
    }
    else if ( name.equals("nickel") ) {
	    value = 0.05;
    }
    else if ( name.equals("dime") ) {
	    value = 0.1;
    }
    else if ( name.equals("quarter") ) {
	    value = 0.25;
    }
    else if ( name.equals("half dollar") ) {
	    value = 0.5;
    }
    else if ( name.equals("dollar") ) {
	    value = 1;
    }
    return value;
  }
	    
    

    
}//end class 
