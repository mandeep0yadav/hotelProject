package GUI;

import listeners.LaunchPanelListeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

/**
 * Created by Dell on 7/3/2017.
 */
public class LaunchPanel {

    private JPanel launchPanel;

    //component in the panel
    private JLabel showHotelName1;
    private JLabel showHotelName2;
    private JLabel tagLine;
    private Color skyBlue;
    private JButton loginButton;

    //Listeners
    private LaunchPanelListeners launchPanelListeners;

    public LaunchPanel() {

        System.out.println("Creating Launch panel...");

        launchPanel = new JPanel();

        showHotelName1 = new JLabel();
        showHotelName2 = new JLabel();
        tagLine = new JLabel();
        skyBlue = Color.decode("#ef0000");
        loginButton = new JButton();

        launchPanelListeners = new LaunchPanelListeners();

        setProperty();

        setBounds();

        addComponentToPanel();

        addListeners();

        System.out.println("Launch Panel Created");
    }

    private void setProperty() {

        //setting panel property
        launchPanel.setLayout(null);
        launchPanel.setOpaque(false);

        //setting text to the components added
        showHotelName1.setText("HOTEL");
        showHotelName2.setText("holla");
        tagLine.setText("A place, where classic elegance and glamour meet contemporary luxury.");
        loginButton.setText("Log In!");

        //applying properties to the components

        showHotelName1.setFont(new Font("serif", Font.LAYOUT_LEFT_TO_RIGHT, 150));
        showHotelName1.setForeground(skyBlue);

        showHotelName2.setFont(new Font("Aharoni", Font.BOLD, 130));
        showHotelName2.setForeground(Color.WHITE);

        tagLine.setFont(new Font("Calisto MT", Font.ITALIC, 30));
        tagLine.setForeground(Color.WHITE);

        loginButton.setFont(new Font("Lithos Pro Regular", Font.BOLD, 17));
        loginButton.setBackground(skyBlue);
        loginButton.setForeground(Color.WHITE);


    }

    private void setBounds() {
        //setting panel bounds
        launchPanel.setBounds(0, 140, 1400, 500);

        //adding bounds to other components;
        showHotelName1.setBounds(280, 0, 500, 300);
        showHotelName2.setBounds(790, 22, 500, 300);
        tagLine.setBounds(290, 240, 900, 40);
        loginButton.setBounds(650, 350, 150, 40);

    }

    private void addComponentToPanel() {
        // adding Component to panel
        launchPanel.add(showHotelName1);
        launchPanel.add(showHotelName2);
        launchPanel.add(tagLine);
        launchPanel.add(loginButton);
    }

    public JPanel getLaunchPanel() {
        return this.launchPanel;
    }

    public void destroy() {
        launchPanel.setVisible(false);
        System.out.println("Launch Panel Destroyed...");
    }

    private void addListeners(){

        launchPanelListeners.loginButtonListeners(loginButton,this);

    }
    /* listeners
    loginButton.addActionListener(new ActionListener() {
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


