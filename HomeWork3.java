/**William McGrew
 * Last Modified: 2/24/16
 * Build hero, generate random monster
    Combat Calculator**/
 import java.util.Scanner;
 import java.security.SecureRandom;
 
 public class HomeWork3
 {
//declaring hero initial Health, Attack, and Magic
    static int hHealth = 0;
    static int hAttack = 0;
    static int hMagic = 0;
//declaring variables used in more than one method   
    static int number;
    static int statpoint = 20;
//declarig variable used for storing the random monster generation method    
    static String monsta;  
    static int mHealth;
    static int mAttack;
//building objects used throught the class      
    static Scanner input = new Scanner(System.in);
    static SecureRandom randomNumbers = new SecureRandom();
//enum 
    public enum Status { YOU_LOST, YOU_WON_SON };
      
   
   public static void main(String[] args){
// build enum in main
    Status gameStatus;// you beat the Monsta or You've been defeated
//begin while statement for hero build 
    int option = 0;
        while(statpoint > 0){
            option = HeroBuilder();
                if(option >=1 && option <= 4){
                    if(option == 1){
                        hHealth += 10;
                        statpoint -= 1;}
                    else if(option == 2){
                        hAttack += 1;
                        statpoint -= 1;}
                    else if(option == 3){
                        hMagic +=3;
                        statpoint -= 1;}
            }//end if statement
            if(option > 4 || option < 1){
                System.out.println("\n You picked the wrong answer boss");}
        }//end while statment for hero build
//start random monster generation via method invocation
        RandomMonster();
        System.out.printf("You have encounterd a %s%n", monsta);
//start combat algorithums utilizing 2 seperate methods   

        int trying = 0;
         while(hHealth > 0 && mHealth > 0){
            System.out.printf("%n%s: Attack: %d  HP: %d%n", monsta, mAttack, mHealth);
            System.out.printf("%nHero: HP: %d,Attack: %d MP: %d%n%n", hHealth, hAttack, hMagic); 
                trying = CombatMain(); //method to handle the Combat prompt and user input
        int container;
            container = Fight(trying);
                if(container >= 1 && container <= 4){
                    if(container == 1){
                        System.out.printf("%s hit you for %d%n", monsta, mAttack);}
                    else if(container == 2 && hMagic > 3){
                        System.out.println("You casted the Weaken spell");}
                    else if(container == 3){
                        System.out.println("You carged your Magic!");}
                    else if (container == 4){
                        System.out.println("You ran away!!");
                        break;}
                hHealth -= mAttack;
        }// end if statement
    }//end while
    
        if(hHealth <= 0){
            gameStatus = Status.YOU_LOST;
            System.out.println("YOU LOST");}
        else if(mHealth <= 0){
            gameStatus = Status.YOU_WON_SON;
            System.out.println("YOU WON SON");}
}//end method main

//start iteration one of combat iteration
    public static int HeroBuilder(){
        int option;
            System.out.printf("Health: %d, Attack: %d, Magic: %d%n%n", hHealth, hAttack, hMagic);
            System.out.println("********");
            System.out.println("1) +10 Health ");
            System.out.println("2) +1 Attack ");
            System.out.println("3) +3 Magic ");
            System.out.println("********");
            
            System.out.printf("You have %d points to spend: %n", statpoint);
            
            option = input.nextInt();
            
        return option;

    }//end hero builder method
    
    public static int CombatMain(){
        int combatOption;
        
        System.out.println("********************");
        System.out.println("Combat Options: ");
        System.out.println("1) Hit 'em ");
        System.out.println("2) Do some Magic ");
        System.out.println("3) Charge da Magic ");
        System.out.println("4) Run away ");
        System.out.println("********************\n");
    
        System.out.println("What's your choice? \n");
        combatOption = input.nextInt();
        
        return combatOption;
    }//end main combat 
    
    public static int Fight(int container){
        if(container >= 1 && container <= 3){
            if(container == 1){
                mHealth = mHealth - (hAttack + randomNumbers.nextInt(hAttack));}
            else if(container == 2 && hMagic >=3){
                 mHealth = mHealth / 2;
                 hMagic -= 3;}
            else if (container == 3){
                hMagic += 3;}
        }
        return container;
    }//end fight method

//random monster Generator
    public static void RandomMonster(){
        int monsterS;
        monsterS = 1 + randomNumbers.nextInt(3);
        
            if(monsterS >=1 && monsterS <= 3){
                if (monsterS == 1){
                monsta = "Gobbly ";
                mAttack = 8 + randomNumbers.nextInt(4);
                mHealth = 75 + randomNumbers.nextInt(24);}
                    else if (monsterS == 2){
                    monsta = "Orkey ";
                    mAttack = 12 + randomNumbers.nextInt(4);
                    mHealth = 100 + randomNumbers.nextInt(24);}
                        else if (monsterS == 3){
                        monsta = "Toll Troll ";
                        mAttack = 15 + randomNumbers.nextInt(4);
                        mHealth = 150 + randomNumbers.nextInt(59);
                        }          }//end if statement

    }// end method random Monster
                
        
 }// end class HomeWork3