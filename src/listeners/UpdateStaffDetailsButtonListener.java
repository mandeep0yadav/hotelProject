package listeners;

import controller.AdminHomeController;
import controller.UpdateStaffDetailsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dell on 7/13/2017.
 */
public class UpdateStaffDetailsButtonListener {
    private JButton updateButton;


    public void updateButtonListener(JButton updateButton){
        this.updateButton=updateButton;
        this.updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //changes of updation will reflect in the dataBase

                new AdminHomeController(UpdateStaffDetailsController.employeeDetails);
            }
        });

    }
}
