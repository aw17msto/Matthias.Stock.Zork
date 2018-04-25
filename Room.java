package Matthias.Stock;

public class Room {
    private int roomNumber;
    private boolean gru;
    private boolean door;

    double gru2 = Math.random()*24;
    int GruRoom = (int) gru2;
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setGru (boolean gru) {
        this.gru = gru;
    }

    public boolean getGru() {
        return gru;
    }

    public void setDoor (boolean door) {
        this.door = door;
    }

    public boolean getDoor() {
        return door;
    }

    public Room (int roomNumber, boolean gru, boolean door){
        this.roomNumber = roomNumber;
        this.gru = gru;
        this.door = door;
    }

    public int getLeft() {
        if (roomNumber == 12)
            roomNumber = 23;
        else if (roomNumber == 0)
            roomNumber = 11;
        else
            roomNumber -= 1;
        return roomNumber;
    }

    public int getRight() {
        if (roomNumber == 23)
            roomNumber = 12;
        else if (roomNumber == 11)
            roomNumber = 0;
        else
            roomNumber += 1;
        return roomNumber;
    }
    public int getSwitch(){
        if (roomNumber <=11)
            roomNumber += 12;
        else
            roomNumber -= 12;
        return roomNumber;
    }
}