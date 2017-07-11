package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class AddStaffPanel {

    private JPanel addStaffPanel;

    // All Components in panel

    // All labels
    private JLabel addStaffLabel;
    private JLabel personalLabel;
    private JLabel firstNameLabel , lastNameLabel;
    private JLabel dobLabel;
    private JLabel streetAddressLabel , countryLabel , cityLabel , postalCodeLabel;
    private JLabel genderLabel;
    private JLabel phoneLabel , emailLabel;

    private JLabel loginLabel;
    private JLabel empIDLabel , passwordLabel;

    private JLabel jobLabel;
    private JLabel postLabel;

    // Text fields
    private JTextField editFirstName , editLastName;
    private JTextField editCountry , editCity ,  editPostalCode;
    private JTextField editPhone , editEmail;
    private JTextField editEmpID;

    // Text area
    private JTextArea editStreetAddress;

    // ComboBox
    private JComboBox postList , genderList;

    private JComboBox dobDayList , dobMonthList , dobYearList;

    // Password field
    private JPasswordField editPassword;

    // Separator
    private JSeparator addStaffLabelSeparator ;
    private JSeparator personalLabelSeparator , loginLabelSeparator , jobLabelSeparator ;

    // Button
    private JButton registerButton;


    // Constructor
    public AddStaffPanel() {

        System.out.println("Creating Register Panel...");

        addStaffPanel = new JPanel();

        addStaffLabel = new JLabel();
        addStaffLabelSeparator = new JSeparator();

        // Under Personal Details
        personalLabel = new JLabel();
        personalLabelSeparator = new JSeparator();

        firstNameLabel = new JLabel();
        lastNameLabel = new JLabel();
        genderLabel = new JLabel();
        dobLabel = new JLabel();
        phoneLabel = new JLabel();
        emailLabel = new JLabel();
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

        editStreetAddress = new JTextArea();

        editPassword = new JPasswordField();

        registerButton = new JButton();

        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Register Panel Created...");

    }


    private void setProperty() {

        addStaffPanel.setLayout(null);
        addStaffPanel.setOpaque(false);

        addStaffLabel.setText("Add New Staff");
        addStaffLabel.setFont(new Font("Century Gothic", Font.BOLD,22));
        addStaffLabel.setForeground(Color.red);
        addStaffLabel.setHorizontalTextPosition(SwingConstants.CENTER);

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

        registerButton.setText("Register");
        registerButton.setFont(new Font("Century Gothic", Font.BOLD,12));

    }

    private void setBounds() {

        addStaffPanel.setBounds(0,140,1000,550);

        addStaffLabel.setBounds(400,0,200,39);

        addStaffLabelSeparator.setBounds(50,39,900,1);

        // Personal Details Bounds
        personalLabel.setBounds(100,40,200,29);
        personalLabelSeparator.setBounds(60,69,400,1);

        firstNameLabel.setBounds(100,80,100,25);
        editFirstName.setBounds(220,80,150,25);
        lastNameLabel.setBounds(600,80,100,25);
        editLastName.setBounds(720,80,150,25);
        genderLabel.setBounds(100,120,100,25);
        genderList.setBounds(220,120,150,25);
        dobLabel.setBounds(600,120,100,25);

        dobDayList.setBounds(720,120,35,25);
        dobMonthList.setBounds(755,120,35,25);
        dobYearList.setBounds(790,120,70,25);

        phoneLabel.setBounds(100,160,100,25);
        editPhone.setBounds(220,160,150,25);
        emailLabel.setBounds(600,160,100,25);
        editEmail.setBounds(720,160,150,25);
        streetAddressLabel.setBounds(100,200,100,25);
        editStreetAddress.setBounds(220,200,150,30);
        countryLabel.setBounds(600,200,100,25);
        editCountry.setBounds(720,200,150,25);
        cityLabel.setBounds(100,240,100,25);
        editCity.setBounds(220,240,150,25);
        postalCodeLabel.setBounds(600,240,100,25);
        editPostalCode.setBounds(720,240,150,25);

        // Login Details Bounds
        loginLabel.setBounds(100,280,100,29);
        loginLabelSeparator.setBounds(60,309,400,1);

        empIDLabel.setBounds(100,320,150,25);
        editEmpID.setBounds(220,320,150,25);
        passwordLabel.setBounds(600,320,100,25);
        editPassword.setBounds(720,320,150,25);

        // Job Details Bounds
        jobLabel.setBounds(100,360,100,29);
        jobLabelSeparator.setBounds(60,389,400,1);
        postLabel.setBounds(100,400,100,25);
        postList.setBounds(220,400,150,25);


        registerButton.setBounds(550,465,100,30);

    }

    private void addComponentToPanel() {

        // Adding all labels to Panel
        addStaffPanel.add(addStaffLabel);
        addStaffPanel.add(addStaffLabelSeparator);

        addStaffPanel.add(personalLabel);
        addStaffPanel.add(personalLabelSeparator);

        addStaffPanel.add(firstNameLabel);
        addStaffPanel.add(lastNameLabel);
        addStaffPanel.add(genderLabel);
        addStaffPanel.add(dobLabel);
        addStaffPanel.add(phoneLabel);
        addStaffPanel.add(emailLabel);
        addStaffPanel.add(streetAddressLabel);
        addStaffPanel.add(countryLabel);
        addStaffPanel.add(cityLabel);
        addStaffPanel.add(postalCodeLabel);

        addStaffPanel.add(loginLabel);
        addStaffPanel.add(loginLabelSeparator);
        addStaffPanel.add(empIDLabel);
        addStaffPanel.add(passwordLabel);

        addStaffPanel.add(jobLabel);
        addStaffPanel.add(jobLabelSeparator);
        addStaffPanel.add(postLabel);

        // Adding all fields to Panel
        addStaffPanel.add(editFirstName);
        addStaffPanel.add(editLastName);
        addStaffPanel.add(genderList);

        addStaffPanel.add(dobDayList);
        addStaffPanel.add(dobMonthList);
        addStaffPanel.add(dobYearList);

        addStaffPanel.add(editPhone);
        addStaffPanel.add(editEmail);
        addStaffPanel.add(editStreetAddress);
        addStaffPanel.add(editCountry);
        addStaffPanel.add(editCity);
        addStaffPanel.add(editPostalCode);
        addStaffPanel.add(editEmpID);
        addStaffPanel.add(editPassword);
        addStaffPanel.add(postList);
        addStaffPanel.add(registerButton);

    }

    public void destroy() {
        addStaffPanel.setVisible(false);
        System.out.println("Register Panel destroyed...");
    }

    public JPanel getAddStaffPanel() {
        return this.addStaffPanel;
    }

}
