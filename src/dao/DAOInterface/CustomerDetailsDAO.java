package dao.DAOInterface;

import ValueObjects.CustomerDetails;

/**
 * Created by nirmit on 8/7/17.
 */
public interface CustomerDetailsDAO {
    public int insertCustomerDetails();
    public CustomerDetails findCustomerDetails();
}
