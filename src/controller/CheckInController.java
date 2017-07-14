package controller;

import GUI.CheckInPanel;
import GUI.CheckOutPanel;
import GUI.IssueBillPanel;
import GUI.ReceptionistHomePanel;
import ValueObjects.EmployeeDetails;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/12/2017.
 */
public class CheckInController {


    private JFrame initialFrame;
    private CheckInPanel checkInPanel;
    public static EmployeeDetails employeeDetails;

    private ReceptionistHomePanel receptionistHomePanel;

    public CheckInController(EmployeeDetails employeeDetails){

        System.out.println("Controls in checkin Controller...");

        checkInPanel = new CheckInPanel();
        receptionistHomePanel = new ReceptionistHomePanel();
        initialFrame = JframeSingleTon.getjFrame();
        this.employeeDetails = employeeDetails;
        setproperty();

        addComponent();
    }

    private void setproperty(){

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/receptionWritten.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(checkInPanel.getCheckinpanel());
        //initialFrame.add(receptionistHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }

}
