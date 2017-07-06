package listeners;

import GUI.HeaderPanel;
import GUI.LaunchPanel;
import controller.ContactController;
import controller.LoginController;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Himanshu on 06-07-2017.
 */
public class HeaderPanelListeners {

    private JLabel contactLabel;
    public void contactLabelListener(JLabel contactLabel){
        this.contactLabel = contactLabel;
        this.contactLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new LaunchPanel().destroy();
                new ContactController();
            }
        });
    }
}
