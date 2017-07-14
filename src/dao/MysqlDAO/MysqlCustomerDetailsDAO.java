package dao.MysqlDAO;

import ValueObjects.CustomerDetails;
import ValueObjects.CustomerLogin;
import dao.DAOFactory;
import dao.DAOInterface.CustomerDetailsDAO;

import java.sql.*;

/**
 * Created by nirmit on 10/7/17.
 */
public class MysqlCustomerDetailsDAO implements CustomerDetailsDAO {
    DAOFactory mysqlDaoFactory;
    Connection connection;

    @Override
    public boolean insertCustomerDetails(CustomerDetails customerDetails) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "INSERT INTO CUSTOMERDETAILS VALUES(?,?,?,?,?,?,CURDATE(),?,?,?)";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,customerDetails.getCustomerId());
            preparedStatement.setInt(2,customerDetails.getHouseNumber());
            preparedStatement.setString(3,customerDetails.getStreet());
            preparedStatement.setString(4,customerDetails.getCity());
            preparedStatement.setInt(5,customerDetails.getPostalCode());
            preparedStatement.setString(6,customerDetails.getCountry());
            //preparedStatement.setDate(7, (Date) customerDetails.getDob());
            preparedStatement.setString(7,customerDetails.getSex());
            preparedStatement.setString(8,customerDetails.getEmail());
            preparedStatement.setInt(9,customerDetails.getMob());
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
    public CustomerDetails findCustomerDetails(String custid) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "SELECT * FROM CUSTOMERDEATILS where customerid=?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,custid);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                CustomerDetails customerDetails = new CustomerDetails();
                customerDetails.setCustomerId(resultSet.getString(1));
                customerDetails.setHouseNumber(resultSet.getInt(2));
                customerDetails.setStreet(resultSet.getString(3));
                customerDetails.setCity(resultSet.getString(4));
                customerDetails.setPostalCode(resultSet.getInt(5));
                customerDetails.setCountry(resultSet.getString(6));
                customerDetails.setDob(resultSet.getDate(7));
                customerDetails.setSex(resultSet.getString(8));
                customerDetails.setEmail(resultSet.getString(9));
                customerDetails.setMob(resultSet.getInt(10));
                return customerDetails;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return null;
    }

    @Override
    public boolean deleteCustomerDetails(String custid) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "DELETE FROM CUSTOMERDEATILS WHERE customerid = ?";
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
    public boolean updateCustomerDetails(CustomerDetails customerDetails) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "UPDATE CUSTOMERDEATILS SET housenumber=?" +
                "street=?" +
                "city=?" +
                "postalcode=?" +
                "country=?" +
                "dob=?" +
                "sex=?" +
                "email=?" +
                "mob=?" +
                " WHERE customerid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setInt(1,customerDetails.getHouseNumber());
            preparedStatement.setString(2,customerDetails.getStreet());
            preparedStatement.setString(3,customerDetails.getCity());
            preparedStatement.setInt(4,customerDetails.getPostalCode());
            preparedStatement.setString(5,customerDetails.getCountry());
            preparedStatement.setDate(6, (Date) customerDetails.getDob());
            preparedStatement.setString(7,customerDetails.getSex());
            preparedStatement.setString(8,customerDetails.getEmail());
            preparedStatement.setInt(9,customerDetails.getMob());
            preparedStatement.setString(10,customerDetails.getCustomerId());
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
