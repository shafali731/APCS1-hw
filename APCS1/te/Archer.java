public class Archer extends Protagonist{
        public Archer(){
	super();
	strength += 10;
    }

    public static String about(){
	return "Archer has a higher strength.";
    }
     public void normalize(){
	//	prepares the Protagonist to preform a normal attack
	defense = 40;
	attackRating = 0.4;
}
}
