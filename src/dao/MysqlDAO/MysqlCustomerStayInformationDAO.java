package dao.MysqlDAO;

import ValueObjects.CustomerStayInformation;
import dao.DAOInterface.CustomerStayInformationDAO;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlCustomerStayInformationDAO implements CustomerStayInformationDAO {
    @Override
    public int insertCustomerStayInformation() {
        return 0;
    }

    @Override
    public CustomerStayInformation findCustomerStayInformation() {
        return null;
    }

    @Override
    public boolean updateCustomerStayInformation() {
        return false;
    }
}
