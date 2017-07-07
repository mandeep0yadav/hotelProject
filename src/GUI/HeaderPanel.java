package GUI;

import listeners.HeaderPanelListeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by nirmit on 4/7/17.
 */
public class HeaderPanel {

    private JPanel HeaderPanel;

    //component in the panel
    private JLabel homeLabel;
    private JLabel aboutUs;
    private JLabel faqs;
    private JLabel contactUs;
    private JLabel policy;

    //listeners
    private HeaderPanelListeners headerPanelListeners;

    public HeaderPanel(){

        System.out.println("Creating Header Panel...");

        HeaderPanel    =   new JPanel();
        homeLabel   =   new JLabel();
        aboutUs     =   new JLabel();
        faqs        =   new JLabel();
        contactUs   =   new JLabel();
        policy      =   new JLabel();

        headerPanelListeners = new HeaderPanelListeners();

        setProperty();

        setBounds();

        addComponentToPanel();

        addListeners();

        System.out.println("Header Panel Created...");
    }

    private void setProperty(){

        //setting panel property
        HeaderPanel.setLayout(null);
        HeaderPanel.setOpaque(false);


        //setting text to the components added
        homeLabel.setText("Home");
        aboutUs.setText("About us");
        faqs.setText("FAQS");
        contactUs.setText("Contacts");
        policy.setText("Policy");

        //applying properties to the label

        homeLabel.setFont(new Font("Century Gothic",Font.BOLD, 22));
        homeLabel.setForeground(Color.WHITE);

        contactUs.setFont(new Font("Century Gothic", Font.BOLD, 22));
        contactUs.setForeground(Color.WHITE);

        aboutUs.setFont(new Font("Century Gothic", Font.BOLD, 22));
        aboutUs.setForeground(Color.WHITE);

        faqs.setFont(new Font("Century Gothic", Font.BOLD, 22));
        faqs.setForeground(Color.WHITE);

        policy.setFont(new Font("Century Gothic", Font.BOLD, 22));
        policy.setForeground(Color.WHITE);

    }

    private void setBounds(){
        //setting panel bounds
        HeaderPanel.setBounds(0, 0, 1400, 140);

        //adding bounds to other components;
        homeLabel.setBounds(740,70,100,30);
        policy.setBounds(840,70,100,30);
        aboutUs.setBounds(950,70,100,30);
        faqs.setBounds(1080,70,100,30);
        contactUs.setBounds(1170,70,150,30);

    }

    private void addComponentToPanel(){
        // adding Component to panel
        HeaderPanel.add(homeLabel);
        HeaderPanel.add(aboutUs);
        HeaderPanel.add(contactUs);
        HeaderPanel.add(faqs);
        HeaderPanel.add(policy);
    }

    public JPanel getHeaderPanel(){
        return this.HeaderPanel;
    }


   private void addListeners() {

        headerPanelListeners.contactLabelListener(contactUs);

        headerPanelListeners.faqsLabelListener(faqs);

   }



}
