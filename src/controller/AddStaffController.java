package controller;

import GUI.*;
import ValueObjects.EmployeeDetails;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class AddStaffController {


    private JFrame initialFrame;
    private AddStaffPanel addStaffPanel;
    public static EmployeeDetails employeeDetails;
    //for showing receptionist options
    private AdminHomePanel adminHomePanel;

    public AddStaffController(EmployeeDetails employeeDetails){

        System.out.println("Controls in Issue Controller...");

        addStaffPanel = new AddStaffPanel();
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
        initialFrame.add(addStaffPanel.getAddStaffPanel());
        initialFrame.add(adminHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());


    }
}
