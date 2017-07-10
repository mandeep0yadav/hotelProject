package sqlTable;

import dao.DAOFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by nirmit on 8/7/17.
 */
public class CreateEmployeeDetailTable {
    private DAOFactory mysqlDatabase;
    private Connection connection;
    private Statement statement;

    public CreateEmployeeDetailTable(){
        System.out.println("Creating Employee Details table");
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

            String sql = "CREATE TABLE EMPLOYEEDETAIL" +
                    "(empid varchar(36) not NULL, " +
                    " name VARCHAR(255) not NULL, " +
                    " housenumber INT(5), " +
                    " street VARCHAR(50), " +
                    " city VARCHAR(50) , " +
                    " postalcode INT(10), " +
                    " country VARCHAR(50), " +
                    " salary INT(8) not NULL, " +
                    " dob DATE not NULL, " +
                    " email VARCHAR(255) not NULL, " +
                    " mob INT(10) not NULL, " +
                    " FOREIGN KEY (empid) REFERENCES EMPLOYEELOGIN(empid))";

            statement.executeUpdate(sql);
            System.out.println("Created Employee details table");
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
