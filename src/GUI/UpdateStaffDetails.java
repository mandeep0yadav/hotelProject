package GUI;

import listeners.UpdateStaffDetailsButtonListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/13/2017.
 */
public class UpdateStaffDetails {


    private JPanel updateStaffDetailsPanel;

    // All Components in panel

    // All labels
    //  private JLabel addStaffLabel;
    private JLabel personalLabel;
    private JLabel firstNameLabel , lastNameLabel;
    private JLabel dobLabel;
    private JLabel housenumberLabel;
    private JLabel streetAddressLabel , countryLabel , cityLabel , postalCodeLabel;
    private JLabel genderLabel;
    private JLabel phoneLabel , emailLabel;
    private JLabel salaryLabel;

    private JLabel loginLabel;
    private JLabel empIDLabel , passwordLabel;

    private JLabel jobLabel;
    private JLabel postLabel;

    // Text fields
    public JTextField editFirstName , editLastName;
    public JTextField editCountry , editCity ,  editPostalCode;
    public JTextField editPhone , editEmail;
    public JTextField editEmpID;
    public JTextField edithouseNumber;
    public JTextField editStreetAddress;
    public JTextField editSalary;

    // ComboBox
    public JComboBox postList , genderList;

    public JComboBox dobDayList , dobMonthList , dobYearList;

    // Password field
    public JPasswordField editPassword;

    // Separator
    private JSeparator personalLabelSeparator , loginLabelSeparator , jobLabelSeparator ;

    // Button
    private JButton updateButton;

    // Listeners
    private UpdateStaffDetailsButtonListener updateStaffDetailsButtonListener;

    // Constructor
    public UpdateStaffDetails() {

        System.out.println("Creating Register Panel...");

        updateStaffDetailsPanel = new JPanel();


        // Under Personal Details
        personalLabel = new JLabel();
        personalLabelSeparator = new JSeparator();

        firstNameLabel = new JLabel();
        lastNameLabel = new JLabel();
        genderLabel = new JLabel();
        dobLabel = new JLabel();
        phoneLabel = new JLabel();
        emailLabel = new JLabel();
        housenumberLabel = new JLabel();
        streetAddressLabel = new JLabel();
        countryLabel = new JLabel();
        cityLabel = new JLabel();
        postalCodeLabel = new JLabel();

        // Under Login Details
        loginLabel = new JLabel();
        loginLabelSeparator = new JSeparator();

        empIDLabel = new JLabel();
        passwordLabel = new JLabel();

        // Under Job Details
        jobLabel = new JLabel();
        jobLabelSeparator = new JSeparator();

        postLabel = new JLabel();
        salaryLabel = new JLabel();

        // All Fields corresponding to labels
        editFirstName = new JTextField();
        editLastName = new JTextField();
        editCountry = new JTextField();
        editCity = new JTextField();
        editPhone = new JTextField();
        editEmail = new JTextField();
        editPostalCode = new JTextField();
        editEmpID = new JTextField();

        dobDayList = new JComboBox();
        dobMonthList = new JComboBox();
        dobYearList = new JComboBox();

        genderList = new JComboBox();
        postList = new JComboBox();

        edithouseNumber = new JTextField();
        editStreetAddress = new JTextField();

        editSalary = new JTextField();
        editPassword = new JPasswordField();

        updateButton = new JButton();

        updateStaffDetailsButtonListener = new UpdateStaffDetailsButtonListener();

        setProperty();

        setBounds();

        addComponentToPanel();

        addListeners();

        System.out.println("Register Panel Created...");

    }



    private void setProperty() {

        updateStaffDetailsPanel.setLayout(null);
        updateStaffDetailsPanel.setOpaque(false);


        personalLabel.setText("Personal Details");
        personalLabel.setFont(new Font("Century Gothic", Font.BOLD,16));
        personalLabel.setForeground(Color.white);

        firstNameLabel.setText("First Name");
        firstNameLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        firstNameLabel.setForeground(Color.white);

        lastNameLabel.setText("Last Name");
        lastNameLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        lastNameLabel.setForeground(Color.white);

        genderLabel.setText("Gender");
        genderLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        genderLabel.setForeground(Color.white);

        dobLabel.setText("DOB");
        dobLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        dobLabel.setForeground(Color.white);

        phoneLabel.setText("Phone No.");
        phoneLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        phoneLabel.setForeground(Color.white);

        emailLabel.setText("Email ID");
        emailLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        emailLabel.setForeground(Color.white);

        housenumberLabel.setText("House Number");
        housenumberLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        housenumberLabel.setForeground(Color.white);

        streetAddressLabel.setText("Street Address");
        streetAddressLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        streetAddressLabel.setForeground(Color.white);

        countryLabel.setText("Country");
        countryLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        countryLabel.setForeground(Color.white);

        cityLabel.setText("City");
        cityLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        cityLabel.setForeground(Color.white);

        postalCodeLabel.setText("Postal Code");
        postalCodeLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        postalCodeLabel.setForeground(Color.white);

        loginLabel.setText("Login Details");
        loginLabel.setFont(new Font("Century Gothic", Font.BOLD,16));
        loginLabel.setForeground(Color.white);

        empIDLabel.setText("Set Employee ID");
        empIDLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        empIDLabel.setForeground(Color.white);

        passwordLabel.setText("Set Password");
        passwordLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        passwordLabel.setForeground(Color.white);

        jobLabel.setText("Job Details");
        jobLabel.setFont(new Font("Century Gothic", Font.BOLD,16));
        jobLabel.setForeground(Color.white);

        postLabel.setText("Select Post");
        postLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        postLabel.setForeground(Color.white);

        salaryLabel.setText("Salary");
        salaryLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        salaryLabel.setForeground(Color.white);

        String[] genderType = {"Male" , "Female"};
        genderList.setModel(new DefaultComboBoxModel(genderType));


        String[] postType = {"Receptionist","Manager","Admin"};
        postList.setModel(new DefaultComboBoxModel(postType));

        Integer[] day = new Integer[31];
        for (int i = 0 ; i < day.length ; i++) {
            day[i] = i+1;
        }

        Integer[] month = new Integer[12];
        for (int i = 0 ; i < month.length ; i++) {
            month[i] = i+1;
        }

        Integer[] year = new Integer[100];
        for (int i = 0 ; i < year.length ; i++) {
            year[i] = i+1918;
        }

        dobDayList.setModel(new DefaultComboBoxModel(day));
        dobMonthList.setModel(new DefaultComboBoxModel(month));
        dobYearList.setModel(new DefaultComboBoxModel(year));
        dobYearList.setSelectedItem(1990);

        updateButton.setText("Update");
        updateButton.setFont(new Font("Century Gothic", Font.BOLD,12));

    }

    private void setBounds() {

        updateStaffDetailsPanel.setBounds(0,140,1000,550);

        // addStaffLabelSeparator.setBounds(50,39,900,1);

        personalLabel.setBounds(100,40,200,29);
        personalLabelSeparator.setBounds(60,69,400,1);

        firstNameLabel.setBounds(100,80,100,25);
        editFirstName.setBounds(220,80,150,25);
        lastNameLabel.setBounds(600,80,100,25);
        editLastName.setBounds(720,80,150,25);

        genderLabel.setBounds(100,120,100,25);
        genderList.setBounds(220,120,150,25);
        dobLabel.setBounds(600,120,100,25);
        dobDayList.setBounds(720,120,40,25);
        dobMonthList.setBounds(760,120,40,25);
        dobYearList.setBounds(800,120,70,25);

        phoneLabel.setBounds(100,160,100,25);
        editPhone.setBounds(220,160,150,25);
        emailLabel.setBounds(600,160,100,25);
        editEmail.setBounds(720,160,150,25);

        housenumberLabel.setBounds(100,200,100,25);
        edithouseNumber.setBounds(220,200,150,30);
        streetAddressLabel.setBounds(600,200,100,25);
        editStreetAddress.setBounds(720,200,150,25);

        cityLabel.setBounds(100,240,100,25);
        editCity.setBounds(220,240,150,25);
        postalCodeLabel.setBounds(600,240,100,25);
        editPostalCode.setBounds(720,240,150,25);

        countryLabel.setBounds(100,280,100,25);
        editCountry.setBounds(220,280,150,25);

        // Login Details Bounds
        loginLabel.setBounds(100,320,100,29);
        loginLabelSeparator.setBounds(60,349,400,1);

        empIDLabel.setBounds(100,360,150,25);
        editEmpID.setBounds(220,360,150,25);
        passwordLabel.setBounds(600,360,100,25);
        editPassword.setBounds(720,360,150,25);

        // Job Details Bounds
        jobLabel.setBounds(100,400,100,29);
        jobLabelSeparator.setBounds(60,429,400,1);
        postLabel.setBounds(100,440,100,25);
        postList.setBounds(220,440,150,25);
        salaryLabel.setBounds(600,440,100,25);
        editSalary.setBounds(720,440,150,25);


        updateButton.setBounds(550,505,100,30);

    }

    private void addComponentToPanel() {

        updateStaffDetailsPanel.add(personalLabel);
        updateStaffDetailsPanel.add(personalLabelSeparator);

        updateStaffDetailsPanel.add(firstNameLabel);
        updateStaffDetailsPanel.add(lastNameLabel);
        updateStaffDetailsPanel.add(genderLabel);
        updateStaffDetailsPanel.add(dobLabel);
        updateStaffDetailsPanel.add(phoneLabel);
        updateStaffDetailsPanel.add(emailLabel);
        updateStaffDetailsPanel.add(housenumberLabel);
        updateStaffDetailsPanel.add(streetAddressLabel);
        updateStaffDetailsPanel.add(countryLabel);
        updateStaffDetailsPanel.add(cityLabel);
        updateStaffDetailsPanel.add(postalCodeLabel);

        updateStaffDetailsPanel.add(loginLabel);
        updateStaffDetailsPanel.add(loginLabelSeparator);
        updateStaffDetailsPanel.add(empIDLabel);
        updateStaffDetailsPanel.add(passwordLabel);

        updateStaffDetailsPanel.add(jobLabel);
        updateStaffDetailsPanel.add(jobLabelSeparator);
        updateStaffDetailsPanel.add(postLabel);
        updateStaffDetailsPanel.add(salaryLabel);

        // Adding all fields to Panel
        updateStaffDetailsPanel.add(editFirstName);
        updateStaffDetailsPanel.add(editLastName);
        updateStaffDetailsPanel.add(genderList);

        updateStaffDetailsPanel.add(dobDayList);
        updateStaffDetailsPanel.add(dobMonthList);
        updateStaffDetailsPanel.add(dobYearList);

        updateStaffDetailsPanel.add(editPhone);
        updateStaffDetailsPanel.add(editEmail);
        updateStaffDetailsPanel.add(edithouseNumber);
        updateStaffDetailsPanel.add(editStreetAddress);
        updateStaffDetailsPanel.add(editCountry);
        updateStaffDetailsPanel.add(editCity);
        updateStaffDetailsPanel.add(editPostalCode);
        updateStaffDetailsPanel.add(editEmpID);
        updateStaffDetailsPanel.add(editPassword);
        updateStaffDetailsPanel.add(postList);
        updateStaffDetailsPanel.add(editSalary);
        updateStaffDetailsPanel.add(updateButton);


    }

    public JPanel getUpdateStaffDetailsPanel() {
        return this.updateStaffDetailsPanel;
    }

    private void addListeners() {
        updateStaffDetailsButtonListener.updateButtonListener(updateButton);
    }

}
