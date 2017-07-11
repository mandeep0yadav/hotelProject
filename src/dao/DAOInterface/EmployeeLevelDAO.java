package dao.DAOInterface;

import ValueObjects.EmployeeLevel;

/**
 * Created by nirmit on 10/7/17.
 */
public interface EmployeeLevelDAO {
    public int insertEmployeeLevel();
    public boolean deleteEmployeeLevel();
    public EmployeeLevel findEmployeeLevel();
    public boolean updateEmployeeLevel();
}
