package dao.MysqlDAO;

import dao.*;
import dao.DAOInterface.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by nirmit on 7/7/17.
 */
public class MysqlDAOFactory extends DAOFactory {

    private static MysqlDAOFactory mysqlDAOFactory;
    private Connection connection;

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

        // Use DRIVER and DBURL to create a connection
        // Recommend connection pool implementation/usage
        if(connection == null) {
            try {
                Class.forName(DRIVER);
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
            connection = DriverManager.getConnection(DBURL, user, pass);
        }
        return connection;
    }

}
