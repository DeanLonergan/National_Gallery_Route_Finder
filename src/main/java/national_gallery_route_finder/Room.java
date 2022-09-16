package national_gallery_route_finder;

public class Room {

    private final String roomName;
    private final int xCoord;
    private final int yCoord;

    public Room(String roomName, int xCoord, int yCoord) {
        this.roomName = roomName;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getXCoord() {
        return xCoord;
    }

    public int getYCoord(){
        return yCoord;
    }

}
