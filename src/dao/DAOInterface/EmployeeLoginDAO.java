package dao.DAOInterface;

import ValueObjects.EmployeeLogin;

/**
 * Created by nirmit on 8/7/17.
 */
public interface EmployeeLoginDAO {
    public int insertEmployeeLogin(EmployeeLogin employeeLogin);
    public boolean deleteEmployeeLogin(EmployeeLogin employeeLogin);
    public EmployeeLogin findEmployeeLogin(String userName,String password);
    public boolean updateEmployeeLogin(EmployeeLogin employeeLogin);
}
