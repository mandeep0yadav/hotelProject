package controller;

import GUI.CheckInPanel;
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

    private static String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";


    private ReceptionistHomePanel receptionistHomePanel;

    public CheckInController(EmployeeDetails employeeDetails) {

        System.out.println("Controls in checkin Controller...");

        checkInPanel = new CheckInPanel();
        receptionistHomePanel = new ReceptionistHomePanel();
        initialFrame = JframeSingleTon.getjFrame();
        this.employeeDetails = employeeDetails;
        setproperty();

        addComponent();
    }

    private void setproperty() {

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/receptionWritten.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }

    private void addComponent() {

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(checkInPanel.getCheckinpanel());
        //initialFrame.add(receptionistHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }

    public static void validate() {
        if (checkInPanel.editCustomerId.getText().trim().length() > 0 &&
                checkInPanel.editFirstName.getText().trim().length() > 0 &&
                checkInPanel.editLastName.getText().trim().length() > 0 &&
                checkInPanel.editContact.getText().trim().length() > 0 &&
                checkInPanel.editEmail.getText().trim().length() > 0 &&
                checkInPanel.editIdnumber.getText().trim().length() > 0 &&
                checkInPanel.editNumberofguest.getText().trim().length() > 0) {
            try {


                if ((checkInPanel.editContact).getText().trim().length() != 9) {
                    checkInPanel.alertLabel.setText("contact no. should be of 9 digits");

                    //for catch the exception and then apply validation
                    System.out.println(Integer.parseInt((checkInPanel.editContact).getText()));

                } else {

                    //email valdation
                    if (!checkInPanel.editEmail.getText().matches(EMAIL_REGEX)) {
                        checkInPanel.alertLabel.setText("invalid e-mail Id");
                        System.out.println(checkInPanel.editEmail.getText().toString());

                    } else {

                        //Postal code validation
                        try {
                            if ((checkInPanel.editPostalCode).getText().trim().length() != 6) {
                                checkInPanel.alertLabel.setText("postal code should be of 6 digits");

                                //for catch the exception and then apply validation
                                System.out.println(Integer.parseInt((checkInPanel.editPostalCode).getText()));
                            } else {

                                //address proof validation

                                try {
                                    if (String.valueOf(checkInPanel.selectIdtype.getSelectedItem()).equals("Aadhaar Card")) {
                                        System.out.println("aadhar validation par aa rha hai" + checkInPanel.selectIdtype.getSelectedItem());

                                        if (checkInPanel.editIdnumber.getText().trim().length() != 9) {
                                            checkInPanel.alertLabel.setText("Aadhaar card Id must be of 9 digits");
                                        } else {


                                            System.out.println(" validation ok");
                                            checkInPanel.alertLabel.setText("");


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
                                            customerLogin.setCustomerName(checkInPanel.editFirstName.getText() + " " + checkInPanel.editLastName.getText());

                                            //house no
                                            customerDetails.setHouseNumber(Integer.parseInt(checkInPanel.editHouseNumber.getText()));

                                            customerDetails.setStreet(checkInPanel.editStreetAddress.getText());
                                            customerDetails.setCity(checkInPanel.editCity.getText());
                                            customerDetails.setPostalCode(Integer.parseInt(checkInPanel.editPostalCode.getText()));
                                            customerDetails.setCountry(checkInPanel.editCountry.getText());
                                            customerDetails.setDob(new Date((Integer.parseInt(String.valueOf(checkInPanel.dobYearList.getSelectedItem()))), Integer.parseInt(String.valueOf(checkInPanel.dobMonthList.getSelectedItem())), Integer.parseInt(String.valueOf(checkInPanel.dobDayList.getSelectedItem()))));
                                            customerDetails.setEmail(checkInPanel.editEmail.getText());
                                            customerDetails.setMob(Integer.parseInt(checkInPanel.editContact.getText()));
                                            customerDetails.setSex(String.valueOf(checkInPanel.selectGender.getSelectedItem()));


                                            customerAddressProof.setIdType(String.valueOf(checkInPanel.selectIdtype.getSelectedItem()));
                                            customerAddressProof.setIdnumber(Integer.parseInt(checkInPanel.editIdnumber.getText()));


                                            customerStayInformation.setRoomType(String.valueOf(checkInPanel.selectRoomtype.getSelectedItem()));
                                            customerStayInformation.setNumberOfGuest(Integer.parseInt(checkInPanel.editNumberofguest.getText()));
                                            customerStayInformation.setStart_date(new Date(Integer.parseInt(String.valueOf(checkInPanel.checkinYearList.getSelectedItem())), Integer.parseInt(String.valueOf(checkInPanel.checkinMonthList.getSelectedItem())), Integer.parseInt(String.valueOf(checkInPanel.checkinDayList.getSelectedItem()))));
                                            customerStayInformation.setEnd_date((new Date(Integer.parseInt(String.valueOf(checkInPanel.checkoutYearList.getSelectedItem())), Integer.parseInt(String.valueOf(checkInPanel.checkoutMonthList.getSelectedItem())), Integer.parseInt(String.valueOf(checkInPanel.checkoutDayList.getSelectedItem())))));


                                            new MysqlCustomerLoginDAO().insertCustomerLogin(customerLogin);
                                            new MysqlCustomerDetailsDAO().insertCustomerDetails(customerDetails);
                                            new MysqlCustomerAddressProofDAO().insertCustomerAddressProof(customerAddressProof);
                                            new MysqlCustomerStayInformationDAO().insertCustomerStayInformation(customerStayInformation);

                                            //new ReceptionistHomeController(employeeDetails);
                                        }
                                    }
                                } catch (NumberFormatException e) {
                                    checkInPanel.alertLabel.setText("Id Number should be numeric");

                                }


                            }} catch(NumberFormatException e){
                                checkInPanel.alertLabel.setText("postal code should be numeric");
                            }
                        }
                    }
                } catch(NumberFormatException e){
                    checkInPanel.alertLabel.setText("contact no. should be numeric");
                }

            } else{
                //validation for empty texfields
                if (checkInPanel.editCustomerId.getText().trim().length() == 0) {
                    checkInPanel.alertLabel.setText("customerID should not be null");

                } else if (checkInPanel.editFirstName.getText().trim().length() == 0) {
                    checkInPanel.alertLabel.setText("please enter guest's first name");

                } else if (checkInPanel.editLastName.getText().trim().length() == 0) {
                    checkInPanel.alertLabel.setText("please enter guest's last name");
                } else if (checkInPanel.editContact.getText().trim().length() == 0) {
                    checkInPanel.alertLabel.setText("please enter guest's contact number");
                } else if (checkInPanel.editEmail.getText().trim().length() == 0) {
                    checkInPanel.alertLabel.setText("please enter guest's email Id");
                } else if (checkInPanel.editIdnumber.getText().trim().length() == 0) {
                    checkInPanel.alertLabel.setText("please enter guest's Id number");
                } else if (checkInPanel.editNumberofguest.getText().trim().length() == 0) {
                    checkInPanel.alertLabel.setText("please mention the number of quest");
                }
            }
        }

    }

