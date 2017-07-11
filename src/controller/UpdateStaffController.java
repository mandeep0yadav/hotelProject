package controller;

import GUI.AdminHomePanel;
import GUI.UpdateStaffPanel;
import GUI.ViewStaffPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class UpdateStaffController {
    private JFrame initialFrame;
    private UpdateStaffPanel updateStaffPanel;


    private AdminHomePanel adminHomePanel;

    public UpdateStaffController(){

        System.out.println("Controls in updateStaff Controller...");

        updateStaffPanel = new UpdateStaffPanel();
        adminHomePanel = new AdminHomePanel();
        initialFrame = JframeSingleTon.getjFrame();

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
        initialFrame.add(updateStaffPanel.getUpdateStaffPanel());
        initialFrame.add(adminHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
