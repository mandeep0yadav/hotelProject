package sqlTable.MysqlTables;

import dao.DAOFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by nirmit on 10/7/17.
 */
public class CreateEmployeeLevelTaskTable {

    private DAOFactory mysqlDatabase;
    private Connection connection;
    private Statement statement;

    public CreateEmployeeLevelTaskTable(){
        System.out.println("Creating Employee Level Task table");
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

            String sql = "CREATE TABLE EMPLOYEELEVELTASK" +
                    "(level varchar(36) not NULL, " +
                    " task VARCHAR(255) not NULL, " +
                    " PRIMARY KEY ( level ))";

            statement.executeUpdate(sql);
            System.out.println("Created Employee Level Task table");
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
