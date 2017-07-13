package dao.DAOInterface;

import ValueObjects.CustomerAddressProof;

/**
 * Created by nirmit on 8/7/17.
 */
public interface CustomerAddressProofDAO {
    public boolean insertCustomerAddressProof(CustomerAddressProof customerAddressProof);
    public CustomerAddressProof findCustomerAddressProof(String custid);
    public boolean deleteCustomerAddressProof(String custid);
    public boolean updateCustomerAddressProof(CustomerAddressProof customerAddressProof);
}
