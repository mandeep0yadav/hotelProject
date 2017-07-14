package listeners;

import controller.AddStaffController;
import controller.AdminHomeController;
import controller.UpdateStaffDetailsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dell on 7/13/2017.
 */
public class UpdateStaffPanelListeners {

    private JButton updateButton;


    public void updateButtonListener(JButton updateButton){
        this.updateButton=updateButton;
        this.updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdateStaffDetailsController(AdminHomeController.employeeDetails);
            }
        });

    }
}
