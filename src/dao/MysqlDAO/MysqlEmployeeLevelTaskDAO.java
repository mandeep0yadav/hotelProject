package dao.MysqlDAO;

import ValueObjects.EmployeeLevelTask;
import ValueObjects.EmployeeLogin;
import dao.DAOFactory;
import dao.DAOInterface.EmployeeLevelTaskDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlEmployeeLevelTaskDAO implements EmployeeLevelTaskDAO {

    DAOFactory mysqlDaoFactory;
    Connection connection;

    @Override
    public boolean insertEmployeeLevelTask(EmployeeLevelTask employeeLevelTask) {
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
            preparedStatement.setString(1,employeeLevelTask.getLevel());
            preparedStatement.setString(2,employeeLevelTask.getTask());
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
    public boolean deleteEmployeeLevelTask(String level) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "DELETE FROM EMPLOYEELEVELTASK WHERE level = ? ";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,level);
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
    public EmployeeLevelTask findEmployeeLevelTask(String level) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "SELECT * FROM EMPLOYEELEVELTASK where level=?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,level);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                EmployeeLevelTask employeeLevelTask  = new EmployeeLevelTask();
                employeeLevelTask.setLevel(resultSet.getString(1));
                employeeLevelTask.setTask(resultSet.getString(2));
                return employeeLevelTask;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return null;
    }



    @Override
    public boolean updateEmployeeLevelTask(EmployeeLevelTask employeeLevelTask) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "UPDATE EMPLOYEELEVELTASK SET task=? WHERE level = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,employeeLevelTask.getTask());
            preparedStatement.setString(2,employeeLevelTask.getLevel());
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
