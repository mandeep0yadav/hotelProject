package ValueObjects;

/**
 * Created by nirmit on 10/7/17.
 */
public class AllottedRoom {
    private String customerid;
    private int roomNumber;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
