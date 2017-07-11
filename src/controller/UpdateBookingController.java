package controller;

import GUI.IssueBillPanel;
import GUI.ReceptionistHomePanel;
import GUI.UpdateBookingPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/12/2017.
 */
public class UpdateBookingController {


    private JFrame initialFrame;
    private UpdateBookingPanel updateBookingPanel;

    private ReceptionistHomePanel receptionistHomePanel;

    public UpdateBookingController(){

        System.out.println("Controls in updatebooking Controller...");

        updateBookingPanel = new UpdateBookingPanel();
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
        initialFrame.add(updateBookingPanel.getUpdateBookingPanel());
        initialFrame.add(receptionistHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
