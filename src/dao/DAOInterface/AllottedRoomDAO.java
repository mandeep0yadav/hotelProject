package dao.DAOInterface;

import ValueObjects.AllottedRoom;

/**
 * Created by nirmit on 8/7/17.
 */
public interface AllottedRoomDAO {
    public int insertAllottedRoom();
    public boolean deleteAllottedRoom();
    public AllottedRoom findAllottedRoom();
}
