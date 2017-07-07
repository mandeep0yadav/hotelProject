package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/5/2017.
 */
public class ContactsPanel {

    private JPanel contactUsPanel;

    private JLabel contactUsLabel;
    private JLabel emailLabel;
    private JLabel phone1Label , phone2Label , phone3Label;
    private JLabel addressLabel;

    private JLabel emailImageLabel;
    private JLabel phoneImageLabel;
    private JLabel addressImageLabel;

    private ImageIcon emailImage , phoneImage , addressImage;

    public ContactsPanel() {

        System.out.println("Creating Contacts Panel...");

        contactUsPanel = new JPanel();

        contactUsLabel = new JLabel();
        emailLabel = new JLabel();
        phone1Label = new JLabel();
        phone2Label = new JLabel();
        phone3Label = new JLabel();
        addressLabel = new JLabel();

        emailImageLabel = new JLabel();
        phoneImageLabel = new JLabel();
        addressImageLabel = new JLabel();

        emailImage = new ImageIcon("src/Images/emailImage.png");
        phoneImage = new ImageIcon("src/Images/phoneImage.png");
        addressImage = new ImageIcon("src/Images/addressImage.png");

        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Contacts Panel Created...");

    }

    private void addComponentToPanel() {

        contactUsPanel.add(contactUsLabel);

        contactUsPanel.add(addressImageLabel);
        contactUsPanel.add(addressLabel);

        contactUsPanel.add(phoneImageLabel);
        contactUsPanel.add(phone1Label);
        contactUsPanel.add(phone2Label);
        contactUsPanel.add(phone3Label);

        contactUsPanel.add(emailImageLabel);
        contactUsPanel.add(emailLabel);

    }

    private void setBounds() {

        contactUsPanel.setBounds(0,140,1400,550);

        contactUsLabel.setBounds(200,40,200,40);

        addressImageLabel.setBounds(200,130,25,25);
        addressLabel.setBounds(230,130,200,65);

        phoneImageLabel.setBounds(200,250,25,25);
        phone1Label.setBounds(230,250,200,25);
        phone2Label.setBounds(230,280,200,25);
        phone3Label.setBounds(230,310,200,25);

        emailImageLabel.setBounds(200,370,25,25);
        emailLabel.setBounds(230,370,200,25);

    }

    private void setProperty() {

        contactUsPanel.setLayout(null);
        contactUsPanel.setOpaque(false);

        contactUsLabel.setText("Contact Us");
        contactUsLabel.setFont(new Font("verdana",Font.BOLD,25));
        contactUsLabel.setForeground(Color.white);

        emailImageLabel.setIcon(emailImage);
        phoneImageLabel.setIcon(phoneImage);
        addressImageLabel.setIcon(addressImage);

        addressLabel.setText("<html>ABES Engineering College<br>NH-24<br>Ghaziabad</html>");
        addressLabel.setFont(new Font("verdana",Font.PLAIN,15));
        addressLabel.setForeground(Color.white);
        addressLabel.setVerticalTextPosition(SwingConstants.TOP);

        phone1Label.setText("0000000000");
        phone1Label.setFont(new Font("verdana",Font.PLAIN,15));
        phone1Label.setForeground(Color.white);

        phone2Label.setText("0000000000");
        phone2Label.setFont(new Font("verdana",Font.PLAIN,15));
        phone2Label.setForeground(Color.white);

        phone3Label.setText("0000000000");
        phone3Label.setFont(new Font("verdana",Font.PLAIN,15));
        phone3Label.setForeground(Color.white);

        emailLabel.setText("emailus@holla.com");
        emailLabel.setFont(new Font("verdana",Font.PLAIN,15));
        emailLabel.setForeground(Color.white);

    }

    public JPanel getContactUsPanel() {
        return this.contactUsPanel;
    }

    public void destroy() {
        contactUsPanel.setVisible(false);
    }
}
