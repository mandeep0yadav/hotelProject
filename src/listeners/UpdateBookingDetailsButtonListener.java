package listeners;

import controller.AdminHomeController;
import controller.ReceptionistHomeController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Himanshu on 13-07-2017.
 */
public class UpdateBookingDetailsButtonListener {

    private JButton updateBookingButton;
    private JButton cancelButton;


    public void updateButtonListener(JButton updateBookingButton){
        this.updateBookingButton = updateBookingButton;
        this.updateBookingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //changes of updation will reflect in the dataBase

                new ReceptionistHomeController(null);
            }
        });

    }

    public void cancelButtonListener(JButton cancelButton){
        this.cancelButton = cancelButton;
        this.cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //changes of updation will reflect in the dataBase

                new ReceptionistHomeController(null);
            }
        });

    }

}
