package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/5/2017.
 */
public class AboutUsPanel {

    private JPanel aboutUsPanel;

    private JLabel overviewLabel;
    private JLabel overviewInfoLabel;

    private JLabel welcomeLabel;
    private JLabel welcomeInfoLabel;

    public AboutUsPanel() {

        System.out.println("Creating About Us Panel...");

        aboutUsPanel = new JPanel();

        welcomeLabel = new JLabel();
        welcomeInfoLabel = new JLabel();

        overviewLabel = new JLabel();
        overviewInfoLabel = new JLabel();

        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("About Us Panel Created...");

    }

    private void setProperty() {

        aboutUsPanel.setLayout(null);
        aboutUsPanel.setOpaque(false);

        welcomeLabel.setText("Welcome to Hotel holla");
        welcomeLabel.setFont(new Font("verdana",Font.BOLD,25));
        welcomeLabel.setForeground(Color.white);

        welcomeInfoLabel.setText("<html>The Hotel holla has a unique identity among the world’s leading hotels." +
                "<br>" +
                "And is best known for its Indian Hospitality." +
                "<br>" +
                "</html>");
        welcomeInfoLabel.setFont(new Font("verdana",Font.PLAIN,15));
        welcomeInfoLabel.setForeground(Color.white);
        welcomeInfoLabel.setVerticalTextPosition(SwingConstants.TOP);

        overviewLabel.setText("Overview");
        overviewLabel.setFont(new Font("verdana",Font.BOLD,20));
        overviewLabel.setForeground(Color.white);

        overviewInfoLabel.setText("<html>Peninsula is a living legend, the name synonymous with luxurious comfort and impeccable service." +
                "<br>" +
                "We set our sights high and our standards higher, aiming always to delight our customers," +
                "<br>" +
                "and in many cases we are now serving the third generation of our loyal guests." +
                "<br>" +
                "Hotel holla offer guests extraordinary places, created by combining unique architecture " +
                "<br>" +
                "and structure, expressive decor and artistry, and magnificent features. Add great service, " +
                "<br>" +
                "and the result is an unforgettable guest experience." +
                "</html>");
        overviewInfoLabel.setFont(new Font("verdana",Font.PLAIN,15));
        overviewInfoLabel.setForeground(Color.white);
        overviewInfoLabel.setVerticalTextPosition(SwingConstants.TOP);

    }

    private void setBounds() {

        aboutUsPanel.setBounds(0,140,1400,550);

        welcomeLabel.setBounds(100,40,400,40);
        welcomeInfoLabel.setBounds(100,90,1000,60);

        overviewLabel.setBounds(100,150,200,30);
        overviewInfoLabel.setBounds(100,190,1000,120);

    }

    private void addComponentToPanel() {

        aboutUsPanel.add(welcomeLabel);
        aboutUsPanel.add(welcomeInfoLabel);

        aboutUsPanel.add(overviewLabel);
        aboutUsPanel.add(overviewInfoLabel);

    }

    public JPanel getAboutUsPanel() {
        return this.aboutUsPanel;
    }

    public void destroy() {
        aboutUsPanel.setVisible(false);
    }

}
