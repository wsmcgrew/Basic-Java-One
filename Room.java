/**William McGrew
 * Last Modified; 4/6/16
 * Object of Rooms**/
 import java.lang.StringBuilder;
 public class Room{
     
     private String descriptions;
     private Room north;
     private Room east;
     private Room west;
     private Room south;
     
     public Room(String description){
         this.descriptions = description;
         this.north = null;
         this.east = null;
         this.west = null;
         this.west = null;
     }//end constructor
     
     public void setNorth(Room north){
      this.north = north;}
      
     public void setEast(Room east){
      this.east = east;}
      
     public void setWest(Room west){
      this.west = west;}
      
     public void setSouth(Room south){
      this.south = south;}
      
     public void setExits(Room north, Room east, Room west, Room south){
      this.north = north;
      this.east = east;
      this.west = west; 
      this.south = south;
     }
     public Room getNorth(){
      return this.north;}
      
     public Room getEast(){
      return this.east;}
      
     public Room getWest(){
      return this.west;}
      
     public Room getSouth(){
      return this.south;
     }
     
     public String getDescription(){
      return this.descriptions;
     }
     
     public String getExits(){
      StringBuilder stringBuilder = new StringBuilder();
      
      if(this.north != null) {stringBuilder.append("North ");}
      if(this.east != null) {stringBuilder.append("East ");}
      if(this.west != null) {stringBuilder.append("West ");}
      if(this.south != null) {stringBuilder.append("South ");}
      return stringBuilder.toString();
     }
     
     public String toString(){
      return descriptions;
     }
 }// end class rooms