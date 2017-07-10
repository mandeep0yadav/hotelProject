package sqlTable;

import dao.DAOFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by nirmit on 8/7/17.
 */
public class CreateRoomDetailsTable {
    private DAOFactory mysqlDatabase;
    private Connection connection;
    private Statement statement;

    public CreateRoomDetailsTable(){
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

            String sql = "CREATE TABLE ROOMDETAILS" +
                    "(roomtype varchar(50) not NULL, " +
                    " room_number_start INT(3) not NULL, " +
                    " room_number_end INT(3) not NULL, " +
                    " baseprice INT(6) not NULL, " +
                    " taxpercent INT(2) not NULL, " +
                    " PRIMARY KEY ( roomtype ))";

            //addition blob later ***addressScan           blob        not null,***

            statement.executeUpdate(sql);
        }catch (SQLException se){
            se.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
