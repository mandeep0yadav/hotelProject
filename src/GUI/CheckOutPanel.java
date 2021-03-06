package GUI;

import listeners.CheckOutListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class CheckOutPanel {



    private JPanel checkOutPanel;

    //private JLabel checkOutLabel;

    private JLabel roomnumberLabel;
    public static JTextField editroomNumber;
    public static JButton checkoutButton;
    private CheckOutListener checkOutListener;

    public CheckOutPanel() {

        System.out.println("Creating  checkout Panel...");

        checkOutPanel = new JPanel();


        //checkOutLabel = new JLabel();

        roomnumberLabel = new JLabel();
        editroomNumber = new JTextField();
        checkoutButton = new JButton();
        checkOutListener=new CheckOutListener();



        setProperty();

        setBounds();

        addComponentToPanel();

        listeners();

        System.out.println("checkout Panel Created...");

    }

    private void listeners() {
        checkOutListener.issueBilllistener(checkoutButton);
    }

    private void setProperty() {

        checkOutPanel.setOpaque(false);
        checkOutPanel.setLayout(null);

        //checkOutLabel.setText("Check-Out");
        //checkOutLabel.setFont(new Font("Century Gothic", Font.BOLD,22));
        //checkOutLabel.setForeground(Color.white);
        //checkOutLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        roomnumberLabel.setText("Customer ID");
        roomnumberLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        roomnumberLabel.setForeground(Color.white);


        checkoutButton.setText("Check-out");
        checkoutButton.setFont(new Font("Lithos Pro Regular",Font.PLAIN,17));
        checkoutButton.setBackground(Color.red);
        checkoutButton.setForeground(Color.WHITE);

    }

    private void setBounds() {

        checkOutPanel.setBounds(0,140,1000,550);

        roomnumberLabel.setBounds(440,200,150,30);
        editroomNumber.setBounds(620,200,150,30);
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
