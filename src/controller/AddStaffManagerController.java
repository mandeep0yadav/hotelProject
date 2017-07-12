package controller;

import GUI.AddStaffPanel;
import GUI.AdminHomePanel;
import GUI.ManagerHomePanel;
import GUI.UpdateStaffPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/12/2017.
 */
public class AddStaffManagerController {

    private JFrame initialFrame;
    private AddStaffPanel addStaffPanel;


    private ManagerHomePanel managerHomePanel;

    public AddStaffManagerController(){

        System.out.println("Controls in updateStaff Controller...");

        addStaffPanel = new AddStaffPanel();
        managerHomePanel = new ManagerHomePanel();
        initialFrame = JframeSingleTon.getjFrame();

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
        initialFrame.add(addStaffPanel.getAddStaffPanel());
        initialFrame.add(managerHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
