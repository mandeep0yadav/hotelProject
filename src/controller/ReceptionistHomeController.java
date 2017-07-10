package controller;

import GUI.AboutUsPanel;
import GUI.ReceptionistHomePanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Dell on 7/10/2017.
 */
public class ReceptionistHomeController {

    private JFrame initialFrame;
    private ReceptionistHomePanel receptionistHomePanel;

    public ReceptionistHomeController(){

        System.out.println("Controls in Receptionist Controller...");

        receptionistHomePanel = new ReceptionistHomePanel();
        initialFrame = JframeSingleTon.getjFrame();

        setproperty();

        addComponent();
    }

    private void setproperty(){

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/receptionWritten.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setExtendedState(initialFrame.MAXIMIZED_BOTH);
        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(receptionistHomePanel.getReceptionistHomePanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }

}
