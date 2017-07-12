package dao.DAOInterface;

import ValueObjects.EmployeeLevelTask;

/**
 * Created by nirmit on 10/7/17.
 */
public interface EmployeeLevelTaskDAO {
    public boolean insertEmployeeLevelTask(EmployeeLevelTask employeeLevelTask);
    public boolean deleteEmployeeLevelTask(String level);
    public EmployeeLevelTask findEmployeeLevelTask(String level);
    public boolean updateEmployeeLevelTask(EmployeeLevelTask employeeLevelTask);
}
