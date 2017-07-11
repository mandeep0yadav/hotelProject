package ValueObjects;

/**
 * Created by nirmit on 10/7/17.
 */
public class EmployeeLogin {

    private String empid;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmpid() {

        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }
}
