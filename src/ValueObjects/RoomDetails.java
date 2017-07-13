package ValueObjects;

/**
 * Created by nirmit on 10/7/17.
 */
public class RoomDetails {
    private String roomtype;
    private int room_number_start;
    private int room_number_end;
    private int baseprice;
    private int taxpercent;

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public int getRoom_number_start() {
        return room_number_start;
    }

    public void setRoom_number_start(int room_number_start) {
        this.room_number_start = room_number_start;
    }

    public int getRoom_number_end() {
        return room_number_end;
    }

    public void setRoom_number_end(int room_number_end) {
        this.room_number_end = room_number_end;
    }

    public int getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(int baseprice) {
        this.baseprice = baseprice;
    }

    public int getTaxpercent() {
        return taxpercent;
    }

    public void setTaxpercent(int taxpercent) {
        this.taxpercent = taxpercent;
    }
}
