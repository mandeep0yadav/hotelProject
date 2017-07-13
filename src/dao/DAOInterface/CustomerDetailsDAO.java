package dao.DAOInterface;

import ValueObjects.CustomerDetails;

/**
 * Created by nirmit on 8/7/17.
 */
public interface CustomerDetailsDAO {
    public boolean insertCustomerDetails(CustomerDetails customerDetails);
    public CustomerDetails findCustomerDetails(String custid);
    public boolean deleteCustomerDetails(String custid);
    public boolean updateCustomerDetails(CustomerDetails customerDetails);
}
