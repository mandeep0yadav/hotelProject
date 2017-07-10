package controller;

import GUI.FooterPanel;
import GUI.HeaderPanel;
import GUI.LaunchPanel;
import GUI.LogInScreenPanel;
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

    public LoginController(){

        System.out.println("Controls in Login Controller...");

        logInScreenPanel = new LogInScreenPanel();
        initialFrame = JframeSingleTon.getjFrame();

        setproperty();

        addComponent();
    }

    private void setproperty(){

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/guestRoomSofa.jpg")));
        initialFrame.setTitle("Login In");
        initialFrame.setExtendedState(initialFrame.MAXIMIZED_BOTH);
        initialFrame.setVisible(true);
        //initialFrame.setResizable(false);



    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(logInScreenPanel.getlogInScreenPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }

    public static void validateInput(){
        System.out.println("\n\n\n\n\n");
        System.out.println(logInScreenPanel.edituserId.getText());
        System.out.println(logInScreenPanel.editPassword.getPassword());

    }
}
