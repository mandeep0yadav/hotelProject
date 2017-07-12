package dao.MysqlDAO;

import ValueObjects.EmployeeDetails;
import ValueObjects.EmployeeDetails;
import dao.DAOFactory;
import dao.DAOInterface.EmployeeDetailsDAO;

import java.sql.*;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlEmployeeDetailsDAO implements EmployeeDetailsDAO {
    DAOFactory mysqlDaoFactory;
    Connection connection;

    @Override
    public boolean insertEmployeeDetails(EmployeeDetails employeeDetails) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "INSERT INTO EMPLOYEEDETAIL VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,employeeDetails.getEmpid());
            preparedStatement.setString(2,employeeDetails.getName());
            preparedStatement.setInt(3,employeeDetails.getHouseNumber());
            preparedStatement.setString(4,employeeDetails.getStreet());
            preparedStatement.setString(5,employeeDetails.getCity());
            preparedStatement.setInt(6,employeeDetails.getPostalCode());
            preparedStatement.setString(7,employeeDetails.getCountry());
            preparedStatement.setInt(8,employeeDetails.getSalary());
            preparedStatement.setString(9,employeeDetails.getName());
            preparedStatement.setDate(10, (Date) employeeDetails.getDob());
            preparedStatement.setString(11,employeeDetails.getEmail());
            preparedStatement.setInt(12,employeeDetails.getMobile());

            if(preparedStatement.execute()) {
                System.out.println("Records inserted in data base");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Unable to insert Records in data base");

        return true;
    }

    @Override
    public boolean deleteEmployeeDetails(String empid) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "DELETE FROM EMPLOYEEDETAIL WHERE empid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,empid);
            preparedStatement.execute();
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
    public EmployeeDetails findEmployeeDetails(String empid) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "SELECT * FROM EMPLOYEEDETAIL where empid=?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,empid);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                EmployeeDetails employeeDetails = new EmployeeDetails();
                employeeDetails.setName(resultSet.getString(2));
                return employeeDetails;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return null;
    }



    @Override
    public boolean updateEmployeeDetails(EmployeeDetails EmployeeDetails) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "UPDATE EmployeeDetails SET name = ?, " +
                " housenumber = ?, " +
                " street = ?, " +
                " city = ? , " +
                " postalcode = ?, " +
                " country = ?, " +
                " salary = ?, " +
                " dob = ?, " +
                " email = ?, " +
                " mob = ?, " + "WHERE empid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,EmployeeDetails.getName());
            preparedStatement.setInt(2,EmployeeDetails.getHouseNumber());
            preparedStatement.setString(3,EmployeeDetails.getStreet());
            preparedStatement.setString(4,EmployeeDetails.getCity());
            preparedStatement.setInt(5,EmployeeDetails.getPostalCode());
            preparedStatement.setString(6,EmployeeDetails.getCountry());
            preparedStatement.setInt(7,EmployeeDetails.getSalary());
            preparedStatement.setDate(8, (Date) EmployeeDetails.getDob());
            preparedStatement.setString(9,EmployeeDetails.getEmail());
            preparedStatement.setInt(10,EmployeeDetails.getMobile());
            preparedStatement.setString(11,EmployeeDetails.getEmpid());
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
