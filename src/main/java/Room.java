import java.util.ArrayList;

public class Room {

    //Attributes for room object
    private String roomGameRegion;
    private String roomGameName;
    private String roomDeveloperName;
    private String roomDescription;
    private boolean roomDanger;

    //used later to connect rooms using get/set directions when moving in game
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    /*
    //Two arraylists. One for Items (pickups) and one for enemy (checks if enemy in room == true)
    private ArrayList<Item> itemsArrayList = new ArrayList<>();
    private ArrayList<Enemy> enemyArrayList = new ArrayList<>();




    //Used with func to add instances of objects to rooms later
    Item item = new Item();
     */

    //defines object which we can create instances off with set attributes.
    public Room(String roomGameRegion,String roomGameName, String roomDeveloperName, String roomDescription, boolean roomDanger)
    {
        this.roomGameRegion = roomGameRegion;
        this.roomGameName = roomGameName;
        this.roomDeveloperName = roomDeveloperName;
        this.roomDescription = roomDescription;
        this.roomDanger = roomDanger;
    }


    //Get for room attributes so it can be called outside of class.
    public String getRoomGameRegion()
    {
        return roomGameRegion;
    }
    public String getRoomGaneName(){
        return roomGameName;
    }

    public String getRoomDeveloperName(){
        return roomDeveloperName;
    }

    public String getRoomDescription(){
        return roomDescription;
    }

    public boolean getRoomDanger(){
        return roomDanger;
    }

    //Setter for setting directions to which  rooms is connected. Is used when creating map and connects rooms to each other.
    //We write Room room because Room objects is the argument to its direction.
    //Also used when player succesfully moves and uses the set direction, to set and move the player the correct way.
    public void setEast(Room room)
    {
        this.east = east;
    }

    public void setNorth(Room room)
    {
        this.north = north;
    }

    public void setSouth(Room room)
    {
        this.south = south;
    }

    public void setWest(Room room)
    {
        this.west = west;
    }

    //get for directions in rooms
    //We write Room because it needs to get directions, based on which room (instance of object).
    //Also used when player tries to move around, where it uses get, to get which directions is moveable.
    public Room getEast()
    {
        return east;
    }

    public Room getNorth()
    {
        return north;
    }

    public Room getSouth()
    {
        return south;
    }

    public Room getWest()
    {
        return west;
    }

/*
    //method to add instances of different objects to different ArrayList
    public void addItem (Item item) //Needs to create Item class os it know where to add item.
    {
        itemsArrayList.add(item);
    }

    public void addEnemy(Enemy enemy) //Needs to create enemy class os it know where to add enemy.
    {
        enemyArrayList.add(enemy);
    }

    public void addMeleeWeapon()
*/


}
