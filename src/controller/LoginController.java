package controller;

import GUI.FooterPanel;
import GUI.HeaderPanel;
import GUI.LaunchPanel;
import GUI.LogInScreenPanel;
import ValueObjects.EmployeeDetails;
import ValueObjects.EmployeeLevel;
import ValueObjects.EmployeeLogin;
import dao.MysqlDAO.MysqlEmployeeDetailsDAO;
import dao.MysqlDAO.MysqlEmployeeLevelDAO;
import dao.MysqlDAO.MysqlEmployeeLoginDAO;
import listeners.LogInPanelListeners;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class LoginController {

    private JFrame initialFrame;
    private static LogInScreenPanel logInScreenPanel;

    public LoginController() {

        System.out.println("Controls in Login Controller...");

        logInScreenPanel = new LogInScreenPanel();
        initialFrame = JframeSingleTon.getjFrame();

        setproperty();

        addComponent();
    }

    private void setproperty() {

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/guestRoomSofa.jpg")));
        initialFrame.setTitle("Login In");
        initialFrame.setVisible(true);
        //initialFrame.setResizable(false);


    }

    private void addComponent() {

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(logInScreenPanel.getlogInScreenPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }

    public static void validateInput() {

        if (logInScreenPanel.edituserId.getText().trim().length() > 0 &&
                String.valueOf(logInScreenPanel.editPassword.getPassword()).trim().length() > 0) {

            //do database validation and perform the action whatever you want

            EmployeeLogin employeeLogin = new MysqlEmployeeLoginDAO().findEmployeeLogin(logInScreenPanel.edituserId.getText(), String.valueOf(logInScreenPanel.editPassword.getPassword()));
            if (employeeLogin != null) {
                EmployeeDetails employeeDetails = new MysqlEmployeeDetailsDAO().findEmployeeDetails(employeeLogin.getEmpid());
                EmployeeLevel employeeLevel = new MysqlEmployeeLevelDAO().findEmployeeLevel(employeeLogin.getEmpid());
                switch (employeeLevel.getLevel()) {
                    case "Receptionist":
                        new ReceptionistHomeController(employeeDetails);
                        break;
                    case "Manager":
                        new ManagerHomeController(employeeDetails);
                        break;
                    case "Admin":
                        new AdminHomeController(employeeDetails);
                        break;
                    default:
                        System.out.println("Unknown Category");
                        break;
                }
            }else {
                logInScreenPanel.alertLabel.setText("Please Enter Valid UserId");
            }

            /*//for just testing
            if (logInScreenPanel.edituserId.getText().equals("1") &&
                    String.valueOf(logInScreenPanel.editPassword.getPassword()).equals("1")){
                logInScreenPanel.alertLabel.setText("");
                //launch the next screen according to usertype

                LogInPanelListeners obj =new LogInPanelListeners();
                obj.launchAdmin();

            } if (logInScreenPanel.edituserId.getText().equals("2") &&
                    String.valueOf(logInScreenPanel.editPassword.getPassword()).equals("2")){
                logInScreenPanel.alertLabel.setText("");
                //launch the next screen according to usertype

                LogInPanelListeners obj =new LogInPanelListeners();
                obj.launchManager();

            } if (logInScreenPanel.edituserId.getText().equals("3") &&
                    String.valueOf(logInScreenPanel.editPassword.getPassword()).equals("3")){
                logInScreenPanel.alertLabel.setText("");
                //launch the next screen according to usertype

                LogInPanelListeners obj =new LogInPanelListeners();
                obj.launchReceptionist();

            }
            else{
                logInScreenPanel.alertLabel.setText("Invalid UserID or Password!");
            }*/

        } else {
            if (logInScreenPanel.edituserId.getText().trim().length() == 0) {
                logInScreenPanel.alertLabel.setText("Please enter your Userid");
            }
            else if (String.valueOf(logInScreenPanel.editPassword.getPassword()).trim().length() == 0) {
                logInScreenPanel.alertLabel.setText("Please enter your Password");
            }

        }
    }
}
