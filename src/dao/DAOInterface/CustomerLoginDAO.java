package dao.DAOInterface;

import ValueObjects.CustomerLogin;

/**
 * Created by nirmit on 8/7/17.
 */
public interface CustomerLoginDAO {
    public int insertCustomerLogin();
    public CustomerLogin findCustomerLogin();
}
