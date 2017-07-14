package controller;

import GUI.AdminHomePanel;
import ValueObjects.EmployeeDetails;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/10/2017.
 */
public class AdminHomeController {
    private JFrame initialFrame;
    private AdminHomePanel adminHomePanel;
    public static EmployeeDetails employeeDetails;

    public AdminHomeController(EmployeeDetails employeeDetails){

        System.out.println("Controls in Admin Controller...");

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
        initialFrame.add(adminHomePanel.getAdminHomePanel());
        initialFrame.add(adminHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
