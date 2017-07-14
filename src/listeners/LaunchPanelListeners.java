package listeners;

import GUI.HeaderPanel;
import GUI.LaunchPanel;
import controller.LoginController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nirmit on 6/7/17.
 */
public class LaunchPanelListeners{


    public HeaderPanel headerPanel;

    private JButton button;

    public void loginButtonListeners(JButton button, LaunchPanel launchPanel){
        HeaderPanel.homeLabel.setForeground(Color.white);
        HeaderPanel.policy.setForeground(Color.white);
        HeaderPanel.aboutUs.setForeground(Color.white);
        HeaderPanel.faqs.setForeground(Color.white);
        HeaderPanel.contactUs.setForeground(Color.white);

        headerPanel=new HeaderPanel();
        this.button = button;
        this.button.addActionListener(e -> {


            launchPanel.destroy();
            new LoginController();





        });
    }
}
