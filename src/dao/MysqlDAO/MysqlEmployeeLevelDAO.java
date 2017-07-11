package dao.MysqlDAO;

import ValueObjects.EmployeeLevel;
import dao.DAOInterface.EmployeeLevelDAO;

/**
 * Created by nirmit on 11/7/17.
 */
public class MysqlEmployeeLevelDAO implements EmployeeLevelDAO {
    @Override
    public int insertEmployeeLevel() {
        return 0;
    }

    @Override
    public boolean deleteEmployeeLevel() {
        return false;
    }

    @Override
    public EmployeeLevel findEmployeeLevel() {
        return null;
    }

    @Override
    public boolean updateEmployeeLevel() {
        return false;
    }
}
