/**William McGrew                                                                              
 * Last modified: 3/21/16
 * A text based game to "explore" a given area (a friends party)**/
 import java.util.Scanner;
 public class AFriendsParty{
   //declared constants and declaration of descriptions array
     public static final int NORTH = 0;
     public static final int EAST = 1;
     public static final int WEST = 2;
     public static final int SOUTH = 3;
     public static int currRoom = 0; 
     public static String[] descriptions = new String[7];
     
     public static void main(String[] args){
    //build scanner
         Scanner input = new Scanner(System.in);

    //introduction prompt to set up the setting (via seperate method)
         PrintGretting();
    //user input to initialize the loop variable to be true or false
         String yesOrNo = input.nextLine();
    //description array initialization     
         descriptions[0] = "You are in the foyer, \n you can go north or east.";
         descriptions[1] = "You are in in the Beer pong tournament room, \nyour options are north, east, or west.";
         descriptions[2] = "You are in the Kings Cup drinking room, \nyou can go North or West";
         descriptions[3] = "You are in the Keg Room, \nyou can go south or east";
         descriptions[4] = "You are with DJ Nazzztyys' room, \nyou can go north, east, south, or west";
         descriptions[5] = "You are with the Squares in the chill room, \nyou can go south, east or west";
         descriptions[6] = "You are in the Backyard where the corn hole is, \nyou can only go south";

    //Exits that will modify the CurrentRooom variable and print the discription
         
    //set up a string sentiniel of -1
    int sentinel = -1;
    
    do{
      if(yesOrNo.equals("y")){
        System.out.println(descriptions[currRoom]);
        String option = input.nextLine();
        
        //start selection statements for interactions of what direction to go. 
            if(option.equals("n")){
              if(getRoomDirection(currRoom, NORTH) == sentinel){
                  System.out.println("You can't go that direction");}
                else{
                  currRoom = getRoomDirection(currRoom, NORTH);
                  System.out.println("You choose to go North");}
                }
                
              if(option.equals("e")){
                    if(getRoomDirection(currRoom, EAST) == sentinel){
                      System.out.println("You can't go that direction");}
                      else{
                      currRoom = getRoomDirection(currRoom, EAST);
                      System.out.println("You choose to go East.");}
                }
                   
                if(option.equals("w")){
                    if(getRoomDirection(currRoom, WEST) == sentinel){
                      System.out.println("You can't go that direction");}
                      else{
                      currRoom = getRoomDirection(currRoom,WEST);
                      System.out.println("You choose to go West");}
                      }
                   
                if(option.equals("s")){
                    if(getRoomDirection(currRoom, SOUTH) == sentinel){
                    System.out.println("You can't go that direction");}
                    else{
                      currRoom = getRoomDirection(currRoom, SOUTH);
                      System.out.println("You choose to go South");}
                    }
                if(option.equals("q")){
                  System.out.println("You left the party to go home and watch Netflix");
                  break;
                }
      }// END if statement asking if user wants to look for him
    }while(!(yesOrNo.equals("n")));//*****end while
    
        System.out.println("You're home by yourself now!");
     }//end main method
     
     //int arrays to clean up Main method
     public static int getRoomDirection(int a, int b){
        int aRoom;
        int[][] exits = {{3,1,-1,-1},{4,2,0,-1},{5,-1,1,-1},{-1,4,-1,0},{6,5,3,1},{-1,-1,4,2},{-1,-1,-1,4}};
        
        aRoom = exits[a][b];
        
        return aRoom;
     }//end getRoomDirection Method
     
     //gretting pompt to print the opening gretting
     public static void PrintGretting(){
         System.out.println("You came with your friend to a party, but, you don't know anybody");
         System.out.println("Of course, he left you high and dry \n");
         System.out.println("BUUUT, he just happens to find your pack of Cigs, and you want one");
         System.out.println("So you go look for your, apparently, magic friend!! Do you want to go look for him (Y or N)?");         
     }//end method print gretting

 }// end class