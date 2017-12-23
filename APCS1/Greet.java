/*Shafali Gupta
APCS1 pd8
HW02 --  Howdy, <Very interesting Person>!
2017-09-13 */

public class Greet {
    public static void main(String [] args) {
	String greeting;
	Bigsib richard = new Bigsib("Word up");
	Bigsib grizz = new Bigsib("Hey ya");
	Bigsib dotCom = new Bigsib("Sup");
	Bigsib tracy = new Bigsib("Salutations");
	greeting = richard.greet("freshman");
	System.out.println(greeting);
	greeting = tracy.greet("Dr. Spaceman");
	System.out.println(greeting);
	greeting = grizz.greet("Kong Fooey");
	System.out.println(greeting);
	greeting = dotCom.greet("mom");
	System.out.println(greeting);				   
    }
}
