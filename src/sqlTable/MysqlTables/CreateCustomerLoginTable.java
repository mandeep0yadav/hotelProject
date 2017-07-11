package sqlTable.MysqlTables;

import dao.DAOFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by nirmit on 8/7/17.
 */
public class CreateCustomerLoginTable {
    private DAOFactory mysqlDatabase;
    private Connection connection;
    private Statement statement;

    public CreateCustomerLoginTable(){
        System.out.println("Creating Customer login table");
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

            String sql = "CREATE TABLE CUSTOMERLOGIN" +
                    "(customerid varchar(36) not NULL, " +
                    " name VARCHAR(255) not NULL, " +
                    " PRIMARY KEY ( customerid ))";

            statement.executeUpdate(sql);
            System.out.println("Created Customer login table");
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
