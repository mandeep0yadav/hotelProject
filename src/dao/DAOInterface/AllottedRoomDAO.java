package dao.DAOInterface;

import ValueObjects.AllottedRoom;

/**
 * Created by nirmit on 8/7/17.
 */
public interface AllottedRoomDAO {
    public boolean insertAllottedRoom(AllottedRoom allottedRoom);
    public boolean deleteAllottedRoom(String custid);
    public AllottedRoom findAllottedRoom(String custid);
    public boolean updateAllottedRoom(AllottedRoom allottedRoom);
}
