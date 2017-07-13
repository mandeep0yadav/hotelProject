package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class CheckOutPanel {



    private JPanel checkOutPanel;

    //private JLabel checkOutLabel;

    private JLabel roomnumberLabel;
    public JTextField editroomNumber;
    private JButton checkoutButton;

    public CheckOutPanel() {

        System.out.println("Creating  checkout Panel...");

        checkOutPanel = new JPanel();


        //checkOutLabel = new JLabel();

        roomnumberLabel = new JLabel();
        editroomNumber = new JTextField();
        checkoutButton = new JButton();



        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("checkout Panel Created...");

    }

    private void setProperty() {

        checkOutPanel.setOpaque(false);
        checkOutPanel.setLayout(null);

        //checkOutLabel.setText("Check-Out");
        //checkOutLabel.setFont(new Font("Century Gothic", Font.BOLD,22));
        //checkOutLabel.setForeground(Color.white);
        //checkOutLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        roomnumberLabel.setText("Room Number");
        roomnumberLabel.setFont(new Font("comic sans", Font.BOLD, 15));
        roomnumberLabel.setForeground(Color.red);
        checkoutButton.setText("Check-out");

    }

    private void setBounds() {

        checkOutPanel.setBounds(0,140,1000,550);

        roomnumberLabel.setBounds(450,200,150,30);
        editroomNumber.setBounds(600,200,150,30);
        checkoutButton.setBounds(520,300,150,30);


        //checkOutLabel.setBounds(450,0,200,39);


    }

    private void addComponentToPanel() {

        checkOutPanel.add(roomnumberLabel);
        checkOutPanel.add(editroomNumber);
        checkOutPanel.add(checkoutButton);


    }

    public JPanel getCheckOutPanel() {
        return this.checkOutPanel;
    }

    public void destroy() {
        checkOutPanel.setVisible(false);
    }
}
