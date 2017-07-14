package listeners;

import controller.AdminHomeController;
import controller.ManagerHomeController;
import controller.UpdateStaffManagerController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dell on 7/14/2017.
 */
public class UpdateStaffManagerDetailsListeners {

    private JButton updateButton;


    public void updateButtonListener(JButton updateButton) {
        this.updateButton = updateButton;
        this.updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //changes of updation will reflect in the dataBase

                new ManagerHomeController(UpdateStaffManagerController.employeeDetails);
            }
        });

    }
}
