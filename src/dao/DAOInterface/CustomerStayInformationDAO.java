package dao.DAOInterface;

import ValueObjects.CustomerStayInformation;

/**
 * Created by nirmit on 8/7/17.
 */
public interface CustomerStayInformationDAO {
    public boolean insertCustomerStayInformation(CustomerStayInformation customerStayInformation);
    public boolean deleteCustomerStayInformation(String custid);
    public CustomerStayInformation findCustomerStayInformation(String custid);
    public boolean updateCustomerStayInformation(CustomerStayInformation customerStayInformation);
}
