package listeners;

import controller.*;

import javax.swing.*;
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



    public void issueBillListener(JLabel issueBill){
        this.issueBill = issueBill;
        this.issueBill.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on Issue Bill Label");
                new IssueBillController();


            }
        });
    }
    public void roomViewListener(JLabel roomView){
        this.roomView = roomView;
        this.roomView.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on roomview Label");
                new ViewRoomController();


            }
        });
    }
    public void updateBookingListener(JLabel updateBooking){
        this.updateBooking = updateBooking;
        this.updateBooking.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on updatebooking Label");
                new UpdateBookingController();


            }
        });
    }
    public void checkInListener(JLabel checkInlabel){
        this.checkInlabel = checkInlabel;
        this.checkInlabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on checkIn Label");
                new CheckInController();


            }
        });
    }
    public void checkOutListener(JLabel checkOutLabel){
        this.checkOutLabel = checkOutLabel;
        this.checkOutLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on check out Label");
                new CheckOutController();


            }
        });
    }



}
