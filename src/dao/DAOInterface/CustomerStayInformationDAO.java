package dao.DAOInterface;

import ValueObjects.CustomerStayInformation;

/**
 * Created by nirmit on 8/7/17.
 */
public interface CustomerStayInformationDAO {
    public int insertCustomerStayInformation();
    public CustomerStayInformation findCustomerStayInformation();
    public boolean updateCustomerStayInformation();
}
