/* Shafali Gupta 
   APCS1 pd 1 
   HW15-- Wayne's World 
   2017-10-12 */ 


public class Coin {
    // instance vars (attributes)
    String value;
    String upFace;
    String name;
    int flipCtr;
    int headsCtr;
    int tailsCtr;
    double bias;
    
    //default constructor 
    public Coin(){
	upFace = flip();
	bias = 0.5;
    }
    //1st overloaded constructor 
    public Coin(String val){
	this();
	value = val;
    }

    //2nd overloaded constructor 
    public Coin(String val, String face){
	this();
	value = val;
	upFace = face;
    }
    
    public double bias(double biasNum){
	bias = biasNum;
	return bias;
    }
    
    public String flip(){
	if (Math.random() < bias){
	    upFace = "heads";
	    return "heads";
	}else{
	    upFace = "tails";
	    return "tails";
	}
    }
    
    public String toString(){
	String retString = value;
	retString += " -- ";
	retString += upFace;
	return retString;
    }
    
    public String mine(){
	String retString = value;
	retString += " -- ";
	retString += upFace;
	return retString;
    }
    
    public String yours(){
	String retString = value;
	retString += " -- ";
	retString += upFace;
	return retString;
    }
    
    public String wayne(){
	String retString = value;
	retString += " -- ";
	retString += upFace;
	return retString;
    }
    
    public boolean equals(Coin person){
	if (upFace == upFace){
	    return true;}
	else{
	    return false;}
    }
}// end of class
