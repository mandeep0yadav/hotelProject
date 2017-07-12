package controller;

import GUI.AboutUsPanel;
import GUI.ForgotPasswordPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Himanshu on 12-07-2017.
 */
public class ForgotPasswordController {

    private JFrame initialFrame ;
    private ForgotPasswordPanel forgotPasswordPanel ;

    public ForgotPasswordController(){

        System.out.println("Controls in Forgot Password Controller...");

        forgotPasswordPanel = new ForgotPasswordPanel();
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
        initialFrame.add(forgotPasswordPanel.getForgotPasswordPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }

}
