package controller;

import GUI.AboutUsPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Himanshu on 08-07-2017.
 */
public class AboutUsController {

    private JFrame initialFrame;
    private AboutUsPanel aboutUsPanel;

    public AboutUsController(){

        System.out.println("Controls in About Us Controller...");

        aboutUsPanel = new AboutUsPanel();
        initialFrame = JframeSingleTon.getjFrame();

        setproperty();

        addComponent();
    }

    private void setproperty(){

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/doubleRoom2.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(aboutUsPanel.getAboutUsPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }

}
