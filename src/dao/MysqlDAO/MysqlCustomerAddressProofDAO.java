package dao.MysqlDAO;

import ValueObjects.CustomerAddressProof;
import ValueObjects.CustomerLogin;
import dao.DAOFactory;
import dao.DAOInterface.CustomerAddressProofDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by nirmit on 10/7/17.
 */
public class MysqlCustomerAddressProofDAO implements CustomerAddressProofDAO {

    DAOFactory mysqlDaoFactory;
    Connection connection;

    @Override
    public boolean insertCustomerAddressProof(CustomerAddressProof customerAddressProof) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "INSERT INTO CUSTOMERADDRESSPROOF VALUES(?,?,?)";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,customerAddressProof.getCustomerId());
            preparedStatement.setString(2,customerAddressProof.getIdType());
            preparedStatement.setInt(3,customerAddressProof.getIdnumber());
            if(preparedStatement.execute()) {
                System.out.println("Records inserted in data base");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Unable to insert Records in data base");

        return false;
    }

    @Override
    public CustomerAddressProof findCustomerAddressProof(String custid) {
        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "SELECT * FROM CUSTOMERADDRESSPROOF where customerid=?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,custid);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                CustomerAddressProof customerAddressProof = new CustomerAddressProof();
                customerAddressProof.setCustomerId(resultSet.getString(1));
                customerAddressProof.setIdType(resultSet.getString(2));
                customerAddressProof.setIdnumber(resultSet.getInt(3));
                return customerAddressProof;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return null;
    }

    @Override
    public boolean deleteCustomerAddressProof(String custid) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "DELETE FROM CUSTOMERADDRESSPROOF WHERE customerid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,custid);
            if(preparedStatement.execute()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return false;
    }

    @Override
    public boolean updateCustomerAddressProof(CustomerAddressProof customerAddressProof) {

        mysqlDaoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);

        try {
            connection = mysqlDaoFactory.createConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryString = "UPDATE CUSTOMERADDRESSPROOF SET idtype=?" +
                "idnumber=?" +
                " WHERE customerid = ?";
        //set this values using PreparedStatement = ps.executeQuery(queryString)
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            preparedStatement.setString(1,customerAddressProof.getIdType());
            preparedStatement.setInt(2,customerAddressProof.getIdnumber());
            preparedStatement.setString(3,customerAddressProof.getCustomerId());
            if(preparedStatement.execute()) {
                System.out.println("Records updated in data base");
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Records not found in data base");

        return false;
    }
}
