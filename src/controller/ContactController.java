package controller;

import GUI.ContactsPanel;
import GUI.LaunchPanel;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Himanshu on 06-07-2017.
 */
public class ContactController {

    private JFrame initialFrame;
    private ContactsPanel contactsPanel;

    public ContactController(){

        contactsPanel = new ContactsPanel();
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
        initialFrame.setResizable(false);

    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderPanel().getHeaderPanel());
        initialFrame.add(contactsPanel.getContactUsPanel());
        initialFrame.add(FooterSingleTon.getFooterPanel().getfooterPanel());

    }
}
