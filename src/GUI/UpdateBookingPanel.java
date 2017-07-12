package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class UpdateBookingPanel {

    private JPanel updateBookingPanel;

    private JLabel roomNoLabel;
    private JTextField roomNoText;


    private JButton updateBookingButton;

    public UpdateBookingPanel() {

        System.out.println("Creating updatebooking Panel...");

        updateBookingPanel = new JPanel();


        roomNoLabel = new JLabel();
        roomNoText = new JTextField();


        updateBookingButton = new JButton();

        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Issue updatebooking Created...");

    }

    private void setProperty() {

        updateBookingPanel.setOpaque(false);
        updateBookingPanel.setLayout(null);


        roomNoLabel.setText("Enter Room Number");
        roomNoLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        roomNoLabel.setForeground(Color.white);


        roomNoText.setFont(new Font("Century Gothic", Font.BOLD,15));

        updateBookingButton.setText("Update Booking");
        updateBookingButton.setFont(new Font("Lithos Pro Regular",Font.BOLD,17));
        updateBookingButton.setBackground(Color.red);
        updateBookingButton.setForeground(Color.WHITE);

    }

    private void setBounds() {

        updateBookingPanel.setBounds(0,140,1000,550);

        roomNoLabel.setBounds(380,200,250,25);
        roomNoText.setBounds(600,200,150,25);

        updateBookingButton.setBounds(450,280,200,25);

    }

    private void addComponentToPanel() {



        updateBookingPanel.add(roomNoLabel);
        updateBookingPanel.add(roomNoText);

        updateBookingPanel.add(updateBookingButton);

    }

    public JPanel getUpdateBookingPanel() {
        return this.updateBookingPanel;
    }

    public void destroy() {
        updateBookingPanel.setVisible(false);
    }


}
