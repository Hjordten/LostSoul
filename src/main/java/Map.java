public class Map {

    //We weite Room because Room objects needs to attributes when creating objects.
    //Starter room tells game which room player starts in, when Map class is building the map. This is static and.
    //Current room will be changeable since it needs to update every time player succesfully moves.
    private Room starterRoom;
    private Room currentRoom;

    //We create get for instances of room. It can then tell Room class where player currently is.
    //Room can then set the correct directions player can move and use get, to get all the moveable directions.
    private Room getStarterRoom()
    {
        return starterRoom;
    }

    private Room getCurrentRoom()
    {
        return currentRoom;
    }

    /*
    MIGHT BE USELESS CODE

    public void setCurrentRoom(Room room){
        currentRoom = room;
    }
     */

    public Map()
    {
        buildMap();
    }


    public void buildMap(){
    Room room1 = new Room
            ("Region of: Hells deep",
            "Home",
            "Starter room",
            "Your own hellish house filled with emptiness",
            false);
    Room room2 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room3 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room4 = new Room(
            "",
            "",
            "",
            "",
            true);
    Room room5 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room6 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room7 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room8 = new Room(
            "",
            "",
            "",
            "",
            true);
    Room room9 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room10 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room11 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room12 = new Room(
            "",
            "",
            "",
            "",
            true);
    Room room13 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room14 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room15 = new Room(
            "",
            "",
            "",
            "",
            true);
    Room room16 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room17 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room18 = new Room(
            "",
            "",
            "",
            "",
            false);
    Room room19 = new Room(
            "",
            "",
            "",
            "",
            true);
    Room room20 = new Room(
            "",
            "",
            "",
            "",
            false);
    }




}
