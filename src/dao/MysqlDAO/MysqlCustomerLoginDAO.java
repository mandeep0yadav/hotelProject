package dao.MysqlDAO;

import ValueObjects.CustomerLogin;
import ValueObjects.CustomerLogin;
import dao.DAOFactory;
import dao.DAOInterface.CustomerLoginDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlCustomerLoginDAO implements CustomerLoginDAO {
    DAOFactory mysqlDaoFactory;
    Connection connection;

    @Override
    public boolean insertCustomerLogin(CustomerLogin CustomerLogin) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "INSERT INTO CUSTOMERLOGIN VALUES(?,?)";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,CustomerLogin.getCustomerid());
            preparedStatement.setString(2,CustomerLogin.getCustomerName());
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
    public boolean deleteCustomerLogin(String custid) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "DELETE FROM CUSTOMERLOGIN WHERE customerid = ?";
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
    public CustomerLogin findCustomerLogin(String custid) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "SELECT * FROM CUSTOMERLOGIN where customerid=?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,custid);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                CustomerLogin CustomerLogin = new CustomerLogin();
                CustomerLogin.setCustomerid(resultSet.getString(1));
                CustomerLogin.setCustomerName(resultSet.getString(2));
                return CustomerLogin;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return null;
    }



    @Override
    public boolean updateCustomerLogin(CustomerLogin CustomerLogin) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "UPDATE CUSTOMERLOGIN SET name=? WHERE customerid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,CustomerLogin.getCustomerid());
            preparedStatement.setString(2,CustomerLogin.getCustomerName());
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
