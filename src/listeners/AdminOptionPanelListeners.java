package listeners;

import controller.EmployeeViewController;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dell on 7/11/2017.
 */
public class AdminOptionPanelListeners {


    private JLabel employeeUpdate;

    private JLabel viewDetails;

    private JLabel employeeView;

    private JLabel empolyeeDelete;


    public void employeeViewListeners(JLabel employeeView){
        this.employeeView = employeeView;
        this.employeeView.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on view emplloyee Label");
                new EmployeeViewController();

                //for color change to show which panel is launched

            }
        });
    }

}
