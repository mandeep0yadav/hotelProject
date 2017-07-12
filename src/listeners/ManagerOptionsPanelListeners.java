package listeners;

import controller.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dell on 7/11/2017.
 */
public class ManagerOptionsPanelListeners {



    private JLabel updateStaff;

    private JLabel addStaff;

    public void addStaffListener(JLabel addStaff) {
        this.addStaff = addStaff;
        this.addStaff.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on add staff Label");
                new AddStaffManagerController();



            }
        });
    }

    public void updateStaffListener(JLabel updateStaff) {
        this.updateStaff = updateStaff;
        this.updateStaff.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on UpdateStaff Label");
                new UpdateStaffManagerController();



            }
        });
    }

}
