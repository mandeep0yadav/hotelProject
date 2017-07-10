package listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Dell on 7/8/2017.
 */
public class HeaderPanelMouseListners {

    private JLabel contactLabel;

    private JLabel faqsLabel;

    private JLabel homeLabel;

    private JLabel policyLabel;

    private JLabel aboutUsLabel;


    public void contactLabelMouseListener(JLabel contactLabel){
        this.contactLabel=contactLabel;
        this.contactLabel.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                contactLabel.setFont(new Font("Century Gothic", Font.BOLD, 26));
            }
            public void mouseExited(MouseEvent e){
                contactLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
            }
        });

    }

    public void faqsLabelMouseListener(JLabel faqsLabel){
        this.faqsLabel=faqsLabel;
        this.faqsLabel.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                faqsLabel.setFont(new Font("Century Gothic", Font.BOLD, 25));
            }
            public void mouseExited(MouseEvent e){
                faqsLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
            }
        });

    }

    public void homeLabelMouseListener(JLabel homeLabel){
        this.homeLabel=homeLabel;
        this.homeLabel.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                homeLabel.setFont(new Font("Century Gothic", Font.BOLD, 26));
            }
            public void mouseExited(MouseEvent e){
                homeLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
            }
        });

    }

    public void policyLabelMouseListener(JLabel policyLabel){
        this.policyLabel=policyLabel;
        this.policyLabel.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                policyLabel.setFont(new Font("Century Gothic", Font.BOLD, 26));
            }
            public void mouseExited(MouseEvent e){
                policyLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
            }
        });

    }

    public void aboutusLabelListener(JLabel aboutUsLabel){
        this.aboutUsLabel=aboutUsLabel;
        this.aboutUsLabel.addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                aboutUsLabel.setFont(new Font("Century Gothic", Font.BOLD, 26));
            }
            public void mouseExited(MouseEvent e){
                aboutUsLabel.setFont(new Font("Century Gothic", Font.BOLD, 22));
            }
        });

    }




}
