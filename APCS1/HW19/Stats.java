/*Shafali Gupta
  APCS1 pd8
  HW19 -- gcd 3 ways
  2017-10-19 */    

public class Stats {
    public static int mean(int a, int b) {
	int c = a + b;
	c /= 2;
	return c;
    }
    public static double mean(double a, double b) {
	double c = a + b;
	c /= 2;
	return c;
    }

    public static int max(int a, int b) {
	if (a >= b) {
	    return a;
	}
	return b;
    }
    public static double max(double a, double b) {
	if (a >= b) {
	    return a;
	}
	return b;
    }

    
    public static int max(int a, int b, int c) {
	if (a >= b) {
	    if(a >=c){
		return a;
	    }}//if  a is the max
	if (b>=a){
	    if (b>= c){
		return b;
	    }}//if b is the max
	return c;//if a or b are not, return c 
    } //end of int max

    
    public static double max(double a, double b, double c) {
	if (a >= b) {
	    if(a >=c){
		return a;
	    }}//if  a is the max
	if (b>=a){
	    if (b>= c){
		return b;
	    }}//if b is the max
	return c;//if a or b are not, return c 
    } //end of double max

    public static int geoMean(int a, int b) {
	int c = (a * b);
	return (int) Math.sqrt(c);
    }
    
    public static double geoMean(double a, double b) {
	double c = (a * b);
	return Math.sqrt(c);
    }
    
    public static int geoMean(int a, int b, int c) {
	int d = (a * b* c);
	//return (d);
	return (int)Math.round(Math.pow((double)d, (1/3.0)));
    }//end of int geoMean
    
    public static double geoMean(double a, double b,double c) {
	double d = (a * b* c);
	return (double) Math.round( Math.pow(d, (1/ 3.0)));
    }

    public static int gcd( int a, int b){
	int counter = 1;
	int currentGCD = 0;
	if (max(a,b) != b ) {
	    return gcd(b,a);
	}			
	while (counter <= a){
	    if (a % counter == 0 && b % counter == 0){
		currentGCD = counter;
	    }
	    counter += 1;
	}
	return currentGCD;
    }

    	
    public static int gcdER( int a, int b){
	if (b % a == 0) {
	    return a;
	}
	if (a >= b) {
	    a -= b;
	    if (a==0||b==0) {
		if (a==0) {
		    return b;
		}
		return a;}
	}
    }
}
public static int gcdEW( int a, int b ) {
    if (b % a ==0) {
	return a;
    }
    while (!(a == 0 || b == 0)) {
	if (a > b) {
	    a = a - b;
	}
	else {
	    b = b - a;
	}
    }
    if (a == 0) {
	return b;
    }
    return a;
}			
	
public static void main(String[] args) {
}

