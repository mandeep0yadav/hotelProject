package GUI;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Dell on 7/4/2017.
 */
public class LogInScreen
{
    public static void main(String[] args) throws IOException {
        JFrame jFrame = new JFrame();
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



        homeLabel.setText("Home");
        aboutus.setText("About us");
        faqslabel.setText("FAQS");
        contactUslabel.setText("Contacts");
        policyLabel.setText("Policy");
       bottomLabel.setText("Copyright \u00a9 Hotel Holla 2016-17 All rights reserved.");


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
        bottomLabel.setBounds(500,45,450,40);

        // jFrame.setLayout(new BorderLayout());
        jFrame.setContentPane(new JLabel(new ImageIcon("")));

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
       bottomLabel.setFont(new Font("Calisto MT", Font.ITALIC, 20));
        bottomLabel.setForeground(Color.WHITE);




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

        botttomPanel.setLayout(null);
        botttomPanel.setOpaque(false);
        botttomPanel.add(bottomLabel);

        jFrame.setVisible(true);
        jFrame.setResizable(false);

    }
}
