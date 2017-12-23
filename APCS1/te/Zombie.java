public class Zombie extends Monster{
        public Zombie(){
	super();
	strength += 10;
    }

    public static String about(){
	return "Zombie has a higher strength.";
    }
}
