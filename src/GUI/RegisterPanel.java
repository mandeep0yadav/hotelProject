package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    private JButton register;

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

        register = new JButton();

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
        registerPanel.add(register);

    }

    private void setBounds() {

        registerPanel.setBounds(0,140,1400,500);

        registrationLabel.setBounds(600,150,200,30);

        personalLabel.setBounds(40,185,100,30);
        firstNameLabel.setBounds(50,220,100,30);
        lastNameLabel.setBounds(50,255,100,30);
        genderLabel.setBounds(50,290,100,30);
        dobLabel.setBounds(50,325,100,30);
        phoneLabel.setBounds(50,360,100,30);
        emailLabel.setBounds(50,395,100,30);
        streetAddressLabel.setBounds(50,430,100,30);
        countryLabel.setBounds(350,185,100,30);
        cityLabel.setBounds(350,220,100,30);
        postalCodeLabel.setBounds(350,255,100,30);
        loginLabel.setBounds(340,290,100,30);
        empIDLabel.setBounds(350,325,100,30);
        passwordLabel.setBounds(350,360,100,30);
        jobLabel.setBounds(340,395,100,30);
        postLabel.setBounds(350,430,100,30);

        editFirstName.setBounds(150,220,150,30);
        editLastName.setBounds(150,255,150,30);
        selectGender.setBounds(150,290,150,30);
        editDobDay.setBounds(150,325,35,30);
        editDobMonth.setBounds(187,325,35,30);
        editDobYear.setBounds(224,325,70,30);
//        selectDob.setBounds(,,,);
        editPhone.setBounds(150,360,150,30);
        editEmail.setBounds(150,395,150,30);
        editStreetAddress.setBounds(150,430,150,60);
        editCountry.setBounds(450,185,150,30);
        editCity.setBounds(450,220,150,30);
        editPostalCode.setBounds(450,255,150,30);
        editEmpID.setBounds(450,325,150,30);
        editPassword.setBounds(450,360,150,30);
        selectPost.setBounds(450,430,150,30);

        register.setBounds(480,465,100,30);


    }

    private void setProperty() {

        registerPanel.setLayout(null);

        registrationLabel.setText("Registration Page");
        personalLabel.setText("Personal Details");
        firstNameLabel.setText("First Name");
        lastNameLabel.setText("Last Name");
        genderLabel.setText("Gender");
        dobLabel.setText("DOB");
        phoneLabel.setText("Phone No.");
        emailLabel.setText("Email ID");
        streetAddressLabel.setText("Street Address");
        countryLabel.setText("Country");
        cityLabel.setText("City");
        postalCodeLabel.setText("Postal Code");
        loginLabel.setText("Login Details");
        empIDLabel.setText("Set Employee ID");
        passwordLabel.setText("Set Password");
        jobLabel.setText("Job Details");
        postLabel.setText("Select Post");

        registrationLabel.setForeground(Color.red);

        personalLabel.setFont(new Font("comic sans", Font.BOLD,22));
        personalLabel.setForeground(Color.blue);

        loginLabel.setFont(new Font("comic sans", Font.BOLD,22));
        loginLabel.setForeground(Color.blue);

        jobLabel.setFont(new Font("comic sans", Font.BOLD,22));
        jobLabel.setForeground(Color.blue);



        String[] genderType = {"Male" , "Female"};
        selectGender.addItem(genderType);

        editStreetAddress.setRows(2);
        editStreetAddress.setColumns(10);

        String[] postType = {"Receptionist","Servicing"};
        selectPost.addItem(postType);

        register.setText("Register");
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });

    }


}
