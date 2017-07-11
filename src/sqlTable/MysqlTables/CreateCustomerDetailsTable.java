package sqlTable.MysqlTables;

import dao.DAOFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by nirmit on 8/7/17.
 */
public class CreateCustomerDetailsTable {
    private DAOFactory mysqlDatabase;
    private Connection connection;
    private Statement statement;

    public CreateCustomerDetailsTable(){
        System.out.println("Creating Customer Details table");
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

            String sql = "CREATE TABLE CUSTOMERDETAILS" +
                    "(customerid varchar(36) not NULL, " +
                    " name VARCHAR(255) not NULL, " +
                    " housenumber INT(5), " +
                    " street VARCHAR(50), " +
                    " city VARCHAR(50) , " +
                    " postalcode INT(10), " +
                    " country VARCHAR(50), " +
                    " dob DATE not NULL, " +
                    " email VARCHAR(255) not NULL, " +
                    " mob INT(10) not NULL, " +
                    " FOREIGN KEY (customerid) REFERENCES CUSTOMERLOGIN(customerid))";

            statement.executeUpdate(sql);
            System.out.println("Created Customer details table");
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
