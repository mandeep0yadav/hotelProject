package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by nirmit on 7/7/17.
 */
public class OracleDAOFactory extends DAOFactory {

    private static OracleDAOFactory oracleDAOFactory;

    public static final String DRIVER=
            "oracle.jdbc.OracleDriver";
    public static final String DBURL=
            "jdbc:oracle:thin:@localhost:1521:hotelProject";

    public static final String user = "root";
    public static final String pass = "nirmit";

    private OracleDAOFactory(){
        System.out.println("Creating Oracle database for the first time");
    }

    public static void setOracleDAOFactory(){
        if(oracleDAOFactory == null){
            oracleDAOFactory = new OracleDAOFactory();
        }
    }

    public static OracleDAOFactory getOracleDAOFactory(){
        if(oracleDAOFactory == null){
            setOracleDAOFactory();
        }
        return oracleDAOFactory;
    }
    // method to create Oracle connections
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
