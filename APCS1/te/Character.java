public class Character{
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRating;
    
    public boolean isAlive(){
        return (HP>0); 
    }
    public int getDefense(){
	return defense;
    }
    public void lowerHP(int hp_dec){
	HP -= hp_dec;
    }
    public int attack(Character monster){ //a Character is not a Monster, but a Monster is-a Character
	int damage= 0;
	damage= (int) (strength*attackRating - monster.getDefense()); 
	return damage;
    }

        public static void main(String [] args){}
}
