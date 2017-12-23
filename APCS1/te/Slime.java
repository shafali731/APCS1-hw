public class Slime extends Monster{
    public Monster(){
	super();
	defense += 10;
    }

    public static String about(){
	return "Slime has a higher defense.";
    }
}
