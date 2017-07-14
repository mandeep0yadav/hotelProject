package controller;

import GUI.AddStaffPanel;
import GUI.AdminHomePanel;
import GUI.UpdateStaffDetails;
import ValueObjects.EmployeeDetails;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/13/2017.
 */
public class UpdateStaffDetailsController {




    private JFrame initialFrame;
    private UpdateStaffDetails updateStaffDetails;
    public static EmployeeDetails employeeDetails;
    //for showing receptionist options
    private AdminHomePanel adminHomePanel;

    public UpdateStaffDetailsController(EmployeeDetails employeeDetails){

        System.out.println("Controls in update staffdetails Controller...");

        updateStaffDetails = new UpdateStaffDetails();
        adminHomePanel = new AdminHomePanel();
        initialFrame = JframeSingleTon.getjFrame();
        this.employeeDetails = employeeDetails;
        setproperty();

        addComponent();
    }

    private void setproperty(){

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/room.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(updateStaffDetails.getUpdateStaffDetailsPanel());
        initialFrame.add(adminHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());


    }
}
