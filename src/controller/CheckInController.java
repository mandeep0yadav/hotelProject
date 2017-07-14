package controller;

import GUI.CheckInPanel;
import GUI.CheckOutPanel;
import GUI.IssueBillPanel;
import GUI.ReceptionistHomePanel;
import ValueObjects.*;
import dao.MysqlDAO.MysqlCustomerAddressProofDAO;
import dao.MysqlDAO.MysqlCustomerDetailsDAO;
import dao.MysqlDAO.MysqlCustomerLoginDAO;
import dao.MysqlDAO.MysqlCustomerStayInformationDAO;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;
import java.util.Date;

/**
 * Created by Dell on 7/12/2017.
 */
public class CheckInController {


    private JFrame initialFrame;
    private static CheckInPanel checkInPanel;
    public static EmployeeDetails employeeDetails;

    private ReceptionistHomePanel receptionistHomePanel;

    public CheckInController(EmployeeDetails employeeDetails){

        System.out.println("Controls in checkin Controller...");

        checkInPanel = new CheckInPanel();
        receptionistHomePanel = new ReceptionistHomePanel();
        initialFrame = JframeSingleTon.getjFrame();
        this.employeeDetails = employeeDetails;
        setproperty();

        addComponent();
    }

    private void setproperty(){

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/receptionWritten.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(checkInPanel.getCheckinpanel());
        //initialFrame.add(receptionistHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }

    public static void validate(){
        CustomerLogin customerLogin = new CustomerLogin();
        CustomerDetails customerDetails = new CustomerDetails();
        CustomerStayInformation customerStayInformation = new CustomerStayInformation();
        CustomerAddressProof customerAddressProof = new CustomerAddressProof();


        //custid
        customerLogin.setCustomerid(checkInPanel.editCustomerId.getText());
        customerAddressProof.setCustomerId(checkInPanel.editCustomerId.getText());
        customerDetails.setCustomerId(checkInPanel.editCustomerId.getText());
        customerStayInformation.setCustomerid(checkInPanel.editCustomerId.getText());

        //name
        customerLogin.setCustomerName(checkInPanel.editFirstName.getText()+" "+checkInPanel.editLastName.getText());

        //house no
        customerDetails.setHouseNumber(Integer.parseInt(checkInPanel.editHouseNumber.getText()));

        customerDetails.setStreet(checkInPanel.editStreetAddress.getText());
        customerDetails.setCity(checkInPanel.editCity.getText());
        customerDetails.setPostalCode(Integer.parseInt(checkInPanel.editPostalCode.getText()));
        customerDetails.setCountry(checkInPanel.editCountry.getText());
        customerDetails.setDob(new Date((Integer.parseInt(String.valueOf(checkInPanel.dobYearList.getSelectedItem()))),Integer.parseInt(String.valueOf(checkInPanel.dobMonthList.getSelectedItem())),Integer.parseInt(String.valueOf(checkInPanel.dobDayList.getSelectedItem()))));
        customerDetails.setEmail(checkInPanel.editEmail.getText());
        customerDetails.setMob(Integer.parseInt(checkInPanel.editContact.getText()));
        customerDetails.setSex(String.valueOf(checkInPanel.selectGender.getSelectedItem()));


        customerAddressProof.setIdType(String.valueOf(checkInPanel.selectIdtype.getSelectedItem()));
        customerAddressProof.setIdnumber(Integer.parseInt(checkInPanel.editIdnumber.getText()));


        customerStayInformation.setRoomType(String.valueOf(checkInPanel.selectRoomtype.getSelectedItem()));
        customerStayInformation.setNumberOfGuest(Integer.parseInt(checkInPanel.editNumberofguest.getText()));
        customerStayInformation.setStart_date(new Date(Integer.parseInt(String.valueOf(checkInPanel.checkinYearList.getSelectedItem())),Integer.parseInt(String.valueOf(checkInPanel.checkinMonthList.getSelectedItem())),Integer.parseInt(String.valueOf(checkInPanel.checkinDayList.getSelectedItem()))));
        customerStayInformation.setEnd_date((new Date(Integer.parseInt(String.valueOf(checkInPanel.checkoutYearList.getSelectedItem())),Integer.parseInt(String.valueOf(checkInPanel.checkoutMonthList.getSelectedItem())),Integer.parseInt(String.valueOf(checkInPanel.checkoutDayList.getSelectedItem())))));


        new MysqlCustomerLoginDAO().insertCustomerLogin(customerLogin);
        new MysqlCustomerDetailsDAO().insertCustomerDetails(customerDetails);
        new MysqlCustomerAddressProofDAO().insertCustomerAddressProof(customerAddressProof);
        new MysqlCustomerStayInformationDAO().insertCustomerStayInformation(customerStayInformation);

        new ReceptionistHomeController(employeeDetails);
    }

}
