package ValueObjects;

/**
 * Created by nirmit on 10/7/17.
 */
public class CustomerLogin {
    private String customerid;
    private String customerName;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
