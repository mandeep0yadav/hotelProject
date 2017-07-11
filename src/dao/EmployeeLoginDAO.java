package dao;

import ValueObjects.EmployeeLogin;

/**
 * Created by nirmit on 8/7/17.
 */
public interface EmployeeLoginDAO {
    public int insertEmployeeLogin();
    public boolean deleteEmployeeLogin();
    public EmployeeLogin findEmployeeLogin();
    public boolean updateEmployeeLogin();
}
