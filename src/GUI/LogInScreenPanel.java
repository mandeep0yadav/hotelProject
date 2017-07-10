package GUI;

import controller.LaunchController;
import listeners.LogInPanelListeners;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/4/2017.
 */
public class LogInScreenPanel
{

    private JPanel logInScreenPanel;

    //component in LogInScreenPanel
    private JLabel userIdLabel;
    private JLabel passwordLabel;
    public JTextField edituserId;
    public JPasswordField editPassword;
    private JButton logInButton;

    private LogInPanelListeners logInPanelListeners;


    public LogInScreenPanel(){

        System.out.println("Creating Login Panel...");

        logInScreenPanel = new JPanel();

        userIdLabel = new JLabel();
        passwordLabel = new JLabel();
        edituserId = new JTextField();
        editPassword=new JPasswordField();
        logInButton=new JButton();

        logInPanelListeners=new LogInPanelListeners();



        setProperty();

        setBounds();

        addComponentToPanel();

        addListeners();

        System.out.println("Login Panel Created...");

    }

    private void setProperty(){

        //setting panel property
        logInScreenPanel.setLayout(null);
        logInScreenPanel.setOpaque(false);

        //setting text to the components added
        userIdLabel.setText("Username");
        passwordLabel.setText("Password");
        logInButton.setText("LogIn");

        //applying properties to the label
        userIdLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
        userIdLabel.setForeground(Color.WHITE);
        
        passwordLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
        passwordLabel.setForeground(Color.WHITE);
        
        logInButton.setFont(new Font("Lithos Pro Regular",Font.BOLD,17));
        logInButton.setBackground(Color.red);
        logInButton.setForeground(Color.WHITE);


    }

    private void setBounds(){
        //setting panel bounds
        logInScreenPanel.setBounds(0,140,1400,500);

        //adding bounds to other components;
        userIdLabel.setBounds(500,150,200,30);
        passwordLabel.setBounds(500,200,200,30);
        edituserId.setBounds(700,150,200,30);
        editPassword.setBounds(700,200,200,30);
        logInButton.setBounds(650,300,150,40);

    }

    private void addComponentToPanel(){
        // adding Component to panel
        logInScreenPanel.add(passwordLabel);
        logInScreenPanel.add(userIdLabel);
        logInScreenPanel.add(editPassword);
        logInScreenPanel.add(edituserId);
        logInScreenPanel.add(logInButton);

    }

    public void destroy() {
        logInScreenPanel.setVisible(false);
        System.out.println("Login Panel Destroyed...");
    }

    public JPanel getlogInScreenPanel(){
        return this.logInScreenPanel;
    }

    private void addListeners(){

        logInPanelListeners.loginButtonListeners(logInButton);

    }

}
