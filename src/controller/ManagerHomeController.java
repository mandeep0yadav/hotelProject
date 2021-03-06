package controller;

import GUI.ManagerHomePanel;
import GUI.ReceptionistHomePanel;
import ValueObjects.EmployeeDetails;
import ValueObjects.EmployeeLevel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/10/2017.
 */
public class ManagerHomeController {
    private JFrame initialFrame;
    private ManagerHomePanel managerHomePanel;
    public static   EmployeeDetails employeeDetails;
    public ManagerHomeController(EmployeeDetails employeeDetails){

        System.out.println("Controls in Manager Controller...");

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
        initialFrame.add(managerHomePanel.getManagerHomePanel());
        initialFrame.add(managerHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
