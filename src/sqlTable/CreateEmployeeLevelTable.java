package sqlTable;

import dao.DAOFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by nirmit on 10/7/17.
 */
public class CreateEmployeeLevelTable {

    private DAOFactory mysqlDatabase;
    private Connection connection;
    private Statement statement;

    public CreateEmployeeLevelTable(){
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

            String sql = "CREATE TABLE EMPLOYEELEVEL" +
                    "(empid varchar(36) not NULL, " +
                    " level VARCHAR(36) not NULL, " +
                    " FOREIGN KEY (level) REFERENCES ROOMDETAILS(level),"+
                    " FOREIGN KEY (empid) REFERENCES CUSTOMERLOGIN( empid ))";

            statement.executeUpdate(sql);
            System.out.println("Created Employee Login table");
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
