package controller;

import GUI.AdminHomePanel;
import GUI.ReceptionistHomePanel;
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

    public AdminHomeController(){

        System.out.println("Controls in Admin Controller...");

        adminHomePanel = new AdminHomePanel();
        initialFrame = JframeSingleTon.getjFrame();

        setproperty();

        addComponent();
    }

    private void setproperty(){

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/room.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setExtendedState(initialFrame.MAXIMIZED_BOTH);
        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(adminHomePanel.getAdminHomePanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
