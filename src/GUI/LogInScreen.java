package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Dell on 7/4/2017.
 */
public class LogInScreen
{
    public LogInScreen(JFrame jFrame) {

        JPanel topPanel = new JPanel();
        JPanel botttomPanel = new JPanel();
        JPanel middlePanel = new JPanel();
        JLabel homeLabel=new JLabel();
        JLabel aboutus=new JLabel();
        JLabel faqslabel=new JLabel();
        JLabel contactUslabel =new JLabel();
        JLabel policyLabel=new JLabel();
       Color skyblue=Color.decode("#74a8d3");
        JLabel bottomLabel=new JLabel();

        JLabel userIdLabel=new JLabel();
        JLabel passwordLabel =new JLabel();
        JTextField edituserId=new JTextField();
        JPasswordField editPassword=new JPasswordField();
        JButton logInButton=new JButton();



        homeLabel.setText("Home");
        aboutus.setText("About us");
        faqslabel.setText("FAQS");
        contactUslabel.setText("Contacts");
        policyLabel.setText("Policy");
       bottomLabel.setText("Copyright \u00a9 Hotel Holla 2016-17 All rights reserved.");
       userIdLabel.setText("Username");
       passwordLabel.setText("Password");
       logInButton.setText("LogIn");


        jFrame.setTitle("Holla Hotel");
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        topPanel.setBounds(0, 0, 1400, 140);
        middlePanel.setBounds(0,140,1400,500);
        botttomPanel.setBounds(0,640,1400,100);
        homeLabel.setBounds(740,70,100,30);
        policyLabel.setBounds(840,70,100,30);
        aboutus.setBounds(950,70,100,30);
        faqslabel.setBounds(1080,70,100,30);
        contactUslabel.setBounds(1170,70,150,30);

        userIdLabel.setBounds(500,150,200,30);
        passwordLabel.setBounds(500,200,200,30);
       edituserId.setBounds(700,150,200,30);
        editPassword.setBounds(700,200,200,30);
        logInButton.setBounds(650,300,150,40);


        bottomLabel.setBounds(500,45,450,40);

        // jFrame.setLayout(new BorderLayout());
        jFrame.setContentPane(new JLabel(new ImageIcon("src/Images/holla.jpg")));

        // jFrame.setLayout(new FlowLayout());

        homeLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
        homeLabel.setForeground(Color.WHITE);
        contactUslabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
        contactUslabel.setForeground(Color.WHITE);
        aboutus.setFont(new Font("Century Gothic", Font.BOLD, 22));
        aboutus.setForeground(Color.WHITE);
        faqslabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
        faqslabel.setForeground(Color.WHITE);
        policyLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
        policyLabel.setForeground(Color.WHITE);

        userIdLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
        userIdLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
        passwordLabel.setForeground(Color.WHITE);
        logInButton.setFont(new Font("Lithos Pro Regular",Font.BOLD,17));
        logInButton.setBackground(skyblue);
        logInButton.setForeground(Color.WHITE);


       bottomLabel.setFont(new Font("Calisto MT", Font.ITALIC, 20));
        bottomLabel.setForeground(Color.WHITE);



        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botttomPanel.setVisible(false);
                middlePanel.setVisible(false);
                topPanel.setVisible(false);
                new Launch(jFrame);
            }
        });


        jFrame.add(topPanel);
        jFrame.add(middlePanel);
        jFrame.add(botttomPanel);
        topPanel.setLayout(null);
        topPanel.setOpaque(false);
        topPanel.add(homeLabel);
        topPanel.add(aboutus);
        topPanel.add(contactUslabel);
        topPanel.add(faqslabel);
        topPanel.add(policyLabel);

        middlePanel.setLayout(null);
        middlePanel.setOpaque(false);
        middlePanel.add(passwordLabel);
        middlePanel.add(userIdLabel);
        middlePanel.add(editPassword);
        middlePanel.add(edituserId);
        middlePanel.add(logInButton);

        botttomPanel.setLayout(null);
        botttomPanel.setOpaque(false);
        botttomPanel.add(bottomLabel);

        jFrame.setVisible(true);
        jFrame.setResizable(false);

    }
}
