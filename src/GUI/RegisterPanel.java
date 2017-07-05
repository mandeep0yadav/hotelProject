package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class RegisterPanel {

    private JPanel registerPanel;

    //components in panel

    //all labels
    private JLabel registrationLabel;
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



    //text fields
    private JTextField editFirstName , editLastName;
    private JTextField editCountry , editCity ,  editPostalCode;
    private JTextField editPhone , editEmail;
    private JTextField editEmpID;
    private JTextField editDobDay , editDobMonth , editDobYear;

    //text area
    private JTextArea editStreetAddress;

    //comboBox
    private JComboBox selectPost , selectGender;
    // private JComboBox dobDay , dobMonth , dobYear;

    //password field
    private JPasswordField editPassword;

    //date picker
    //private  DatePicker selectDob;

    private JButton registerButton;

    public RegisterPanel() {

        registerPanel = new JPanel();

        registrationLabel = new JLabel();
        personalLabel = new JLabel();
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
        loginLabel = new JLabel();
        empIDLabel = new JLabel();
        passwordLabel = new JLabel();
        jobLabel = new JLabel();
        postLabel = new JLabel();

        editFirstName = new JTextField();
        editLastName = new JTextField();
        editCountry = new JTextField();
        editCity = new JTextField();
        editPhone = new JTextField();
        editEmail = new JTextField();
        editPostalCode = new JTextField();
        editEmpID = new JTextField();
        editDobDay = new JTextField();
        editDobMonth = new JTextField();
        editDobYear = new JTextField();

        editStreetAddress = new JTextArea();

        selectGender = new JComboBox();
        selectPost = new JComboBox();

//        dobDay = new JComboBox();
//        dobMonth = new JComboBox();
//        dobYear = new JComboBox();

//        selectDob = new DatePicker();

        editPassword = new JPasswordField();

        registerButton = new JButton();

        setProperty();

        setBounds();

        addComponentToPanel();

    }

    public JPanel getRegisterPanel() {
        return this.registerPanel;
    }

    private void addComponentToPanel() {

        registerPanel.add(registrationLabel);
        registerPanel.add(personalLabel);
        registerPanel.add(firstNameLabel);
        registerPanel.add(lastNameLabel);
        registerPanel.add(genderLabel);
        registerPanel.add(dobLabel);
        registerPanel.add(phoneLabel);
        registerPanel.add(emailLabel);
        registerPanel.add(streetAddressLabel);
        registerPanel.add(countryLabel);
        registerPanel.add(cityLabel);
        registerPanel.add(postalCodeLabel);
        registerPanel.add(loginLabel);
        registerPanel.add(empIDLabel);
        registerPanel.add(passwordLabel);
        registerPanel.add(jobLabel);
        registerPanel.add(postLabel);
        registerPanel.add(editFirstName);
        registerPanel.add(editLastName);
        registerPanel.add(selectGender);
        registerPanel.add(editDobDay);
        registerPanel.add(editDobMonth);
        registerPanel.add(editDobYear);
//        registerPanel.add(selectDob);
        registerPanel.add(editPhone);
        registerPanel.add(editEmail);
        registerPanel.add(editStreetAddress);
        registerPanel.add(editCountry);
        registerPanel.add(editCity);
        registerPanel.add(editPostalCode);
        registerPanel.add(editEmpID);
        registerPanel.add(editPassword);
        registerPanel.add(selectPost);
        registerPanel.add(registerButton);

    }

    private void setBounds() {

        registerPanel.setBounds(0,140,1400,550);

        registrationLabel.setBounds(600,0,200,30);

        personalLabel.setBounds(100,40,200,30);
        firstNameLabel.setBounds(100,80,100,25);
        editFirstName.setBounds(220,80,150,25);
        lastNameLabel.setBounds(600,80,100,25);
        editLastName.setBounds(720,80,150,25);
        genderLabel.setBounds(100,120,100,25);
        selectGender.setBounds(220,120,150,25);
        dobLabel.setBounds(600,120,100,25);
        editDobDay.setBounds(720,120,35,25);
        editDobMonth.setBounds(755,120,35,25);
        editDobYear.setBounds(790,120,70,25);
//        selectDob.setBounds(,,,);
        phoneLabel.setBounds(300,160,100,30);
        editPhone.setBounds(220,160,150,25);
        emailLabel.setBounds(600,160,100,25);
        editEmail.setBounds(720,160,150,25);
        streetAddressLabel.setBounds(100,200,100,25);
        editStreetAddress.setBounds(220,200,150,25);
        countryLabel.setBounds(600,200,100,25);
        editCountry.setBounds(720,200,150,25);
        cityLabel.setBounds(100,240,100,25);
        editCity.setBounds(220,240,150,25);
        postalCodeLabel.setBounds(600,240,100,25);
        editPostalCode.setBounds(720,240,150,25);

        loginLabel.setBounds(100,280,100,30);
        empIDLabel.setBounds(100,310,150,25);
        editEmpID.setBounds(220,310,150,25);
        passwordLabel.setBounds(600,310,100,25);
        editPassword.setBounds(720,310,150,25);

        jobLabel.setBounds(100,350,100,30);
        postLabel.setBounds(100,390,100,25);
        selectPost.setBounds(220,390,150,25);




        registerButton.setBounds(550,465,100,30);


    }

    private void setProperty() {

        registerPanel.setLayout(null);
        registerPanel.setOpaque(false);

        registrationLabel.setText("Registration Page");
        registrationLabel.setFont(new Font("comic sans", Font.BOLD,22));
        registrationLabel.setForeground(Color.red);

        personalLabel.setText("Personal Details");
        personalLabel.setFont(new Font("comic sans", Font.BOLD,15));
        personalLabel.setForeground(Color.blue);

        firstNameLabel.setText("First Name");
        firstNameLabel.setFont(new Font("comic sans", Font.BOLD,13));
        firstNameLabel.setForeground(Color.white);

        lastNameLabel.setText("Last Name");
        lastNameLabel.setFont(new Font("comic sans", Font.BOLD,13));
        lastNameLabel.setForeground(Color.white);

        genderLabel.setText("Gender");
        genderLabel.setFont(new Font("comic sans", Font.BOLD,13));
        genderLabel.setForeground(Color.white);

        dobLabel.setText("DOB");
        dobLabel.setFont(new Font("comic sans", Font.BOLD,13));
        dobLabel.setForeground(Color.white);

        phoneLabel.setText("Phone No.");
        phoneLabel.setFont(new Font("comic sans", Font.BOLD,13));
        phoneLabel.setForeground(Color.white);

        emailLabel.setText("Email ID");
        emailLabel.setFont(new Font("comic sans", Font.BOLD,13));
        emailLabel.setForeground(Color.white);

        streetAddressLabel.setText("Street Address");
        streetAddressLabel.setFont(new Font("comic sans", Font.BOLD,13));
        streetAddressLabel.setForeground(Color.white);

        countryLabel.setText("Country");
        countryLabel.setFont(new Font("comic sans", Font.BOLD,13));
        countryLabel.setForeground(Color.white);

        cityLabel.setText("City");
        cityLabel.setFont(new Font("comic sans", Font.BOLD,13));
        cityLabel.setForeground(Color.white);

        postalCodeLabel.setText("Postal Code");
        postalCodeLabel.setFont(new Font("comic sans", Font.BOLD,13));
        postalCodeLabel.setForeground(Color.white);

        loginLabel.setText("Login Details");
        loginLabel.setFont(new Font("comic sans", Font.BOLD,15));
        loginLabel.setForeground(Color.blue);

        empIDLabel.setText("Set Employee ID");
        empIDLabel.setFont(new Font("comic sans", Font.BOLD,13));
        empIDLabel.setForeground(Color.white);

        passwordLabel.setText("Set Password");
        passwordLabel.setFont(new Font("comic sans", Font.BOLD,13));
        passwordLabel.setForeground(Color.white);

        jobLabel.setText("Job Details");
        jobLabel.setFont(new Font("comic sans", Font.BOLD,15));
        jobLabel.setForeground(Color.blue);

        postLabel.setText("Select Post");
        postLabel.setFont(new Font("comic sans", Font.BOLD,13));
        postLabel.setForeground(Color.white);



        String[] genderType = {"Male" , "Female"};
        selectGender.addItem(genderType);


        String[] postType = {"Receptionist","Manager","Admin"};
        selectPost.addItem(postType);

        registerButton.setText("Register");


    }
    public JPanel RegisterPanel(){
        return this.getRegisterPanel();
    }


}
