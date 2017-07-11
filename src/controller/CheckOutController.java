package controller;

import GUI.CheckOutPanel;
import GUI.IssueBillPanel;
import GUI.ReceptionistHomePanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/12/2017.
 */
public class CheckOutController {


    private JFrame initialFrame;
    private CheckOutPanel checkOutPanel;

    //for showing receptionist options
    private ReceptionistHomePanel receptionistHomePanel;

    public CheckOutController(){

        System.out.println("Controls in Checkout Controller...");

        checkOutPanel = new CheckOutPanel();
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
        initialFrame.add(checkOutPanel.getCheckOutPanel());
        initialFrame.add(receptionistHomePanel.getShowOptionsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }
}
