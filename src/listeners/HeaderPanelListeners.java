package listeners;

import controller.ContactController;
import controller.FAQsController;
import controller.LaunchController;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Himanshu on 06-07-2017.
 */
public class HeaderPanelListeners {

    private JLabel contactLabel;

    private JLabel faqsLabel;

    private JLabel homeLabel;

    public void contactLabelListener(JLabel contactLabel){
        this.contactLabel = contactLabel;
        this.contactLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Listener on CONTACT Label");
                new ContactController();
            }
        });
    }

    public void faqsLabelListener(JLabel faqsLabel) {
        this.faqsLabel = faqsLabel;
        this.faqsLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Listener on FAQS Label");
                new FAQsController();
            }
        });
    }

    public void homeLabelListener(JLabel homeLabel) {
        this.homeLabel = homeLabel;
        this.homeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Listener on HOME Label");
                new LaunchController();
            }
        });
    }
}
