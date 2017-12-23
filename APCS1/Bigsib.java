/* Shafali Gupta 
   APCS1 pd08
   HW06 -- On BigSib Individuality and the Elimination of Radio Fuzz
   2017-09-25 */

public class Bigsib{
    private String HelloMsg;
    public Bigsib(){
	HelloMsg = "why hello there,";
    }
    public Bigsib(String newStr){
	HelloMsg =newStr;
    }
    public void setHelloMsg(String newMsg){
	HelloMsg= newMsg;
    }
    public String greet(String arg){
	return (HelloMsg + " " +arg);}
 
}
	    
    
