package dao.MysqlDAO;

import ValueObjects.CustomerLogin;
import ValueObjects.CustomerStayInformation;
import dao.DAOFactory;
import dao.DAOInterface.CustomerStayInformationDAO;

import java.sql.*;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlCustomerStayInformationDAO implements CustomerStayInformationDAO {
    DAOFactory mysqlDaoFactory;
    Connection connection;

    @Override
    public boolean insertCustomerStayInformation(CustomerStayInformation customerStayInformation) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "INSERT INTO CUSTOMERSTAYINFORMATION VALUES(?,CURDATE(),CURDATE(),?,?)";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,customerStayInformation.getCustomerid());
            //preparedStatement.setDate(2, (Date) customerStayInformation.getStart_date());
            //preparedStatement.setDate(3, (Date) customerStayInformation.getEnd_date());
            preparedStatement.setInt(2,customerStayInformation.getNumberOfGuest());
            preparedStatement.setString(3,customerStayInformation.getRoomType());
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
    public boolean deleteCustomerStayInformation(String custid) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "DELETE FROM CUSTOMERSTAYINFORMATION WHERE customerid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,custid);
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
    public CustomerStayInformation findCustomerStayInformation(String custid) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "SELECT * FROM CUSTOMERSTAYINFORMATION where customerid=?";
        //System.out.println(custid);
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,custid);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                CustomerStayInformation customerStayInformation = new CustomerStayInformation();
                customerStayInformation.setCustomerid(resultSet.getString(1));
                customerStayInformation.setStart_date(resultSet.getDate(2));
                customerStayInformation.setEnd_date(resultSet.getDate(3));
                customerStayInformation.setNumberOfGuest(resultSet.getInt(4));
                customerStayInformation.setRoomType(resultSet.getString(5));
                return customerStayInformation;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found wqd in data base");

        return null;
    }

    @Override
    public boolean updateCustomerStayInformation(CustomerStayInformation customerStayInformation) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "UPDATE CUSTOMERSTAYINFORMATION SET start_date =?" +
                "end_date=?" +
                "noguest=?" +
                "roomtype=?" +
                " WHERE customerid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setDate(1, (Date) customerStayInformation.getStart_date());
            preparedStatement.setDate(2, (Date) customerStayInformation.getEnd_date());
            preparedStatement.setInt(3,customerStayInformation.getNumberOfGuest());
            preparedStatement.setString(4,customerStayInformation.getRoomType());
            preparedStatement.setString(5,customerStayInformation.getCustomerid());
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
