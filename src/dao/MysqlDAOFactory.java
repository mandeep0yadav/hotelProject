package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by nirmit on 7/7/17.
 */
public class MysqlDAOFactory extends DAOFactory {

    private static MysqlDAOFactory mysqlDAOFactory;

    public static final String DRIVER=
            "com.mysql.jdbc.Driver";
    public static final String DBURL=
            "jdbc:mysql://localhost:3306/hotelProject?autoReconnect=true&useSSL=false";

    public static final String user = "root";
    public static final String pass = "abcd";

    private MysqlDAOFactory(){
        System.out.println("createing mysql dao for first time");
    }

    public static void setMysqlDAOFactory(){
        if(mysqlDAOFactory == null){
            mysqlDAOFactory = new MysqlDAOFactory();
        }
    }

    public static MysqlDAOFactory getMysqlDAOFactory(){
        if(mysqlDAOFactory == null){
            setMysqlDAOFactory();
        }
        return mysqlDAOFactory;
    }
    // method to create mysql connection connections
    public Connection createConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        // Use DRIVER and DBURL to create a connection
        // Recommend connection pool implementation/usage
        Connection connection = null;
        connection = DriverManager.getConnection(DBURL,user,pass);
        return connection;
    }

    @Override
    public AllottedRoomDAO getAllottedRoomDAO() {
        return null;
    }

    @Override
    public CustomerAddressProofDAO getCustomerAddressDAO() {
        return null;
    }

    @Override
    public CustomerDetailsDAO getCustomerDetailsDAO() {
        return null;
    }

    @Override
    public CustomerStayInformationDAO getCustomerStayInformationDAO() {
        return null;
    }

    @Override
    public EmployeeDetailsDAO getEmployeeDetailsDAO() {
        return null;
    }

    @Override
    public EmployeeLoginDAO getEmployeeLoginDAO() {
        return null;
    }

    @Override
    public RoomDetailsDAO getRoomDetailsDAO() {
        return null;
    }

}
