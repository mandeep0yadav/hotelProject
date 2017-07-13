package controller;

import GUI.AdminHomePanel;
import GUI.ManagerHomePanel;
import GUI.UpdateStaffDetails;
import GUI.UpdateStaffManagerDetailsPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/14/2017.
 */
public class UpdateStaffManagerDetailsController {





    private JFrame initialFrame;
    private UpdateStaffManagerDetailsPanel updateStaffManagerDetailsPanel;

    //for showing receptionist options
    private ManagerHomePanel managerHomePanel;

    public UpdateStaffManagerDetailsController(){

        System.out.println("Controls in update staffdetails Controller...");

        updateStaffManagerDetailsPanel = new UpdateStaffManagerDetailsPanel();
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
        initialFrame.add(updateStaffManagerDetailsPanel.getUpdateStaffManagerDetailsPanel());
        initialFrame.add(managerHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());


    }}
