package listeners;

import controller.IssueBillController;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dell on 7/11/2017.
 */
public class ReceptionistOptioinsPanelListners {

    private JLabel addGuest;

    private JLabel updateBooking;

    private JLabel roomView;

    private JLabel issueBill;

    private JLabel deleteGuest;


    public void issueBillListener(JLabel issueBill){
        this.issueBill = issueBill;
        this.issueBill.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on Issue Bill Label");
                new IssueBillController();

                //for color change to show which panel is launched

            }
        });
    }

}
