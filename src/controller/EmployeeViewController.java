package controller;

import GUI.AdminHomePanel;
import GUI.EmployeeViewPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by jatin kumar vimal on 11/07/2017.
 */
public class EmployeeViewController
{
    private JFrame initialFrame;
    private EmployeeViewPanel employeeViewPanel;

    //for showing receptionist options
    private AdminHomePanel adminHomePanel;

    public EmployeeViewController(){

        System.out.println("Controls in employee Controller...");

        employeeViewPanel = new EmployeeViewPanel();
        adminHomePanel = new AdminHomePanel();
        initialFrame = JframeSingleTon.getjFrame();

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
        initialFrame.add(employeeViewPanel.getEmployeeViewPanel());
        initialFrame.add(adminHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
