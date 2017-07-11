package listeners;

import controller.AddStaffController;
import controller.DeleteStaffController;
import controller.UpdateStaffController;
import controller.ViewStaffController;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dell on 7/11/2017.
 */
public class AdminOptionPanelListeners {


    private JLabel updateStaff;

    private JLabel deleteStaff;

    private JLabel viewStaff;

    private JLabel addStaff;


    public void viewStaffListener(JLabel viewStaff){
        this.viewStaff = viewStaff;
        this.viewStaff.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on view emplloyee Label");
                new ViewStaffController();


            }
        });
    }
    public void addStaffListener(JLabel addStaff) {
        this.addStaff = addStaff;
        this.addStaff.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on add staff Label");
                new AddStaffController();



            }
        });
    }
    public void deleteStaffListener(JLabel deleteStaff) {
        this.deleteStaff = deleteStaff;
        this.deleteStaff.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on deleteStaff Label");
                new DeleteStaffController();



            }
        });
    }
    public void updateStaffListener(JLabel updateStaff) {
        this.updateStaff = updateStaff;
        this.updateStaff.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on UpdateStaff Label");
                new UpdateStaffController();



            }
        });
    }


}
