package dao.DAOInterface;

import ValueObjects.EmployeeDetails;

/**
 * Created by nirmit on 8/7/17.
 */
public interface EmployeeDetailsDAO {
    public boolean insertEmployeeDetails(EmployeeDetails employeeDetails);
    public boolean deleteEmployeeDetails(String empid);
    public EmployeeDetails findEmployeeDetails(String empid);
    public boolean updateEmployeeDetails(EmployeeDetails employeeDetails);
}
