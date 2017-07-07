package listeners;

import controller.ContactController;
import controller.FAQsController;
import controller.LaunchController;
import controller.PolicyController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Himanshu on 06-07-2017.
 */
public class HeaderPanelListeners {

    private JLabel contactLabel;

    private JLabel faqsLabel;

    private JLabel homeLabel;

    private JLabel policyLabel;

    private JLabel aboutUs;

    public void contactLabelListener(JLabel contactLabel){
        this.contactLabel = contactLabel;
        this.contactLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Listener on CONTACT Label");
                new ContactController();

                //for color change to show which panel is launched

                homeLabel.setForeground(Color.WHITE);
                policyLabel.setForeground(Color.WHITE);
                //aboutUs.setForeground(Color.white);
                faqsLabel.setForeground(Color.white);
                contactLabel.setForeground(Color.blue);
            }
        });
    }


    public void policyLabelListener(JLabel policyLabel){
        this.policyLabel = policyLabel;
        this.policyLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Listener on policy Label");
                new PolicyController();


                //for color change to show which panel is launched

                homeLabel.setForeground(Color.WHITE);
                policyLabel.setForeground(Color.BLUE);
               // aboutUs.setForeground(Color.white);
                faqsLabel.setForeground(Color.white);
                contactLabel.setForeground(Color.white);

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


                //for color change to show which panel is launched

                homeLabel.setForeground(Color.WHITE);
                policyLabel.setForeground(Color.WHITE);
                //aboutUs.setForeground(Color.white);
                faqsLabel.setForeground(Color.BLUE);
                contactLabel.setForeground(Color.white);
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

                //for color change to show which panel is launched

                homeLabel.setForeground(Color.RED);
                policyLabel.setForeground(Color.WHITE);
                //aboutUs.setForeground(Color.white);
                faqsLabel.setForeground(Color.white);
                contactLabel.setForeground(Color.white);
            }
        });
    }
}
