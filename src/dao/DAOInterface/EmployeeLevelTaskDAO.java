package dao.DAOInterface;

import ValueObjects.EmployeeLevelTask;

/**
 * Created by nirmit on 10/7/17.
 */
public interface EmployeeLevelTaskDAO {
    public int insertEmployeeLevelTask();
    public EmployeeLevelTask findEmployeeLevelTask();
    public boolean updateEmployeeLevelTask();
}
