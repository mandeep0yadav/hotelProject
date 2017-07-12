package listeners;

import GUI.LogInScreenPanel;
import controller.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dell on 7/10/2017.
 */
public class LogInPanelListeners {

    private JButton logInButton;
    private JLabel forgotLabel;

    public void loginButtonListeners(JButton button){
        this.logInButton = button;
        this.logInButton.addActionListener(e -> {
            LoginController.validateInput();
        });
    }

    public void forgotLabelListener(JLabel forgotLabel) {
        this.forgotLabel = forgotLabel;
        this.forgotLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on Forgot Label");
                new ForgotPasswordController();

            }
        });
    }

}
