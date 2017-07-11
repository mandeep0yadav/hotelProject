package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/12/2017.
 */
public class UpdateBookingPanel {


    private JPanel updateBookingPanel;

    private JLabel updateBookingLabel;

    public UpdateBookingPanel() {

        System.out.println("Creating update Booking Panel...");

        updateBookingPanel = new JPanel();

        updateBookingLabel = new JLabel();


        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Issue Bill Panel Created...");

    }

    private void setProperty() {

        updateBookingPanel.setOpaque(false);
        updateBookingPanel.setLayout(null);

        updateBookingLabel.setText("Update Booking");
        updateBookingLabel.setFont(new Font("Century Gothic", Font.BOLD,22));
        updateBookingLabel.setForeground(Color.white);
        updateBookingLabel.setHorizontalTextPosition(SwingConstants.CENTER);

    }

    private void setBounds() {

        updateBookingPanel.setBounds(0,140,1000,550);

        updateBookingLabel.setBounds(450,0,200,39);


    }

    private void addComponentToPanel() {

        updateBookingPanel.add(updateBookingLabel);


    }

    public JPanel getUpdateBookingPanel() {
        return this.updateBookingPanel;
    }

    public void destroy() {
        updateBookingPanel.setVisible(false);
    }

}
