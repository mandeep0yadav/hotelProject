package listeners;

import controller.UpdateStaffDetailsController;
import controller.UpdateStaffManagerDetailsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dell on 7/14/2017.
 */
public class UpdateStaffManagerPanelListeners {


    private JButton updateButton;


    public void updateButtonListener(JButton updateButton){
        this.updateButton=updateButton;
        this.updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UpdateStaffManagerDetailsController();
            }
        });

    }
}
