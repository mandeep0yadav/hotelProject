package dao.DAOInterface;

import ValueObjects.RoomDetails;

/**
 * Created by nirmit on 8/7/17.
 */
public interface RoomDetailsDAO {
    public boolean insertRoomDetails(RoomDetails roomDetails);
    public boolean deleteRoomDetails(String roomType);
    public RoomDetails findRoomDetails(String roomType);
    public boolean updateRoomDetails(RoomDetails roomDetails);
}
