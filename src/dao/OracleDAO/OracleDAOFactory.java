package dao.OracleDAO;

import dao.DAOFactory;
import dao.DAOInterface.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by nirmit on 10/7/17.
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

}
