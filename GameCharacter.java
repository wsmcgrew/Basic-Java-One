/**Shane McGrew
 * 4/20/16
 * Super Class Game Characters**/
 
 public class GameCharacter{
     
     protected String name;
     protected int health;
     protected int attackPower;
     
     public GameCharacter(String name, int health, int attackPower){
         this.name = name;
         this.health = health;
         this.attackPower = attackPower;
     }// end constructor
     
     public void takeDamage(int damage){
         this.health -= damage;
     }
     
     public String getName(){
         return name;}
         
     public int getHealth(){
         return health;}
         
     public int getAttackPower(){
         return attackPower;}
     
     public String toString(){
     
         String stuff;
         stuff = this.name + "," + this.health + "," + this.attackPower;
         return stuff;
     }//end to string
         
 }//end class Game Character