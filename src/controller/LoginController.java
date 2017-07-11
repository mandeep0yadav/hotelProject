package controller;

import GUI.FooterPanel;
import GUI.HeaderPanel;
import GUI.LaunchPanel;
import GUI.LogInScreenPanel;
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

            //new MysqlEmployeeLoginDAO().findEmployeeLogin(logInScreenPanel.edituserId.getText(), String.valueOf(logInScreenPanel.editPassword.getPassword()));

            //for just testing
            if (logInScreenPanel.edituserId.getText().equals("123") &&
                    String.valueOf(logInScreenPanel.editPassword.getPassword()).equals("123")){
                logInScreenPanel.alertLabel.setText("");
                //launch the next screen according to usertype

                LogInPanelListeners obj =new LogInPanelListeners();
                obj.launchReceptionist();

            }
            else{
                logInScreenPanel.alertLabel.setText("Invalid UserID or Password!");
            }

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
