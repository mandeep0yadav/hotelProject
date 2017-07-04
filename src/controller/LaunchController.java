package controller;

import javax.swing.*;
import GUI.HeaderPanel;
import GUI.FooterPanel;
import GUI.LaunchPanel;

/**
 * Created by nirmit on 4/7/17.
 */
public class LaunchController {

    public static void main(String args[]){

        //creating new initialFrame for the first time
        JFrame initialFrame = new JFrame();

        //initialising all the panels that needs tobe used
        HeaderPanel headerPanel = new HeaderPanel();
        FooterPanel footerPanel = new FooterPanel();
        LaunchPanel launchPanel = new LaunchPanel();


        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/living_style_interior_furniture_modern_39286_1920x1200.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setExtendedState(initialFrame.MAXIMIZED_BOTH);

        initialFrame.add(headerPanel.getHeaderPanel());
        initialFrame.add(launchPanel.getLaunchPanel());
        initialFrame.add(footerPanel.getfooterPanel());

        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }
}
