import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

public class Architect {

    public static void main(String[] args) {
        /*Bedroom room = new BedroomBuilder().setDimension(new Dimension(200, 100)).setCeilingHeight(132).setFloorNumber(2).setWallColor(Color.yellow).setNumberOfWindows(2).setNumberOfDoors(1).setIsDouble(true).setHasEnsuite(true).createBedroom();
        Bedroom room2 = new BedroomBuilder().setDimension(new Dimension(300, 250)).createBedroom();*/
        ArrayList<Room> rooms = new RoomListBuilder().addList()
                .addRoom().setFloorNumber(2).addRoomToList()
                .addRoom().setFloorNumber(1).addRoomToList()
                .buildList();
        House house = new House(rooms);
    }
}
