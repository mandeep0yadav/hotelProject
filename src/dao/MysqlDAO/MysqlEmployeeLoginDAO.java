package dao.MysqlDAO;

import ValueObjects.EmployeeLogin;
import dao.DAOFactory;
import dao.DAOInterface.EmployeeLoginDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlEmployeeLoginDAO implements EmployeeLoginDAO {

    DAOFactory mysqlDaoFactory;
    Connection connection;

    @Override
    public boolean insertEmployeeLogin(EmployeeLogin employeeLogin) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "INSERT INTO EMPLOYEELOGIN VALUES(?,?)";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,employeeLogin.getEmpid());
            preparedStatement.setString(2,employeeLogin.getPassword());
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
    public boolean deleteEmployeeLogin(EmployeeLogin employeeLogin) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "DELETE FROM EMPLOYEELOGIN WHERE empid = ? AND password = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,employeeLogin.getEmpid());
            preparedStatement.setString(2,employeeLogin.getPassword());
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
    public EmployeeLogin findEmployeeLogin(String userName, String password) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "SELECT * FROM EMPLOYEELOGIN where empid=? and password=?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                EmployeeLogin employeeLogin = new EmployeeLogin();
                employeeLogin.setEmpid(resultSet.getString(1));
                return employeeLogin;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return null;
    }



    @Override
    public boolean updateEmployeeLogin(EmployeeLogin employeeLogin) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "UPDATE EMPLOYEELOGIN SET password=? WHERE empid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,employeeLogin.getPassword());
            preparedStatement.setString(2,employeeLogin.getEmpid());
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
