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
    public int insertEmployeeLogin(EmployeeLogin employeeLogin) {
        return 0;
    }

    @Override
    public boolean deleteEmployeeLogin(EmployeeLogin employeeLogin) {
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
            ResultSet results = preparedStatement.executeQuery();
            if(!results.next()) {
                System.out.println("\n\n\nno user");
            }else {
                System.out.println("\n\n\n\nuser found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean updateEmployeeLogin(EmployeeLogin employeeLogin) {
        return false;
    }

}
