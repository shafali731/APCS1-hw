public class Skeleton extends Monster{
    public Monster(){
	super();
	HP += 10;
    }

    public static String about(){
	return "Skeleton has a higher HP.";
    }
}
