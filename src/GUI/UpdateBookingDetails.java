package GUI;

import listeners.UpdateBookingDetailsButtonListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Himanshu on 13-07-2017.
 */
public class UpdateBookingDetails {

    private JPanel updateBookingDetailsPanel;

    //  All components in panel

    //Declaring all labels

    private JLabel updateBookingDetailsLabel;
    private JLabel customerLabel;
    private JLabel customeridlabel;
    private JLabel firstNameLabel, lastNameLabel;
    private JLabel genderLabel;
    private JLabel dobLabel;
    private JLabel contactLabel;
    private JLabel emailLabel;
    private JLabel housenumberLabel, streetAddressLabel, countryLabel, cityLabel, postalCodeLabel;

    private JLabel addressproofLabel;
    private JLabel idtypeLabel;
    private JLabel idnumberLabel;

    private JLabel stayinfoLabel;
    private JLabel checkindateLabel;
    private JLabel checkoutdateLabel;
    private JLabel roomtypeLabel;
    private JLabel numberofguestLabel;


    //Declaring all  text fields

    public JTextField editCustomerId;
    public JTextField editFirstName, editLastName;
    public JTextField editEmail, editContact;
    public JTextField editCountry, editCity, editPostalCode;
    public JTextField editHouseNumber;
    public JTextField editIdnumber;
    public JTextField editNumberofguest;
    public JTextField editStreetAddress;

    //Declaring all comboBox

    public JComboBox selectGender;
    public JComboBox dobDayList, dobMonthList, dobYearList;


    public JComboBox selectIdtype;
    public JComboBox selectRoomtype;
    public JComboBox checkinDayList, checkinMonthList, checkinYearList;
    public JComboBox checkoutDayList, checkoutMonthList, checkoutYearList;

    private JSeparator updateBookingDetailsLabelSeparator;
    private JSeparator customerLabelSeparator, addressproofLabelSeparator, stayinfoLabelSeparator;


    private JButton cancelButton;
    private JButton updateBookingButton;

    private UpdateBookingDetailsButtonListener updateBookingDetailsButtonListener;


    public UpdateBookingDetails() {

        System.out.println("Creating Update Booking Details Panel...");

        updateBookingDetailsPanel = new JPanel();

        updateBookingDetailsLabel = new JLabel();
        updateBookingDetailsLabelSeparator = new JSeparator();

        customerLabel = new JLabel();
        customerLabelSeparator = new JSeparator();

        customeridlabel = new JLabel();
        firstNameLabel = new JLabel();
        lastNameLabel = new JLabel();

        genderLabel = new JLabel();
        dobLabel = new JLabel();
        contactLabel = new JLabel();

        emailLabel = new JLabel();
        housenumberLabel = new JLabel();
        streetAddressLabel = new JLabel();
        countryLabel = new JLabel();

        cityLabel = new JLabel();
        postalCodeLabel = new JLabel();

        editCustomerId = new JTextField();
        editFirstName = new JTextField();
        editLastName = new JTextField();


        editContact = new JTextField();
        editEmail = new JTextField();
        editCountry = new JTextField();

        editCity = new JTextField();
        editPostalCode = new JTextField();
        editHouseNumber = new JTextField();
        editStreetAddress = new JTextField();

        dobDayList = new JComboBox();
        dobMonthList = new JComboBox();
        dobYearList = new JComboBox();
        selectGender = new JComboBox();

        addressproofLabel = new JLabel();
        addressproofLabelSeparator = new JSeparator();

        idtypeLabel = new JLabel();
        idnumberLabel = new JLabel();

        editIdnumber = new JTextField();
        selectIdtype = new JComboBox();

        stayinfoLabel = new JLabel();
        stayinfoLabelSeparator = new JSeparator();

        checkindateLabel = new JLabel();
        checkoutdateLabel = new JLabel();
        roomtypeLabel = new JLabel();
        numberofguestLabel = new JLabel();

        editNumberofguest = new JTextField();

        checkinDayList = new JComboBox();
        checkinMonthList = new JComboBox();
        checkinYearList = new JComboBox();

        checkoutDayList = new JComboBox();
        checkoutMonthList = new JComboBox();
        checkoutYearList = new JComboBox();

        selectRoomtype = new JComboBox();


        cancelButton = new JButton();
        updateBookingButton = new JButton();

        updateBookingDetailsButtonListener = new UpdateBookingDetailsButtonListener();

        setProperty();

        setBounds();

        addComponentToPanel();

        addListeners();

        System.out.println("Update Booking Details Panel Created...");

    }


    private void setProperty() {

        updateBookingDetailsPanel.setLayout(null);
        updateBookingDetailsPanel.setOpaque(false);

        updateBookingDetailsLabel.setText("Update Booking");
        updateBookingDetailsLabel.setFont(new Font("comic sans", Font.BOLD, 22));
        updateBookingDetailsLabel.setForeground(Color.red);

        customerLabel.setText("Customer Details");
        customerLabel.setFont(new Font("comic sans", Font.BOLD, 15));
        customerLabel.setForeground(Color.blue);

        customeridlabel.setText("Customer-id");
        customeridlabel.setFont(new Font("comic sans", Font.BOLD, 13));
        customeridlabel.setForeground(Color.white);

        firstNameLabel.setText("First Name");
        firstNameLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        firstNameLabel.setForeground(Color.white);

        lastNameLabel.setText("Last Name");
        lastNameLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        lastNameLabel.setForeground(Color.white);

        genderLabel.setText("Gender");
        genderLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        genderLabel.setForeground(Color.white);

        dobLabel.setText("DOB");
        dobLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        dobLabel.setForeground(Color.white);

        emailLabel.setText("Email ID");
        emailLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        emailLabel.setForeground(Color.white);

        contactLabel.setText("Contact No.");
        contactLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        contactLabel.setForeground(Color.white);

        housenumberLabel.setText("House Number");
        housenumberLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        housenumberLabel.setForeground(Color.white);


        streetAddressLabel.setText("Street Address");
        streetAddressLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        streetAddressLabel.setForeground(Color.white);

        countryLabel.setText("Country");
        countryLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        countryLabel.setForeground(Color.white);

        cityLabel.setText("City");
        cityLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        cityLabel.setForeground(Color.white);

        postalCodeLabel.setText("Postal Code");
        postalCodeLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        postalCodeLabel.setForeground(Color.white);


        addressproofLabel.setText("Address proof details");
        addressproofLabel.setFont(new Font("comic sans", Font.BOLD, 15));
        addressproofLabel.setForeground(Color.blue);

        idtypeLabel.setText("Id Type");
        idtypeLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        idtypeLabel.setForeground(Color.white);

        idnumberLabel.setText("ID Number");
        idnumberLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        idnumberLabel.setForeground(Color.white);


        stayinfoLabel.setText("Stay Information");
        stayinfoLabel.setFont(new Font("comic sans", Font.BOLD, 15));
        stayinfoLabel.setForeground(Color.blue);

        checkindateLabel.setText("Check-in");
        checkindateLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        checkindateLabel.setForeground(Color.white);

        checkoutdateLabel.setText("Check-out");
        checkoutdateLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        checkoutdateLabel.setForeground(Color.white);

        roomtypeLabel.setText("Room Type");
        roomtypeLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        roomtypeLabel.setForeground(Color.white);

        numberofguestLabel.setText("Number of Guest");
        numberofguestLabel.setFont(new Font("comic sans", Font.BOLD, 13));
        numberofguestLabel.setForeground(Color.white);

        String[] genderType = {"Male", "Female"};
        selectGender.setModel(new DefaultComboBoxModel(genderType));

        String[] idType = {"Aadhaar Card", "Pan Card", "Driving License"};
        selectIdtype.setModel(new DefaultComboBoxModel(idType));

        String[] roomtype = {"Luxury", "Semi-Luxury", "Normal"};
        selectRoomtype.setModel(new DefaultComboBoxModel(roomtype));


        Integer[] day = new Integer[31];
        for (int i = 0; i < day.length; i++) {
            day[i] = i + 1;
        }

        Integer[] month = new Integer[12];
        for (int i = 0; i < month.length; i++) {
            month[i] = i + 1;
        }

        Integer[] year = new Integer[100];
        for (int i = 0; i < year.length; i++) {
            year[i] = i + 1918;
        }

        dobDayList.setModel(new DefaultComboBoxModel(day));
        dobMonthList.setModel(new DefaultComboBoxModel(month));
        dobYearList.setModel(new DefaultComboBoxModel(year));
        dobYearList.setSelectedItem(1990);

        checkinDayList.setModel(new DefaultComboBoxModel(day));
        checkinMonthList.setModel(new DefaultComboBoxModel(month));
        checkinYearList.setModel(new DefaultComboBoxModel(year));
        checkinYearList.setSelectedItem(1990);

        checkoutDayList.setModel(new DefaultComboBoxModel(day));
        checkoutMonthList.setModel(new DefaultComboBoxModel(month));
        checkoutYearList.setModel(new DefaultComboBoxModel(year));
        checkoutYearList.setSelectedItem(1990);


        cancelButton.setText("Cancel");
        cancelButton.setFont(new Font("Lithos Pro Regular",Font.PLAIN,17));
        cancelButton.setBackground(Color.red);
        cancelButton.setForeground(Color.WHITE);

        updateBookingButton.setText("Book Now");
        updateBookingButton.setFont(new Font("Lithos Pro Regular",Font.PLAIN,17));
        updateBookingButton.setBackground(Color.red);
        updateBookingButton.setForeground(Color.WHITE);


    }


    private void setBounds() {

        updateBookingDetailsPanel.setBounds(0, 140, 1400, 550);

        updateBookingDetailsLabel.setBounds(600, 0, 200, 30);
        updateBookingDetailsLabelSeparator.setBounds(400, 39, 600, 1);

        customerLabel.setBounds(100, 40, 200, 30);
        customerLabelSeparator.setBounds(60, 69, 230, 1);

        customeridlabel.setBounds(100, 80, 100, 25);
        editCustomerId.setBounds(230, 80, 150, 25);
        firstNameLabel.setBounds(500, 80, 100, 25);
        editFirstName.setBounds(620, 80, 150, 25);
        lastNameLabel.setBounds(900, 80, 100, 25);
        editLastName.setBounds(1020, 80, 150, 25);

        genderLabel.setBounds(100, 120, 100, 25);
        selectGender.setBounds(230, 120, 150, 25);
        dobLabel.setBounds(500, 120, 100, 25);
        dobDayList.setBounds(620, 120, 40, 25);
        dobMonthList.setBounds(660, 120, 40, 25);
        dobYearList.setBounds(700, 120, 70, 25);
        contactLabel.setBounds(900, 120, 100, 30);
        editContact.setBounds(1020, 120, 150, 25);

        emailLabel.setBounds(100, 160, 100, 25);
        editEmail.setBounds(230, 160, 150, 25);
        housenumberLabel.setBounds(500, 160, 100, 25);
        editHouseNumber.setBounds(620, 160, 150, 25);
        streetAddressLabel.setBounds(900, 160, 100, 25);
        editStreetAddress.setBounds(1020, 160, 150, 25);

        cityLabel.setBounds(100, 200, 100, 25);
        editCity.setBounds(230, 200, 150, 25);
        postalCodeLabel.setBounds(500, 200, 100, 25);
        editPostalCode.setBounds(620, 200, 150, 25);
        countryLabel.setBounds(900, 200, 100, 25);
        editCountry.setBounds(1020, 200, 150, 25);


        addressproofLabel.setBounds(100, 240, 200, 30);
        addressproofLabelSeparator.setBounds(60, 269, 230, 1);

        idtypeLabel.setBounds(100, 280, 100, 25);
        selectIdtype.setBounds(230, 280, 150, 25);
        idnumberLabel.setBounds(500, 280, 100, 25);
        editIdnumber.setBounds(620, 280, 150, 25);

        stayinfoLabel.setBounds(100, 320, 200, 30);
        stayinfoLabelSeparator.setBounds(60, 349, 230, 1);

        checkindateLabel.setBounds(100, 360, 100, 25);
        checkinDayList.setBounds(230, 360, 40, 25);
        checkinMonthList.setBounds(270, 360, 40, 25);
        checkinYearList.setBounds(310, 360, 70, 25);
        checkoutdateLabel.setBounds(500, 360, 100, 25);
        checkoutDayList.setBounds(620, 360, 40, 25);
        checkoutMonthList.setBounds(660, 360, 40, 25);
        checkoutYearList.setBounds(700, 360, 70, 25);
        roomtypeLabel.setBounds(900, 360, 100, 25);
        selectRoomtype.setBounds(1020, 360, 150, 25);
        numberofguestLabel.setBounds(100, 400, 100, 25);
        editNumberofguest.setBounds(230, 400, 150, 25);


        cancelButton.setBounds(500, 465, 140, 30);
        updateBookingButton.setBounds(670, 465, 140, 30);

    }


    private void addComponentToPanel() {

        updateBookingDetailsPanel.add(updateBookingDetailsLabel);
        updateBookingDetailsPanel.add(updateBookingDetailsLabelSeparator);

        updateBookingDetailsPanel.add(customerLabel);
        updateBookingDetailsPanel.add(customerLabelSeparator);

        updateBookingDetailsPanel.add(customeridlabel);
        updateBookingDetailsPanel.add(firstNameLabel);
        updateBookingDetailsPanel.add(lastNameLabel);

        updateBookingDetailsPanel.add(genderLabel);
        updateBookingDetailsPanel.add(dobLabel);
        updateBookingDetailsPanel.add(contactLabel);

        updateBookingDetailsPanel.add(emailLabel);
        updateBookingDetailsPanel.add(streetAddressLabel);
        updateBookingDetailsPanel.add(housenumberLabel);
        updateBookingDetailsPanel.add(countryLabel);

        updateBookingDetailsPanel.add(cityLabel);
        updateBookingDetailsPanel.add(postalCodeLabel);

        updateBookingDetailsPanel.add(editCustomerId);
        updateBookingDetailsPanel.add(editFirstName);
        updateBookingDetailsPanel.add(editLastName);

        updateBookingDetailsPanel.add(selectGender);
        updateBookingDetailsPanel.add(dobDayList);
        updateBookingDetailsPanel.add(dobMonthList);
        updateBookingDetailsPanel.add(dobYearList);
        updateBookingDetailsPanel.add(editContact);

        updateBookingDetailsPanel.add(editEmail);
        updateBookingDetailsPanel.add(editHouseNumber);
        updateBookingDetailsPanel.add(editStreetAddress);
        updateBookingDetailsPanel.add(editCountry);

        updateBookingDetailsPanel.add(editCity);
        updateBookingDetailsPanel.add(editPostalCode);

        updateBookingDetailsPanel.add(addressproofLabel);
        updateBookingDetailsPanel.add(addressproofLabelSeparator);
        updateBookingDetailsPanel.add(idtypeLabel);
        updateBookingDetailsPanel.add(idnumberLabel);

        updateBookingDetailsPanel.add(selectIdtype);
        updateBookingDetailsPanel.add(editIdnumber);


        updateBookingDetailsPanel.add(stayinfoLabel);
        updateBookingDetailsPanel.add(stayinfoLabelSeparator);
        updateBookingDetailsPanel.add(checkindateLabel);
        updateBookingDetailsPanel.add(checkoutdateLabel);
        updateBookingDetailsPanel.add(roomtypeLabel);
        updateBookingDetailsPanel.add(numberofguestLabel);

        updateBookingDetailsPanel.add(checkinDayList);
        updateBookingDetailsPanel.add(checkinMonthList);
        updateBookingDetailsPanel.add(checkinYearList);
        updateBookingDetailsPanel.add(checkoutDayList);
        updateBookingDetailsPanel.add(checkoutMonthList);
        updateBookingDetailsPanel.add(checkoutYearList);
        updateBookingDetailsPanel.add(selectRoomtype);
        updateBookingDetailsPanel.add(editNumberofguest);

        updateBookingDetailsPanel.add(cancelButton);
        updateBookingDetailsPanel.add(updateBookingButton);

    }

    public void addListeners(){
        updateBookingDetailsButtonListener.updateButtonListener(updateBookingButton);
        updateBookingDetailsButtonListener.cancelButtonListener(cancelButton);
    }

    public void destroy() {
        updateBookingDetailsPanel.setVisible(false);
        System.out.println("Update Booking Details Panel destroyed...");
    }

    public JPanel getUpdateBookingDetailsPanel() {
        return this.updateBookingDetailsPanel;
    }


}
