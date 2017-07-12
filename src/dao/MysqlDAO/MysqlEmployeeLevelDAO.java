package dao.MysqlDAO;

import ValueObjects.EmployeeLevel;
import ValueObjects.EmployeeLogin;
import dao.DAOFactory;
import dao.DAOInterface.EmployeeLevelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlEmployeeLevelDAO implements EmployeeLevelDAO {

    DAOFactory mysqlDaoFactory;
    Connection connection;

    @Override
    public boolean insertEmployeeLevel(EmployeeLevel employeeLevel) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "INSERT INTO EMPLOYEELEVEL VALUES(?,?)";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,employeeLevel.getEmpid());
            preparedStatement.setString(2,employeeLevel.getLevel());
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
    public boolean deleteEmployeeLevel(String empid) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "DELETE FROM EMPLOYEELEVEL WHERE empid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,empid);
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
    public EmployeeLevel findEmployeeLevel(String empid) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "SELECT * FROM EMPLOYEELEVEL where empid=?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,empid);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                EmployeeLevel employeeLevel = new EmployeeLevel();
                employeeLevel.setEmpid(resultSet.getString(1));
                employeeLevel.setLevel(resultSet.getString(2));
                return employeeLevel;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return null;
    }

    @Override
    public boolean updateEmployeeLevel(EmployeeLevel employeeLevel) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "UPDATE EMPLOYEELEVEL SET level =? WHERE empid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,employeeLevel.getLevel());
            preparedStatement.setString(2,employeeLevel.getEmpid());
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
