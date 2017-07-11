package dao;

import ValueObjects.EmployeeDetails;

/**
 * Created by nirmit on 8/7/17.
 */
public interface EmployeeDetailsDAO {
    public int insertEmployeeDetails();
    public boolean deleteEmployeeDetails();
    public EmployeeDetails findEmployeeDetails();
    public boolean updateEmployeeDetails();
}
