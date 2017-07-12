package controller;

import GUI.AdminHomePanel;
import GUI.DeleteStaffPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class DeleteStaffController {
    private JFrame initialFrame;
    private DeleteStaffPanel deleteStaffPanel;


    private AdminHomePanel adminHomePanel;

    public DeleteStaffController(){

        System.out.println("Controls in DeleteStaff Controller...");

        deleteStaffPanel = new DeleteStaffPanel();
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
        initialFrame.add(deleteStaffPanel.getDeleteStaffPanel());
        initialFrame.add(adminHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
