package dao.MysqlDAO;

import ValueObjects.RoomDetails;
import dao.DAOInterface.RoomDetailsDAO;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlRoomDetailsDAO implements RoomDetailsDAO {
    @Override
    public int insertRoomDetails() {
        return 0;
    }

    @Override
    public boolean deleteRoomDetails() {
        return false;
    }

    @Override
    public RoomDetails findRoomDetails() {
        return null;
    }

    @Override
    public boolean updateRoomDetails() {
        return false;
    }
}
