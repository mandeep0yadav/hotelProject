package listeners;

import GUI.LogInScreenPanel;
import controller.AdminHomeController;
import controller.LoginController;
import controller.ManagerHomeController;
import controller.ReceptionistHomeController;

import javax.swing.*;

/**
 * Created by Dell on 7/10/2017.
 */
public class LogInPanelListeners {

    private JButton logInButton;
    public void loginButtonListeners(JButton button){
        this.logInButton = button;
        this.logInButton.addActionListener(e -> {
            LoginController.validateInput();
        });
    }


}
