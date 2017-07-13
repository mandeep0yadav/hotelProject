package listeners;

import controller.UpdateBookingDetailsController;
import controller.UpdateStaffDetailsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Himanshu on 13-07-2017.
 */
public class UpdateBookingPanelListeners {

    private JButton updateBookingButton;


    public void updateButtonListener(JButton updateBookingButton){
        this.updateBookingButton = updateBookingButton;
        this.updateBookingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdateBookingDetailsController();
            }
        });

    }

}
