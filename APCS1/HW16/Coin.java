public class Coin{
    // instance vars
    public double value;
    public String upFace;
    public String name;
    public int flipCtr;
    public int headsCtr, tailsCtr;
    public double bias;
    
       
    public Coin(){
	upFace = "heads";
	bias= .5;
	headsCtr = 0;
	tailsCtr = 0;
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
	    headsCtr +=1;
	    return "heads";}
	else{
	    upFace= "tails";
	    tailsCtr +=1;
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
