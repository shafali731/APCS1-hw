public class Monster{
    private int HP;
    private int strength;
    public int defense;
    private double attackRating;
    private String name; 

    Monster(){
	HP= 150;
	strength= (int)(Math.random()*20 + 45);
	defense= 20;
	attackRating= 1;
	name = "Mon";;
    }
    public boolean isAlive(){
	return HP>0;
    }
    public int getDefense(){
	return defense;
    }
    public String getName(){
	return name;
    }
    public void lowerHP(int n){
	HP -= n;
    }
    public int attack(Protagonist protagonist){
	int damage = 0; 
	damage= (int)( strength*attackRating) -  protagonist.getDefense();
	protagonist.lowerHP(damage); 
	return damage;
    }

    
    public static void main(String [] args){}
}
