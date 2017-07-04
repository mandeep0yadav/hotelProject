package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

/**
 * Created by Dell on 7/3/2017.
 */
public class Launch {
//    JFrame jFrame;
    public Launch(JFrame jFrame) {
   JPanel topPanel = new JPanel();

        JPanel botttomPanel = new JPanel();
        JPanel middlePanel = new JPanel();
        JLabel homeLabel=new JLabel();
        JLabel aboutus=new JLabel();
        JLabel faqs=new JLabel();
        JLabel contactUs=new JLabel();
        JLabel policy=new JLabel();
        JLabel showHotelName1=new JLabel();
        JLabel showHotelName2=new JLabel();
        JLabel tagline=new JLabel();
        Color skyblue=Color.decode("#ef0000");
        JButton loginButton=new JButton();
        JLabel bottomLabel=new JLabel();



        homeLabel.setText("Home");
        aboutus.setText("About us");
        faqs.setText("FAQS");
        contactUs.setText("Contacts");
        policy.setText("Policy");
        showHotelName1.setText("HOTEL");
        showHotelName2.setText("holla");
        tagline.setText("A place, where classic elegance and glamour meet contemporary luxury.");
        loginButton.setText("Log In!");
        bottomLabel.setText("Copyright \u00a9 Hotel Holla 2016-17 All rights reserved.");


        jFrame.setTitle("Holla Hotel");
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        topPanel.setBounds(0, 0, 1400, 140);
        middlePanel.setBounds(0,140,1400,500);
        botttomPanel.setBounds(0,640,1400,100);
        homeLabel.setBounds(740,70,100,30);
        policy.setBounds(840,70,100,30);
        aboutus.setBounds(950,70,100,30);
        faqs.setBounds(1080,70,100,30);
        contactUs.setBounds(1170,70,150,30);
        showHotelName1.setBounds(280,0,500,300);
        showHotelName2.setBounds(790,22,500,300);
        tagline.setBounds(290,240,900,40);
        loginButton.setBounds(650,350,150,40);
        bottomLabel.setBounds(500,45,450,40);

        // jFrame.setLayout(new BorderLayout());
        jFrame.setContentPane(new JLabel(new ImageIcon("//C:/Users/Dell/IdeaProjects/ProjectHotel/src/Images/living_style_interior_furniture_modern_39286_1920x1200.jpg")));
        // jFrame.setLayout(new FlowLayout());

        homeLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
        homeLabel.setForeground(Color.WHITE);
        contactUs.setFont(new Font("Century Gothic", Font.BOLD, 22));
        contactUs.setForeground(Color.WHITE);
        aboutus.setFont(new Font("Century Gothic", Font.BOLD, 22));
        aboutus.setForeground(Color.WHITE);
        faqs.setFont(new Font("Century Gothic", Font.BOLD, 22));
        faqs.setForeground(Color.WHITE);
        policy.setFont(new Font("Century Gothic", Font.BOLD, 22));
        policy.setForeground(Color.WHITE);
        showHotelName1.setFont(new Font("serif", Font.LAYOUT_LEFT_TO_RIGHT, 150));
        showHotelName1.setForeground(skyblue);
        showHotelName2.setFont(new Font("Aharoni", Font.BOLD, 130));
        showHotelName2.setForeground(Color.WHITE);
        tagline.setFont(new Font("Calisto MT", Font.ITALIC, 30));
        tagline.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Lithos Pro Regular",Font.BOLD,17));
        loginButton.setBackground(skyblue);
        loginButton.setForeground(Color.WHITE);
        bottomLabel.setFont(new Font("Calisto MT", Font.ITALIC, 20));
        bottomLabel.setForeground(Color.WHITE);

        contactUs.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                contactUs.setForeground(skyblue);
            }
        });
        contactUs.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseExited(MouseEvent e) {
                contactUs.setForeground(Color.WHITE);
            }
        });




        jFrame.add(topPanel);
        jFrame.add(middlePanel);
        jFrame.add(botttomPanel);
        topPanel.setLayout(null);
        topPanel.setOpaque(false);
        topPanel.add(homeLabel);
        topPanel.add(aboutus);
        topPanel.add(contactUs);
        topPanel.add(faqs);
        topPanel.add(policy);

        middlePanel.setLayout(null);
        middlePanel.setOpaque(false);
        middlePanel.add(showHotelName1);
        middlePanel.add(showHotelName2);
        middlePanel.add(tagline);
        middlePanel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                botttomPanel.setVisible(false);
                middlePanel.setVisible(false);
                topPanel.setVisible(false);
                new LogInScreen(jFrame);
            }
        });

        botttomPanel.setLayout(null);
        botttomPanel.setOpaque(false);
        botttomPanel.add(bottomLabel);

        jFrame.setVisible(true);
        jFrame.setResizable(false);

    }

}
