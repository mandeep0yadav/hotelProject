package listeners;

import controller.AddStaffManagerController;
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

    public void cancelBottonListener(JButton cancelButton) {
        this.cancelButton = cancelButton;
        this.cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("listener on cancelbutton");

                new ReceptionistHomeController();
            }
        });
    }
}
