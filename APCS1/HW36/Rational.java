//Shafali Gupta
//APCS1 pd8
//HW36 - Be Rational
// 11/20/17


public class Rational{
    private int numerator;
    private int denominator;

    public Rational(){
	//this();
	//	Rational val = new Rational();
	numerator=0;
	denominator=1;

	//val= numerator/ denominator;
    }

    public  Rational(int num, int deno){
        this();

	if (deno==0){
	    System.out.println("Invalid denominator inputed. Value set to 0/1");
	    //Rational();
	}

        else{
	    //Rational();
	    numerator=num;
	    denominator=deno;
	    ///val= num/deno;
	}
    }

    public static int gcd(int a, int b){
	if (a>b){
	    return gcd(b,a);
	}
	    
	if (b % a == 0){
	    return a;
	}
	else if (a == 0){
	    return b;
	}
	return gcd(b-a,a);
    }    
    public int gcd (){
	return gcd(numerator, denominator);
    }
    
    public void add (Rational num){
	numerator = (this.numerator *  num.denominator) +
	    (num.numerator * this.denominator);
	denominator = (this.denominator * num.denominator);
    }
    public void subtract (Rational num){
	numerator = (this.numerator *  num.denominator) -
	    (num.numerator * this.denominator);
	denominator = (this.denominator * num.denominator);
    }
    public void reduce (){
	int gcd = gcd();
	numerator /= gcd;
	denominator /=  gcd;
    }
    public int compareTo(Rational num){
	int ThisNum = this.numerator * num.denominator;
	int ParamNum = num.numerator * this.denominator;
	    
	if (ThisNum == ParamNum){
	    return 0;
	}
	else if (ThisNum < ParamNum){
	    return -1;
	}
	else{
	    return 1;
	}
    }
    //methods
    public String toString(){
	return "" + numerator + " / "+ denominator;
    }
    public double floatValue(){
	return (double) numerator / denominator;
    }
    public void multiply (Rational num){
	numerator = this.numerator *  num.numerator;
	denominator = this.denominator * num.denominator;
    }
    public void divide (Rational num){
	numerator = this.numerator * num.denominator;
	denominator = this.denominator * num.numerator;
    }
    public static void main(String[] args){
	Rational r = new Rational(2,3); //Stores the rational number 2/3
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	r.add(s);  
	System.out.println(r);
	t.reduce(); 
	System.out.println(t);
	System.out.println(r.compareTo(t));
	System.out.println(t.compareTo(r));
	r.subtract(s);
	System.out.println(r);
	System.out.println(r.gcd());
	r.reduce();
	System.out.println(r);
    }
    
}// end of class Rational


