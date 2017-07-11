package controller;

import GUI.IssueBillPanel;
import GUI.ReceptionistHomePanel;
import GUI.RoomViewPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/12/2017.
 */
public class ViewRoomController {



    private JFrame initialFrame;
    private RoomViewPanel roomViewPanel;

    //for showing receptionist options
    private ReceptionistHomePanel receptionistHomePanel;

    public ViewRoomController(){

        System.out.println("Controls in room view Controller...");

        roomViewPanel = new RoomViewPanel();
        receptionistHomePanel = new ReceptionistHomePanel();
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
        initialFrame.add(roomViewPanel.getRoomViewPanel());
        initialFrame.add(receptionistHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
