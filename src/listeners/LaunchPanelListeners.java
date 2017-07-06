package listeners;

import GUI.LaunchPanel;
import controller.LoginController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nirmit on 6/7/17.
 */
public class LaunchPanelListeners{

    private JButton button;

    public void loginButtonListeners(JButton button, LaunchPanel launchPanel){
        this.button = button;
        this.button.addActionListener(e -> {
            launchPanel.destroy();
            new LoginController();
        });
    }
}
