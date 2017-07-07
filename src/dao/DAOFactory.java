package dao;

/**
 * Created by nirmit on 7/7/17.
 */
public abstract class DAOFactory
{

    // List of DAO types supported by the factory
    public static final int ORACLE = 1;
    public static final int MYSQL = 2;

    // implement these methods.
    //public abstract CustomerDAO getCustomerDAO();
    //public abstract AccountDAO getAccountDAO();
   // public abstract OrderDAO getOrderDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {

        switch (whichFactory) {
            case ORACLE    :
                return new OracleDAOFactory();
            case MYSQL     :
                return new MysqlDAOFactory();
            default        :
                return null;
        }
    }
}
