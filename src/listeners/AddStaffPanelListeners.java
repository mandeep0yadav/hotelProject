package listeners;

import controller.AddStaffController;
import controller.AdminHomeController;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Himanshu on 12-07-2017.
 */
public class AddStaffPanelListeners {

    private JButton registerButton;

    public void registerButtonListener(JButton registerButton){
        this.registerButton = registerButton;
        this.registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on CONTACT Label");
                new AdminHomeController(AddStaffController.employeeDetails);

                //for color change to show which panel is launched

            }
        });
    }

}
