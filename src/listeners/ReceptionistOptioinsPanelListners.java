package listeners;

import controller.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dell on 7/11/2017.
 */
public class ReceptionistOptioinsPanelListners {

    private JLabel checkInlabel;

    private JLabel checkOutLabel;

    private JLabel updateBooking;

    private JLabel roomView;

    private JLabel issueBill;


    public void issueBillListener(JLabel issueBill) {
        this.issueBill = issueBill;
        this.issueBill.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on Issue Bill Label");
                new IssueBillController();


                checkInlabel.setForeground(Color.WHITE);
                checkOutLabel.setForeground(Color.white);
                updateBooking.setForeground(Color.white);
                roomView.setForeground(Color.white);
                issueBill.setForeground(Color.red);


            }
        });
    }

    public void roomViewListener(JLabel roomView) {
        this.roomView = roomView;
        this.roomView.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on roomview Label");
                new ViewRoomController();
                checkInlabel.setForeground(Color.WHITE);
                checkOutLabel.setForeground(Color.white);
                updateBooking.setForeground(Color.white);
                roomView.setForeground(Color.red);
                issueBill.setForeground(Color.white);


            }
        });
    }

    public void updateBookingListener(JLabel updateBooking) {
        this.updateBooking = updateBooking;
        this.updateBooking.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on updatebooking Label");
                new UpdateBookingController();
                checkInlabel.setForeground(Color.WHITE);
                checkOutLabel.setForeground(Color.white);
                updateBooking.setForeground(Color.red);
                roomView.setForeground(Color.white);
                issueBill.setForeground(Color.white);

            }
        });
    }

    public void checkInListener(JLabel checkInlabel) {
        this.checkInlabel = checkInlabel;
        this.checkInlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on checkIn Label");
                new CheckInController(ReceptionistHomeController.employeeDetails);
                checkInlabel.setForeground(Color.red);
                checkOutLabel.setForeground(Color.white);
                updateBooking.setForeground(Color.white);
                roomView.setForeground(Color.white);
                issueBill.setForeground(Color.white);

            }
        });
    }

    public void checkOutListener(JLabel checkOutLabel) {
        this.checkOutLabel = checkOutLabel;
        this.checkOutLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on check out Label");
                new CheckOutController();

                checkInlabel.setForeground(Color.WHITE);
                checkOutLabel.setForeground(Color.red);
                updateBooking.setForeground(Color.white);
                roomView.setForeground(Color.white);
                issueBill.setForeground(Color.white);


            }
        });
    }


}
