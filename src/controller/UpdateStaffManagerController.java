package controller;

import GUI.AdminHomePanel;
import GUI.ManagerHomePanel;
import GUI.UpdateStaffPanel;
import listeners.ManagerOptionsPanelListeners;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/12/2017.
 */
public class UpdateStaffManagerController {

    private JFrame initialFrame;
    private UpdateStaffPanel updateStaffPanel;


    private ManagerHomePanel managerHomePanel;

    public UpdateStaffManagerController(){

        System.out.println("Controls in updateStaffManager Controller...");

        updateStaffPanel = new UpdateStaffPanel();
        managerHomePanel = new ManagerHomePanel();
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
        initialFrame.add(managerHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
