package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class CheckInPanel {



    private JPanel checkInPanel;

    private JLabel checkInLabel;

    public CheckInPanel() {

        System.out.println("Creating checkin Panel...");

        checkInPanel = new JPanel();

        checkInLabel = new JLabel();


        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Issue checkin panel Created...");

    }

    private void setProperty() {

        checkInPanel.setOpaque(false);
        checkInPanel.setLayout(null);

        checkInLabel.setText("Check-In");
        checkInLabel.setFont(new Font("Century Gothic", Font.BOLD,22));
        checkInLabel.setForeground(Color.white);
        checkInLabel.setHorizontalTextPosition(SwingConstants.CENTER);

    }

    private void setBounds() {

        checkInPanel.setBounds(0,140,1000,550);

        checkInLabel.setBounds(450,0,200,39);


    }

    private void addComponentToPanel() {

        checkInPanel.add(checkInLabel);


    }

    public JPanel getCheckInPanel() {
        return this.checkInPanel;
    }

    public void destroy() {
        checkInPanel.setVisible(false);
    }

}
