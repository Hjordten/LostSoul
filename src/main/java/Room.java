import java.util.ArrayList;

public class Room {

    //Attributes for room objects
    private String roomGameName;
    private String roomDeveloperName;
    private String roomDescription;
    private boolean roomDanger;

    //used later to connect rooms using get/set directions when moving in game
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    //Two arraylists. One for Items (pickups) and one for enemy (checks if enemy in room == true)
    private ArrayList<Item> itemsArrayList = new ArrayList<>();
    private ArrayList<Enemy> enemyArrayList = new ArrayList<>();

    //Used with func to add obejcts to rooms later
    Item item = new Item();

    //defines object which we can create instances off with set attributes.
    public Room(String roomGameName, String roomDeveloperName, String roomDescription, boolean roomDanger)
    {
        this.roomGameName = roomGameName;
        this.roomDeveloperName = roomDeveloperName;
        this.roomDescription = roomDescription;
        this.roomDanger = roomDanger;
    }


    //Get for room attributes so it can be called outside of class.
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

    //Setter for setting directions to which rooms is connected. Is used when creating map and connects rooms to each other.
    //We write Room room because Room objects is the argument to its direction.
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
    //We write Room because it needs to get directions, based on which room (instance of object)
    public Room getEast()
    {
        return east;
    }


}
