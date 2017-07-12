package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jatin kumar vimal on 12/07/2017.
 */
public class UpdateStaffPanel {
    private JPanel UpdateUpdatestaffPanel;

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
    private JTextField editFirstName , editLastName;
    private JTextField editCountry , editCity ,  editPostalCode;
    private JTextField editPhone , editEmail;
    private JTextField editEmpID;
    private JTextField edithouseNumber;
    private JTextField editStreetAddress;
    private JTextField editSalary;

    // ComboBox
    private JComboBox postList , genderList;

    private JComboBox dobDayList , dobMonthList , dobYearList;

    // Password field
    private JPasswordField editPassword;

    // Separator
    private JSeparator addStaffLabelSeparator ;
    private JSeparator personalLabelSeparator , loginLabelSeparator , jobLabelSeparator ;

    // Button
    private JButton UpdateButton;

    // Listeners
    //private AddUpdatestaffPanelListeners addUpdatestaffPanelListeners;

    // Constructor
    public UpdateStaffPanel() {

        System.out.println("Creating Register Panel...");

        UpdateUpdatestaffPanel = new JPanel();


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

        UpdateButton = new JButton();

        //addUpdatestaffPanelListeners = new AddUpdatestaffPanelListeners();

        setProperty();

        setBounds();

        addComponentToPanel();

        //addListeners();

        System.out.println("Register Panel Created...");

    }


    private void setProperty() {

        UpdateUpdatestaffPanel.setLayout(null);
        UpdateUpdatestaffPanel.setOpaque(false);

//        addStaffLabel.setText("Add New Staff");
//        addStaffLabel.setFont(new Font("Century Gothic", Font.BOLD,22));
//        addStaffLabel.setForeground(Color.red);
//        addStaffLabel.setHorizontalTextPosition(SwingConstants.CENTER);

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

        UpdateButton.setText("Update");
        UpdateButton.setFont(new Font("Century Gothic", Font.BOLD,12));

    }

    private void setBounds() {

        UpdateUpdatestaffPanel.setBounds(0,140,1000,550);

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


        UpdateButton.setBounds(550,505,100,30);

    }

    private void addComponentToPanel() {

        // Adding all labels to Panel
        // UpdateUpdatestaffPanel.add(addStaffLabel);
//        UpdateUpdatestaffPanel.add(addStaffLabelSeparator);

        UpdateUpdatestaffPanel.add(personalLabel);
        UpdateUpdatestaffPanel.add(personalLabelSeparator);

        UpdateUpdatestaffPanel.add(firstNameLabel);
        UpdateUpdatestaffPanel.add(lastNameLabel);
        UpdateUpdatestaffPanel.add(genderLabel);
        UpdateUpdatestaffPanel.add(dobLabel);
        UpdateUpdatestaffPanel.add(phoneLabel);
        UpdateUpdatestaffPanel.add(emailLabel);
        UpdateUpdatestaffPanel.add(housenumberLabel);
        UpdateUpdatestaffPanel.add(streetAddressLabel);
        UpdateUpdatestaffPanel.add(countryLabel);
        UpdateUpdatestaffPanel.add(cityLabel);
        UpdateUpdatestaffPanel.add(postalCodeLabel);

        UpdateUpdatestaffPanel.add(loginLabel);
        UpdateUpdatestaffPanel.add(loginLabelSeparator);
        UpdateUpdatestaffPanel.add(empIDLabel);
        UpdateUpdatestaffPanel.add(passwordLabel);

        UpdateUpdatestaffPanel.add(jobLabel);
        UpdateUpdatestaffPanel.add(jobLabelSeparator);
        UpdateUpdatestaffPanel.add(postLabel);
        UpdateUpdatestaffPanel.add(salaryLabel);

        // Adding all fields to Panel
        UpdateUpdatestaffPanel.add(editFirstName);
        UpdateUpdatestaffPanel.add(editLastName);
        UpdateUpdatestaffPanel.add(genderList);

        UpdateUpdatestaffPanel.add(dobDayList);
        UpdateUpdatestaffPanel.add(dobMonthList);
        UpdateUpdatestaffPanel.add(dobYearList);

        UpdateUpdatestaffPanel.add(editPhone);
        UpdateUpdatestaffPanel.add(editEmail);
        UpdateUpdatestaffPanel.add(edithouseNumber);
        UpdateUpdatestaffPanel.add(editStreetAddress);
        UpdateUpdatestaffPanel.add(editCountry);
        UpdateUpdatestaffPanel.add(editCity);
        UpdateUpdatestaffPanel.add(editPostalCode);
        UpdateUpdatestaffPanel.add(editEmpID);
        UpdateUpdatestaffPanel.add(editPassword);
        UpdateUpdatestaffPanel.add(postList);
        UpdateUpdatestaffPanel.add(editSalary);
        UpdateUpdatestaffPanel.add(UpdateButton);


    }
    public JPanel getUpdateStaffPanel() {
        return this.UpdateUpdatestaffPanel;
    }

    //public static void main(String[] args) {
      //  new Updatestaff();
    //}
}
/*public class UpdateStaffPanel {


    private JPanel updateStaffPanel;

    private JLabel testLabel;
    private JLabel EMPID;
    private JTextField EMPIDTEXT;
    private JButton SUBMIT;

    public UpdateStaffPanel() {

        System.out.println("Creating UpdateStaff Panel...");

        updateStaffPanel = new JPanel();

        testLabel = new JLabel();

        EMPID = new JLabel("empid");
        EMPIDTEXT = new JTextField();
        SUBMIT = new JButton("Submit");

        setProperty();

        setBounds();

        addComponentToPanel();

    }

    private void setProperty() {

        updateStaffPanel.setOpaque(false);
        updateStaffPanel.setLayout(null);

        testLabel.setText("Update Staff");
        testLabel.setForeground(Color.white);



    }

    private void setBounds() {

        updateStaffPanel.setBounds(0,140,1000,550);

        EMPID.setBounds(500,200,100,25);
        EMPIDTEXT.setBounds(600,200,200,25);
        SUBMIT.setBounds(600,300,100,25);

        testLabel.setBounds(100,100,100,25);

    }

    private void addComponentToPanel() {

        updateStaffPanel.add(testLabel);
        updateStaffPanel.add(EMPID);
        updateStaffPanel.add(EMPIDTEXT);
        updateStaffPanel.add(SUBMIT);

    }

    public JPanel getUpdateStaffPanel() {
        return this.updateStaffPanel;
    }

    public void destroy() {
        updateStaffPanel.setVisible(false);
    }


}*/
