package listeners;

import controller.AddStaffManagerController;
import controller.CheckInController;
import controller.ReceptionistHomeController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dell on 7/13/2017.
 */
public class CheckInPanelListeners {
    private JButton cancelButton;
    private JButton submitButton;
    public void cancelBottonListener(JButton cancelButton) {
        this.cancelButton = cancelButton;
        this.cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("listener on cancelbutton");
                new ReceptionistHomeController(CheckInController.employeeDetails);
            }
        });
    }

    public void submitBottonListener(JButton submitButton) {
        this.submitButton = submitButton;
        this.submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("listener on submitbutton");
                CheckInController.validate();
            }
        });
    }
}
