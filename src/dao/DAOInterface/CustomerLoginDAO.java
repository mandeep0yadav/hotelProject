package dao.DAOInterface;

import ValueObjects.CustomerLogin;

/**
 * Created by nirmit on 8/7/17.
 */
public interface CustomerLoginDAO {
    public boolean insertCustomerLogin( CustomerLogin customerLogin);
    public CustomerLogin findCustomerLogin(String custid);
    public boolean deleteCustomerLogin(String custid);
    public boolean updateCustomerLogin(CustomerLogin customerLogin);
}
