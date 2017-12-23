public class Wizard extends Protagonist{
        public Wizard(){
	super();
	HP += 10;
    }

    public static String about(){
	return "Wizard has a higher HP.";
    }
     public void normalize(){
	//	prepares the Protagonist to preform a normal attack
	defense = 40;
	attackRating = 0.4;
}
}
