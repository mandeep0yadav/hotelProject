package controller;

import GUI.UpdateBookingDetails;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Himanshu on 13-07-2017.
 */
public class UpdateBookingDetailsController {

    private JFrame initialFrame;
    private UpdateBookingDetails updateBookingDetails ;

    //for showing receptionist options
//    private ReceptionistHomePanel receptionistHomePanel;

    public UpdateBookingDetailsController(){

        System.out.println("Controls in update Booking Details Controller...");

        updateBookingDetails = new UpdateBookingDetails();
//        receptionistHomePanel = new ReceptionistHomePanel();
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
        initialFrame.add(updateBookingDetails.getUpdateBookingDetailsPanel());
//        initialFrame.add(adminHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());


    }

}
