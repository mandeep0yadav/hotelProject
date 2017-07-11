package sqlTable.MysqlTables;

import dao.DAOFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by nirmit on 8/7/17.
 */
public class CreateCustomerStayInformationTable {
    private DAOFactory mysqlDatabase;
    private Connection connection;
    private Statement statement;

    public CreateCustomerStayInformationTable(){
        System.out.println("Creating Customer stay information table");
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

            String sql = "CREATE TABLE CUSTOMERSTAYINFORMATION" +
                    "(customerid varchar(36) not NULL, " +
                    " start_date DATE not NULL, " +
                    " end_date DATE not NULL, " +
                    " noguest INT(2) not NULL, " +
                    " roomtype VARCHAR(50) not NULL, " +
                    " FOREIGN KEY (roomtype) REFERENCES ROOMDETAILS(roomtype),"+
                    " FOREIGN KEY (customerid) REFERENCES CUSTOMERLOGIN(customerid))";

            statement.executeUpdate(sql);
            System.out.println("Created Customer stay information table");
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
