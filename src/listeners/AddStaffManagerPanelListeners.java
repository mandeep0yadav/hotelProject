package listeners;

import GUI.ManagerHomePanel;
import controller.AddStaffManagerController;
import controller.AdminHomeController;
import controller.ManagerHomeController;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dell on 7/14/2017.
 */
public class AddStaffManagerPanelListeners {


    private JButton registerButton;

    public void addStaffButtonListener(JButton registerButton){
        this.registerButton = registerButton;
        this.registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on add Staff Label");
                new ManagerHomeController(AddStaffManagerController.employeeDetails);

                //for color change to show which panel is launched

            }
        });
    }
}
