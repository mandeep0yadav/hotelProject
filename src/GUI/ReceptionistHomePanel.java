package GUI;

import listeners.ReceptionistOptioinsPanelListners;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class ReceptionistHomePanel {

    private JPanel receptionistHomePanel;
    private JPanel showOptionsPanel;


    private JLabel roomBoking;
    private JLabel addGuest;
    private JLabel updateBooking;
    private JLabel roomView;
    private JLabel issueBill;
    private JLabel deleteGuest;
    private JLabel welcome;


    //adding receptionist Options Listeners
    private ReceptionistOptioinsPanelListners receptionistOptioinsPanelListners;


    public ReceptionistHomePanel() {

        System.out.println("Creating Receptionist Panel...");

        receptionistHomePanel=new JPanel();
        showOptionsPanel=new JPanel();
        roomBoking = new JLabel();
        addGuest = new JLabel();
        updateBooking = new JLabel();
        roomView = new JLabel();
        issueBill = new JLabel();
        deleteGuest = new JLabel();
        welcome=new JLabel();

        receptionistOptioinsPanelListners = new ReceptionistOptioinsPanelListners();

        setProperty();

        setBounds();

        addComponentToPanel();

        addListeners();

        System.out.println("Receptionist Home Panel Created...");

    }

    private void addListeners() {

        receptionistOptioinsPanelListners.issueBillListener(issueBill);

    }

    private void setProperty() {
        roomBoking.setText("Room Booking");
        addGuest.setText("Add Guest");
        updateBooking.setText("Update Booking");
        roomView.setText("Room View");
        issueBill.setText("Issue Bill");
        deleteGuest.setText("Delete Guest");
        welcome.setText("Welcome Receptionist");

        showOptionsPanel.setLayout(null);
        showOptionsPanel.setOpaque(false);
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
        welcome.setFont(new Font("Century Gothic",Font.BOLD, 40));
        welcome.setForeground(Color.WHITE);

    }

    private void setBounds() {
        receptionistHomePanel.setBounds(0,140,1000,550);
        showOptionsPanel.setBounds(1100,140,300,550);
        roomBoking.setBounds(50,100,300,30);
        addGuest.setBounds(50,150,300,30);
        updateBooking.setBounds(50,200,300,30);
        issueBill.setBounds(50,250,300,30);
        deleteGuest.setBounds(50,300,300,30);
        roomView.setBounds(50,350,300,30);
        welcome.setBounds(350,100,500,200);

    }

    private void addComponentToPanel() {
        showOptionsPanel.add(roomBoking);
        showOptionsPanel.add(addGuest);
        showOptionsPanel.add(updateBooking);
        showOptionsPanel.add(deleteGuest);
        showOptionsPanel.add(issueBill);
        showOptionsPanel.add(roomView);
        receptionistHomePanel.add(welcome);
//        receptionistHomePanel.add(showOptionsPanel);
    }

    public void destroy() {
        receptionistHomePanel.setVisible(false);
        System.out.println("Receptionist Home Panel Destroyed...");
    }

public JPanel getReceptionistHomePanel(){
        return this.receptionistHomePanel;
}

public JPanel getShowOptionsPanel(){     return this.showOptionsPanel; }

}