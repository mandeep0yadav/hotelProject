package controller;

import javax.swing.*;

import GUI.*;
import singleton.JframeSingleTon;

/**
 * Created by nirmit on 4/7/17.
 */
public class LaunchController {


    private JFrame initialFrame;
    private LaunchPanel launchPanel;

    public LaunchController(){

        launchPanel = new LaunchPanel();
        initialFrame = JframeSingleTon.getjFrame();

        setproperty();

        addComponent();
    }

    private void setproperty(){

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/redWall.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setExtendedState(initialFrame.MAXIMIZED_BOTH);
        initialFrame.setVisible(true);
        //initialFrame.setResizable(false);

    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(launchPanel.getLaunchPanel());

    }

}
