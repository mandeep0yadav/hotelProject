package dao.MysqlDAO;

import ValueObjects.CustomerLogin;
import ValueObjects.RoomDetails;
import dao.DAOFactory;
import dao.DAOInterface.RoomDetailsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlRoomDetailsDAO implements RoomDetailsDAO {
    DAOFactory mysqlDaoFactory;
    Connection connection;

    @Override
    public boolean insertRoomDetails(RoomDetails roomDetails) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "INSERT INTO ROOMDETAILS VALUES(?,?,?,?,?)";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,roomDetails.getRoomtype());
            preparedStatement.setInt(2,roomDetails.getRoom_number_start());
            preparedStatement.setInt(3,roomDetails.getRoom_number_end());
            preparedStatement.setInt(4,roomDetails.getBaseprice());
            preparedStatement.setInt(5,roomDetails.getTaxpercent());
            if(preparedStatement.execute()) {
                System.out.println("Records inserted in data base");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Unable to insert Records in data base");

        return false;
    }

    @Override
    public boolean deleteRoomDetails(String roomType) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "DELETE FROM ROOMDETAILS WHERE roomtype = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,roomType);
            if(preparedStatement.execute()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return false;
    }

    @Override
    public RoomDetails findRoomDetails(String roomType) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "SELECT * FROM ROOMDETAILS where roomtype=?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,roomType);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                RoomDetails roomDetails = new RoomDetails();
                roomDetails.setRoomtype(resultSet.getString(1));
                roomDetails.setRoom_number_start(resultSet.getInt(2));
                roomDetails.setRoom_number_end(resultSet.getInt(3));
                roomDetails.setBaseprice(resultSet.getInt(4));
                roomDetails.setTaxpercent(resultSet.getInt(5));
                return roomDetails;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found sdf in data base");

        return null;
    }

    @Override
    public boolean updateRoomDetails(RoomDetails roomDetails) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "UPDATE ROOMDETAILS SET room_number_start=?" +
                "room_number_end=?" +
                "baseprice=?" +
                "taxpercent=?" +
                " WHERE roomtype = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setInt(1,roomDetails.getRoom_number_start());
            preparedStatement.setInt(2,roomDetails.getRoom_number_end());
            preparedStatement.setInt(3,roomDetails.getBaseprice());
            preparedStatement.setInt(4,roomDetails.getTaxpercent());
            preparedStatement.setString(5,roomDetails.getRoomtype());
            if(preparedStatement.execute()) {
                System.out.println("Records updated in data base");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return false;
    }
}
