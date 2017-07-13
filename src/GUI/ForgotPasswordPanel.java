package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Himanshu on 12-07-2017.
 */
public class ForgotPasswordPanel {

    private JPanel forgotPasswordPanel ;

    private JLabel pageHeadingLabel ;

    private JLabel userId ;
    private JLabel phoneNo ;
    private JLabel newPassword ;
    private JLabel confirmNewPassword ;

    public JTextField editUserId ;
    public JTextField editPhoneNo ;
    public JPasswordField editNewPassword ;
    public JPasswordField editConfirmNewPassword ;

    private JButton changePasswordButton;


    public ForgotPasswordPanel() {

        System.out.println("Creating Forgot Password Panel...");

        forgotPasswordPanel = new JPanel();

        pageHeadingLabel = new JLabel();

        userId = new JLabel();
        phoneNo = new JLabel();
        newPassword = new JLabel();
        confirmNewPassword = new JLabel();

        editUserId = new JTextField();
        editPhoneNo = new JTextField();
        editNewPassword = new JPasswordField();
        editConfirmNewPassword = new JPasswordField();

        changePasswordButton = new JButton();

        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Forgot Password Panel Created...");

    }

    private void setProperty() {

        forgotPasswordPanel.setLayout(null);
        forgotPasswordPanel.setOpaque(false);

        pageHeadingLabel.setText("Reset Password");
        pageHeadingLabel.setFont(new Font("Century Gothic", Font.BOLD,22));
        pageHeadingLabel.setForeground(Color.red);
        pageHeadingLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        userId.setText("Emp ID");
        userId.setFont(new Font("Century Gothic", Font.BOLD,16));
        userId.setForeground(Color.white);

        phoneNo.setText("Phone No.");
        phoneNo.setFont(new Font("Century Gothic", Font.BOLD,16));
        phoneNo.setForeground(Color.white);

        newPassword.setText("New Password");
        newPassword.setFont(new Font("Century Gothic", Font.BOLD,16));
        newPassword.setForeground(Color.white);

        confirmNewPassword.setText("Confirm New Password");
        confirmNewPassword.setFont(new Font("Century Gothic", Font.BOLD,16));
        confirmNewPassword.setForeground(Color.white);

        changePasswordButton.setText("Change Password");
        changePasswordButton.setFont(new Font("Lithos Pro Regular", Font.PLAIN,16));
        changePasswordButton.setBackground(Color.red);
        changePasswordButton.setForeground(Color.white);


    }

    private void setBounds() {

        forgotPasswordPanel.setBounds(0,140,1400,500);

        //adding bounds to other components;
        pageHeadingLabel.setBounds(570,60,200,40);
        userId.setBounds(500,150,200,30);
        phoneNo.setBounds(500,200,200,30);
        newPassword.setBounds(500,250,200,30);
        confirmNewPassword.setBounds(500,300,200,30);
        editUserId.setBounds(700,150,200,30);
        editPhoneNo.setBounds(700,200,200,30);
        editNewPassword.setBounds(700,250,200,30);
        editConfirmNewPassword.setBounds(700,300,200,30);

        changePasswordButton.setBounds(600,380,250,40);


    }

    private void addComponentToPanel() {

        forgotPasswordPanel.add(pageHeadingLabel);
        forgotPasswordPanel.add(userId);
        forgotPasswordPanel.add(phoneNo);
        forgotPasswordPanel.add(newPassword);
        forgotPasswordPanel.add(confirmNewPassword);
        forgotPasswordPanel.add(editUserId);
        forgotPasswordPanel.add(editPhoneNo);
        forgotPasswordPanel.add(editNewPassword);
        forgotPasswordPanel.add(editConfirmNewPassword);
        forgotPasswordPanel.add(changePasswordButton);

    }

    public void destroy() {
        forgotPasswordPanel.setVisible(false);
        System.out.println("Forgot Panel Destroyed...");
    }

    public JPanel getForgotPasswordPanel(){
        return this.forgotPasswordPanel;
    }

}