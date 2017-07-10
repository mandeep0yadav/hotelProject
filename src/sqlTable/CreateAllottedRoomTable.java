package sqlTable;

import dao.DAOFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by nirmit on 8/7/17.
 */
public class CreateAllottedRoomTable {
    private DAOFactory mysqlDatabase;
    private Connection connection;
    private Statement statement;

    public CreateAllottedRoomTable(){
        mysqlDatabase = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        try {
            System.out.println("Creating Allotted room table");
            connection = mysqlDatabase.createConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }

        createTable();
    }

    private void createTable() {
        try {
            statement = connection.createStatement();

            String sql = "CREATE TABLE AllottedRoom" +
                    "(customerid varchar(36) not NULL, " +
                    " roomnumber INT(3) not NULL, " +
                    " FOREIGN KEY (customerid) REFERENCES CUSTOMERLOGIN(customerid))";

            //addition blob later ***addressScan           blob        not null,***

            statement.executeUpdate(sql);
            System.out.println("Created Allotted room table");
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
