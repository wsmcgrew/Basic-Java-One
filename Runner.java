/** William McGrew
 * Last Modified: 4/8/16
 * Object orientation of dungeon Adventure game**/
import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.Random;
public class Runner{
    
    public static int playerXP = 0;
    public static Random random = new Random();
    public static Scanner input = new Scanner(System.in);
    public static int xP;
 
     public static void main(String[] args){
         int monsterAttack = random.nextInt(10);
        
        System.out.println("You're touring a gym, what is the name of your character?");
        String playerName = input.nextLine();
        int playerAttack;
        
        System.out.println("You're starting to workout so you want to tour a gym. ");
        System.out.println("So you visit 'SwolePatrol 504' to check it out");
        System.out.println("but it looks tough, want to tour anyways? (Yes or No) ");
        String tour = input.nextLine();
    
        Dungeon d = new Dungeon();
        Room currRoom = d.startRoom();
        //Player thePlayer = new Player(playerName, 100, playerAttack, 0);
        
    do{
         playerAttack = random.nextInt(30);
         Player thePlayer = new Player(playerName, 100, playerAttack, 0);
            if(tour.equals("yes") || tour.equals("Yes")){
                
                System.out.printf("You're in the %s, what direction do you want to go? %n", currRoom.getDescription());
                System.out.printf("You can go %s %n", currRoom.getExits());
                String option = input.nextLine();
                
                boolean generateMonster = probability();
                
                if(generateMonster == true){
                        String monsters[] = {"THE, Cardio Beast", "PowerLifter Jim", "Bill 'TheBoss' Jones", "James, from accounting",
                        "Ole Dude From Down the Street"};
                        int monsterFinder = random.nextInt(5);
                        Monster theMonster = new Monster(monsters[monsterFinder], 100, monsterAttack, 20);
                        enterCombat(thePlayer, theMonster);}
            
                
             if(option.equals("north") || option.equals("North")){
                 if(currRoom != null)
                        currRoom = currRoom.getNorth();
                }
               else if(option.equals("east") || option.equals("East")){
                   if(currRoom != null)
                        currRoom = currRoom.getEast();

                }
                else if(option.equals("west") || option.equals("West")){
                    if(currRoom != null)
                        currRoom = currRoom.getWest();
                }
                else if(option.equals("south") || option.equals("South")){
                    if(currRoom != null)
                        currRoom = currRoom.getSouth();
                }
                else if(option.equals("q") || option.equals("Q")){
                    break;
                }
                
                
            }    
  }while(!(tour.equals("no") || tour.equals("No")));
  
  System.out.println("You left Swole Patrol 504, Thanks for visiting!!");
}

   public static boolean probability(){
       int chance; 
       
       chance = random.nextInt(10);
       if(chance <= 2){
               return true;}
        else{
                return false;}
           
   }
   
   public static void enterCombat(Player thePlayer, Monster theMonster){

        while(thePlayer.getHealth() > 0 && theMonster.getHealth() > 0){
            System.out.printf("You have entered a PT challenge with %s, you can Attack, become strong, or charge mana?", theMonster.name);
            System.out.printf("%n1- attack %n 2- Eat your spinach, become super strong %n 3- rest up a little %n 4- Run Away??! \n");
            System.out.println(thePlayer);
            System.out.println("Your current XP is: " + xP);
            System.out.println();
            System.out.println(theMonster);
            
           int choices = input.nextInt();
           
        if(choices == 1){
            thePlayer.attack(theMonster);
            theMonster.takeTurn(thePlayer);}
               else if(choices == 2){
                    thePlayer.castSpell(theMonster);
                    theMonster.takeTurn(thePlayer);}
                else if(choices == 3){
                    thePlayer.chargeMana();
                    theMonster.takeTurn(thePlayer);}
                else if(choices == 4){
                    System.out.println("You ran away!!!");
                    break;}
                else if(choices > 4){
                    System.out.println("You gave an invalid command");}//end combat
            
        }//end while
        if(thePlayer.health > 0){
            System.out.println("You out lifted that guy");
            xP = theMonster.getXP();
        }
        else{
            System.out.println("That guy out lifted you!");}
           
   }//end combat method

}//end class Party Runner