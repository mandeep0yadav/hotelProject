package dao.DAOInterface;

import ValueObjects.RoomDetails;

/**
 * Created by nirmit on 8/7/17.
 */
public interface RoomDetailsDAO {
    public int insertRoomDetails();
    public boolean deleteRoomDetails();
    public RoomDetails findRoomDetails();
    public boolean updateRoomDetails();
}
