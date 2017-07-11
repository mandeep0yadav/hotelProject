package controller;

import GUI.AdminHomePanel;
import GUI.ViewStaffPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by jatin kumar vimal on 11/07/2017.
 */
public class ViewStaffController
{
    private JFrame initialFrame;
    private ViewStaffPanel viewStaffPanel;

    //for showing receptionist options
    private AdminHomePanel adminHomePanel;

    public ViewStaffController(){

        System.out.println("Controls in view staff Controller...");

        viewStaffPanel = new ViewStaffPanel();
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
        initialFrame.add(viewStaffPanel.getViewStaffPanel());
        initialFrame.add(adminHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
