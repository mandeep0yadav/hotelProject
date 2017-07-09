package sqlTable;

import dao.DAOFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by nirmit on 8/7/17.
 */
public class CreateEmployeeLogInTable {

    private DAOFactory mysqlDatabase;
    private Connection connection;
    private Statement statement;

    public CreateEmployeeLogInTable(){
        System.out.println("Creating Employee Login table");
        mysqlDatabase = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        try {
            connection = mysqlDatabase.createConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        createTable();
    }

    private void createTable() {
        try {
            statement = connection.createStatement();

            String sql = "CREATE TABLE EMPLOYEELOGIN" +
                    "(empid varchar(36) not NULL, " +
                    " password VARCHAR(255) not NULL, " +
                    " PRIMARY KEY ( empid ))";

            statement.executeUpdate(sql);
            System.out.println("Created Employee Login table");
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
