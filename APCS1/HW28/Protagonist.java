public class Protagonist{
    private String name;
    private int HP;
    private int strength;
    public int defense;
    private double attackRating;

    public Protagonist(){
	name = "Pro"; 
	HP= 125;
	strength= 100;
	defense= 40;
	attackRating= 0.4;
    }
    public Protagonist(String n){
	this(); 
	name = n;}
    public boolean isAlive(){
        return (HP>0); 
    }
    public int getDefense(){
	return defense;
    }
    public String getName(){
	return name;
    }
    public void	lowerHP(int hp_dec){
	HP -= hp_dec;
    }
    public int attack(Monster monster){
	int damage= 0;
	damage= (int) (strength*attackRating - monster.getDefense()); 
	return damage;
    }
    public void specialize(){
	//prepares the Protagonist to preform a special attack
	defense -= 5;
	attackRating += 5;
    }
    public void normalize(){
	//prepares the Protagonist to preform a normal attack
	defense = 40;
	attackRating = 0.4;
    }
	
    public static void main(String [] args){}
} 
