package sqlTable.MysqlTables;

import dao.DAOFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by nirmit on 8/7/17.
 */
public class CreateCustomerAddProofTable {
    private DAOFactory mysqlDatabase;
    private Connection connection;
    private Statement statement;

    public CreateCustomerAddProofTable(){
        System.out.println("Creating Customer Address proof table");
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

            String sql = "CREATE TABLE CUSTOMERADDRESSPROOF" +
                    "(customerid varchar(36) not NULL, " +
                    " idtype VARCHAR(255) not NULL, " +
                    " idnumber INT(20) not NULL, " +
                    " FOREIGN KEY (customerid) REFERENCES CUSTOMERLOGIN(customerid))";

            //addition blob later ***addressScan           blob        not null,***

            statement.executeUpdate(sql);
            System.out.println("Created Customer Address proof table");
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
