package dao;

import dao.DAOInterface.*;
import dao.MysqlDAO.MysqlDAOFactory;
import dao.OracleDAO.OracleDAOFactory;

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

    public static DAOFactory getDAOFactory(int whichFactory) {

        switch (whichFactory) {
            case ORACLE    :
                 return OracleDAOFactory.getOracleDAOFactory();
            case MYSQL     :
                 return MysqlDAOFactory.getMysqlDAOFactory();
            default        :
                return null;
        }
    }

    public abstract Connection createConnection() throws SQLException;
}
