package listeners;

import GUI.LogInScreenPanel;
import controller.*;

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
    public void launchReceptionist(){
        new ReceptionistHomeController();
    }
    public  void launchManager(){
new ManagerHomeController();
    }
    public void launchAdmin(){
new AdminHomeController();
    }


}
