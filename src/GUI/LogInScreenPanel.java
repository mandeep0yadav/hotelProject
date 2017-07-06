package GUI;

import controller.LaunchController;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/4/2017.
 */
public class LogInScreenPanel
{

    private JPanel logInScreenPanel;

    //component in LogInScreenPanel
    private Color skyBlue;
    private JLabel userIdLabel;
    private JLabel passwordLabel;
    private JTextField edituserId;
    private JPasswordField editPassword;
    private JButton logInButton;


    public LogInScreenPanel(){
        
        logInScreenPanel = new JPanel();
        
        skyBlue = Color.decode("#74a8d3");
        userIdLabel = new JLabel();
        passwordLabel = new JLabel();
        edituserId = new JTextField();
        editPassword=new JPasswordField();
        logInButton=new JButton();

        setProperty();

        setBounds();

        addComponentToPanel();

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
        logInButton.setBackground(skyBlue);
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
    }

    public JPanel getlogInScreenPanel(){
        return this.logInScreenPanel;
    }
    /* listner
                    logInButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    botttomPanel.setVisible(false);
                    logInScreenPanel.setVisible(false);
                    topPanel.setVisible(false);
                    new Launch(jFrame);
                }
            });


     */

}
