package listeners;

import controller.*;

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

    private JLabel aboutUsLabel;

    private JLabel logoImageLabel;

    public void contactLabelListener(JLabel contactLabel){
        this.contactLabel = contactLabel;
        this.contactLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on CONTACT Label");
                new ContactController();

                //for color change to show which panel is launched

                homeLabel.setForeground(Color.white);
                policyLabel.setForeground(Color.white);
                aboutUsLabel.setForeground(Color.white);
                faqsLabel.setForeground(Color.white);
                contactLabel.setForeground(Color.red);
            }
        });
    }


    public void policyLabelListener(JLabel policyLabel){
        this.policyLabel = policyLabel;
        this.policyLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on policy Label");
                new PolicyController();


                //for color change to show which panel is launched

                homeLabel.setForeground(Color.white);
                policyLabel.setForeground(Color.red);
                aboutUsLabel.setForeground(Color.white);
                faqsLabel.setForeground(Color.white);
                contactLabel.setForeground(Color.white);


            }
        });
    }

    public void faqsLabelListener(JLabel faqsLabel) {
        this.faqsLabel = faqsLabel;
        this.faqsLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on FAQS Label");
                new FAQsController();


                //for color change to show which panel is launched

                homeLabel.setForeground(Color.white);
                policyLabel.setForeground(Color.white);
                aboutUsLabel.setForeground(Color.white);
                faqsLabel.setForeground(Color.red);
                contactLabel.setForeground(Color.white);
            }
        });
    }

    public void homeLabelListener(JLabel homeLabel) {
        this.homeLabel = homeLabel;
        this.homeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on HOME Label");
                new LaunchController();

                //for color change to show which panel is launched

                homeLabel.setForeground(Color.red);
                policyLabel.setForeground(Color.white);
                aboutUsLabel.setForeground(Color.white);
                faqsLabel.setForeground(Color.white);
                contactLabel.setForeground(Color.white);
            }
        });
    }

    public void aboutusLabelListener(JLabel aboutUsLabel) {
        this.aboutUsLabel = aboutUsLabel;
        this.aboutUsLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on About Us Label");
                new AboutUsController();

                //for color change to show which panel is launched

                homeLabel.setForeground(Color.white);
                policyLabel.setForeground(Color.white);
                aboutUsLabel.setForeground(Color.red);
                faqsLabel.setForeground(Color.white);
                contactLabel.setForeground(Color.white);
            }
        });

    }
    public void hollaLogoListener(JLabel logoImageLabel) {
        this.logoImageLabel = logoImageLabel;
        this.logoImageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Listener on logo Label");
                new LaunchController();

                //for color change to show which panel is launched

                homeLabel.setForeground(Color.red);
                policyLabel.setForeground(Color.white);
                aboutUsLabel.setForeground(Color.white);
                faqsLabel.setForeground(Color.white);
                contactLabel.setForeground(Color.white);
            }
        });
    }

}
