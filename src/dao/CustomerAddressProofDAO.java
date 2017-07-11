package dao;

import ValueObjects.CustomerAddressProof;

/**
 * Created by nirmit on 8/7/17.
 */
public interface CustomerAddressProofDAO {
    public int insertCustomerAddressProoof();
    public CustomerAddressProof findCustomerAddressProof();

}
