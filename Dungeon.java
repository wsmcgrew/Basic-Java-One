/** William McGrew
 * Last modified: 3/6/16
 * Object dungeon**/
 
 public class Dungeon{
     
     private Room thunderDome;
     private Room weightRoom;
     private Room cardioRoom;
     private Room basketBall;
     private Room lockerRoom;
     private Room sauna;
     private Room hIIT;
     
     public Dungeon(){
      this.thunderDome = new Room("ThunderDome");
      this.weightRoom = new Room("Weight Room");
      this.cardioRoom = new Room("Cardio Room");
      this.basketBall =new Room("BasketBall Court");
      this.lockerRoom = new Room("LockerRoom");
      this.sauna = new Room("Sauna");
      this.hIIT = new Room("High Intensity Training Arena");
      
      thunderDome.setExits(basketBall, weightRoom, null, null);
      weightRoom.setExits(lockerRoom, cardioRoom, thunderDome, null);
      cardioRoom.setExits(sauna, null, weightRoom, null);
      basketBall.setExits(null, lockerRoom, null, thunderDome);
      lockerRoom.setExits(hIIT, sauna, basketBall, weightRoom);
      sauna.setExits(null, null, lockerRoom, cardioRoom);
      hIIT.setExits(null, null, null, lockerRoom);
      
      }
     public Room startRoom(){
      return this.thunderDome;
     }//end random start room
     
 }//end public class rooms