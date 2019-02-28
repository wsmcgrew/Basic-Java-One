

public class Player extends GameCharacter{
    
    private int mana;
    
    public Player(String name, int health, int attackPower, int mana){
        
        super(name, health, attackPower);
        this.mana = mana;
    }//end player constructor
    
    public Monster attack(Monster theMonster){
        theMonster.takeDamage(attackPower);
        return theMonster;
    }
    
    public Monster castSpell(Monster theMonster){
        if(this.mana >= 3){
            theMonster.health = theMonster.health / 2;
            this.mana = this.mana - 3;}
        else{
            System.out.println("Sorry, you don't have enought mana");}
            
        return theMonster;
        }
    
    public void chargeMana(){
        this.mana += 3;
    }
    
    public Monster takeTurn(Monster theMonster){
        theMonster.takeDamage(attackPower);
        return theMonster;
    }
    
    public int getMana(){
        return this.mana;
    }
    
    public String toString(){
       String stuff;
        stuff = super.name + ", \nHealth:" + super.health + ", \nAttack:" + super.attackPower + ",\nCurrent Power Level: " + this.mana;
        return stuff;
    
}
    
}