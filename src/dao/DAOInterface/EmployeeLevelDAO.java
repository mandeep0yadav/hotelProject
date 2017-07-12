package dao.DAOInterface;

import ValueObjects.EmployeeLevel;

/**
 * Created by nirmit on 10/7/17.
 */
public interface EmployeeLevelDAO {
    public boolean insertEmployeeLevel(EmployeeLevel employeeLevel);
    public boolean deleteEmployeeLevel(String empid);
    public EmployeeLevel findEmployeeLevel(String empid);
    public boolean updateEmployeeLevel(EmployeeLevel employeeLevel);
}
