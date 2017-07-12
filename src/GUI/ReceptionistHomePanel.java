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


    private JLabel checkInlabel;
    private JLabel checkOutLabel;
    private JLabel updateBooking;
    private JLabel roomView;
    private JLabel issueBill;
    public JLabel welcome;


    //adding receptionist Options Listeners
    private ReceptionistOptioinsPanelListners receptionistOptioinsPanelListners;


    public ReceptionistHomePanel() {

        System.out.println("Creating Receptionist Panel...");

        receptionistHomePanel=new JPanel();
        showOptionsPanel=new JPanel();
        checkInlabel = new JLabel();
        checkOutLabel = new JLabel();
        updateBooking = new JLabel();
        roomView = new JLabel();
        issueBill = new JLabel();
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

        receptionistOptioinsPanelListners.checkInListener(checkInlabel);

        receptionistOptioinsPanelListners.checkOutListener(checkOutLabel);

        receptionistOptioinsPanelListners.roomViewListener(roomView);

        receptionistOptioinsPanelListners.updateBookingListener(updateBooking);

    }

    private void setProperty() {
        checkInlabel.setText("Check-In");
        checkOutLabel.setText("Check-Out");
        updateBooking.setText("Update Booking");
        roomView.setText("View Rooms");
        issueBill.setText("Issue Bill");
        welcome.setText("Welcome Receptionist");

        showOptionsPanel.setLayout(null);
        showOptionsPanel.setOpaque(false);
        receptionistHomePanel.setLayout(null);
        receptionistHomePanel.setOpaque(false);

        checkInlabel.setFont(new Font("Century Gothic",Font.BOLD, 20));
        checkInlabel.setForeground(Color.WHITE);
        checkOutLabel.setFont(new Font("Century Gothic",Font.BOLD, 20));
        checkOutLabel.setForeground(Color.WHITE);
        updateBooking.setFont(new Font("Century Gothic",Font.BOLD, 20));
        updateBooking.setForeground(Color.WHITE);
        roomView.setFont(new Font("Century Gothic",Font.BOLD, 20));
        roomView.setForeground(Color.WHITE);
        issueBill.setFont(new Font("Century Gothic",Font.BOLD, 20));
        issueBill.setForeground(Color.WHITE);
        welcome.setFont(new Font("Century Gothic",Font.BOLD, 40));
        welcome.setForeground(Color.WHITE);

    }

    private void setBounds() {
        receptionistHomePanel.setBounds(0,140,1000,550);
        showOptionsPanel.setBounds(1100,140,300,550);
        checkInlabel.setBounds(50,100,300,30);
        checkOutLabel.setBounds(50,160,300,30);
        updateBooking.setBounds(50,220,300,30);
        issueBill.setBounds(50,280,300,30);
        roomView.setBounds(50,340,300,30);
        welcome.setBounds(350,100,500,200);

    }

    private void addComponentToPanel() {
        showOptionsPanel.add(checkInlabel);
        showOptionsPanel.add(checkOutLabel);
        showOptionsPanel.add(updateBooking);
        showOptionsPanel.add(issueBill);
        showOptionsPanel.add(roomView);
        receptionistHomePanel.add(welcome);
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