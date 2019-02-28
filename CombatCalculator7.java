//William McGrew
//Last Modified: 2/2/16 
//Basic CombatCalculator for text based game
//Declare variable for user input and initialize with a new Scanner object
import java.util.Scanner;

public class CombatCalculator7
{
    public static void main(String[] args)
    {
        
    //declare varibles for monster named "goblin"
    //declare varables for health and attack
    String greeting = "Your are Fighting a Goblin!";
    String monster = "Goblin";
    String hitPoints = "The Monster HP:";
        int monsterHealth = 100;
        int monsterAttack = 15;
    
    //declare variables for hero
    //declare varibles health, attack, and mana.
    String hero = "hero";
    String yourHitpoints = "Your HP:";
    String yourMagic = "Your MP:";
        int heroHealth = 100;
        int heroAttack = 12;
        int heroMana = 0;
    //print monsters and hero's health, attack, and magic.
while(monsterHealth >= 0 && heroHealth >= 0){
        System.out.println(greeting);
        System.out.println(hitPoints + monsterHealth);
        System.out.println(yourHitpoints + heroHealth);
        System.out.println(yourMagic + heroMana);
    System.out.println();//for the extra space.
    //combat menu
        System.out.println("Combat Options:");
    //Print option 1: Sword Attack
        System.out.println("1: Sword Attack");
    //Print option 2: Cast Spell
        System.out.println("2: Cast Spell");
    //Print option 3: Charge Mana
        System.out.println("3: Charge Mana");
    //Print option 4: Run Away
        System.out.println("4: Run Away");
    //Prompt player for action
        System.out.println("What action do you want to perform? ");
    
    //Declare variable for user input as number
    Scanner input = new Scanner(System.in);
    int number;
    number = input.nextInt();
    System.out.println();
    
        //If	player	chose	option	1
        //Calculate	damage	&	update	monster	health	using	subtraction
        //Calculation:	new	monster	health	is	old	monster	health	minus	hero	attack	power
        //print attack	text
        if(number <= 4 && number >=1){
            if(number == 1){
                monsterHealth = monsterHealth - 12;
                System.out.println("You strike the Goblin for 12 sword damage!");
                System.out.println();
            }
            //Else	if	player	chose	option	2,	(check	with	equality	operator)
            //Calculate	damage	&	update	monster	health	using	division
            //Calculation:	new	monster	health	is	old	monster	health	divided	by	two
            else if(number == 2){
                    if(heroMana >= 3){
                    monsterHealth = monsterHealth / 2;
                    heroMana = heroMana - 3;
                    System.out.println("You cast the weaken spell!");
                        System.out.println();
                    }
                    else if(heroMana < 3){
                    System.out.println("You do not have enough Mana.");
                        System.out.println();
                    }
            }
            //Else	if	player	chose	option	2,	(check	with	equality	operator)
            //Calculate	damage	&	update	monster	health	using	division
            //Calculation:	new	monster	health	is	old	monster	health	divided	by	two
            //Else	if	the	player	chose	option	3,	(check	with	equality	operator)
            //Increment	magic	points	and	update	players	magic	using	addition
            //Calculation:	new	hero	magic	is	old	hero	magic	plus	one 		
            //print	chargingmessage
            else if(number == 3){
                heroMana = heroMana + 1;
                System.out.println("You focus and charge your magic power");
                System.out.println();
            }
            else if(number == 4){
                System.out.println("You run away!");
                break;}
                //Monster attacks after every turn
                heroHealth = heroHealth - monsterAttack;
            }
                //Else	if	the	player	chose	option	4,	(check	with	equality	operator)	
                //print	retreat	message
        
    }//while loop true
    //monster
    if(monsterHealth <=0){
        System.out.println("You defeated the monster");}
        else if(heroHealth <= 0){
        System.out.println("You have been killed by the monster");}
            //Else	the	player	chose	incorrectly
                //print	an	error message.4
        
    }
}
