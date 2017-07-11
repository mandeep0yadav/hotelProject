package dao.MysqlDAO;

import ValueObjects.EmployeeDetails;
import dao.DAOInterface.EmployeeDetailsDAO;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlEmployeeDetailsDAO implements EmployeeDetailsDAO {
    @Override
    public int insertEmployeeDetails() {
        return 0;
    }

    @Override
    public boolean deleteEmployeeDetails() {
        return false;
    }

    @Override
    public EmployeeDetails findEmployeeDetails() {
        return null;
    }

    @Override
    public boolean updateEmployeeDetails() {
        return false;
    }
}
