public class Monster extends GameCharacter{
    
    int xP;
    
    public Monster(String name, int health, int attackPower, int xP){
        super(name, health, attackPower);
        this.xP = xP;
    }
    
    public Player attack(Player thePlayer){
        thePlayer.takeDamage(attackPower);
        return thePlayer;
    }
    
    public Player takeTurn(Player thePlayer){
        thePlayer.takeDamage(attackPower);
        return thePlayer;
    }
    
    public int getXP(){
        return this.xP;
    }
    
   public String toString(){
       
        String stuff;
        stuff = super.name + ", \nHealth: " + super.health + ", \nAttack Power: " + super.attackPower + ",\nThe XP: " + this.xP;
        return stuff;
        
   }
        
    
}