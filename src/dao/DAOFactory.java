package dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by nirmit on 7/7/17.
 */
public abstract class DAOFactory
{

    // List of DAO types supported by the factory
    public static final int ORACLE = 1;
    public static final int MYSQL = 2;

    // implement these methods.
    //in respective database class

    public abstract AllottedRoomDAO getAllottedRoomDAO();
    public abstract CustomerAddressProofDAO getCustomerAddressDAO();
    public abstract CustomerDetailsDAO getCustomerDetailsDAO();
    public abstract CustomerStayInformationDAO getCustomerStayInformationDAO();
    public abstract EmployeeDetailsDAO getEmployeeDetailsDAO();
    public abstract EmployeeLoginDAO getEmployeeLoginDAO();
    public abstract RoomDetailsDAO getRoomDetailsDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {

        switch (whichFactory) {
            case ORACLE    :
                return new OracleDAOFactory();
            case MYSQL     :
                 return MysqlDAOFactory.getMysqlDAOFactory();
            default        :
                return null;
        }
    }

    public abstract Connection createConnection() throws SQLException;
}
