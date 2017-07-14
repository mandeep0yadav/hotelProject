package controller;

import GUI.*;
import ValueObjects.EmployeeDetails;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/12/2017.
 */
public class AddStaffManagerController {

    private JFrame initialFrame;
    private AddStaffManagerPanel addStaffManagerPanel;
    public static EmployeeDetails employeeDetails;

    private ManagerHomePanel managerHomePanel;

    public AddStaffManagerController(EmployeeDetails employeeDetails){

        System.out.println("Controls in updateStaff Controller...");

        addStaffManagerPanel = new AddStaffManagerPanel();
        managerHomePanel = new ManagerHomePanel();
        initialFrame = JframeSingleTon.getjFrame();
        this.employeeDetails = employeeDetails;
        setproperty();

        addComponent();
    }

    private void setproperty(){

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/hotel.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(addStaffManagerPanel.getAddStaffManagerPanel());
        initialFrame.add(managerHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
