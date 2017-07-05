package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class ReceptionistHomePanel {
        private JPanel receptionistHomePanel;


    private JLabel roomBoking;
    private JLabel addGuest;
    private JLabel updateBooking;
    private JLabel roomView;
    private JLabel issueBill;
    private JLabel deleteGuest;


    public ReceptionistHomePanel() {
        receptionistHomePanel=new JPanel();
        roomBoking = new JLabel();
        addGuest = new JLabel();
        updateBooking = new JLabel();
        roomView = new JLabel();
        issueBill = new JLabel();
        deleteGuest = new JLabel();


        setProperty();

        setBounds();

        addComponentToPanel();

    }

    private void setProperty() {
        roomBoking.setText("Room Booking");
        addGuest.setText("Add Guest");
        updateBooking.setText("Update Booking");
        roomView.setText("Room View");
        issueBill.setText("Issue Bill");
        deleteGuest.setText("Delete Guest");
        receptionistHomePanel.setLayout(null);
        receptionistHomePanel.setOpaque(false);

        roomBoking.setFont(new Font("Century Gothic",Font.BOLD, 20));
        roomBoking.setForeground(Color.WHITE);
        addGuest.setFont(new Font("Century Gothic",Font.BOLD, 20));
        addGuest.setForeground(Color.WHITE);
        updateBooking.setFont(new Font("Century Gothic",Font.BOLD, 20));
        updateBooking.setForeground(Color.WHITE);
        roomView.setFont(new Font("Century Gothic",Font.BOLD, 20));
        roomView.setForeground(Color.WHITE);
        issueBill.setFont(new Font("Century Gothic",Font.BOLD, 20));
        issueBill.setForeground(Color.WHITE);
        deleteGuest.setFont(new Font("Century Gothic",Font.BOLD, 20));
        deleteGuest.setForeground(Color.WHITE);

    }

    private void setBounds() {
        receptionistHomePanel.setBounds(5,140,1400,550);
        roomBoking.setBounds(70,100,300,30);
        addGuest.setBounds(70,150,300,30);
        updateBooking.setBounds(70,200,300,30);
        issueBill.setBounds(70,250,300,30);
        deleteGuest.setBounds(70,300,300,30);
        roomView.setBounds(70,350,300,30);

    }

    private void addComponentToPanel() {
        receptionistHomePanel.add(roomBoking);
        receptionistHomePanel.add(addGuest);
        receptionistHomePanel.add(updateBooking);
        receptionistHomePanel.add(issueBill);
        receptionistHomePanel.add(deleteGuest);
        receptionistHomePanel.add(issueBill);
        receptionistHomePanel.add(roomView);

    }
public JPanel getReceptionistHomePanel(){
        return this.receptionistHomePanel;
}
}