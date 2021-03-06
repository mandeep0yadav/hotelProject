package GUI;

import listeners.HeaderPanelListeners;
import listeners.HeaderPanelMouseListners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by nirmit on 4/7/17.
 */ public  class HeaderPanel {

    private JPanel HeaderPanel;

    //component in the panel
    public static JLabel homeLabel;
    public static JLabel aboutUs;
    public static JLabel faqs;
    public static JLabel contactUs;
    public static JLabel policy;
    public static JLabel logoImageLabel;

    private ImageIcon hollaLogo;

    //listeners
    private HeaderPanelListeners headerPanelListeners;

    private HeaderPanelMouseListners headerPanelMouseListners;

    public HeaderPanel(){

        System.out.println("Creating Header Panel...");

        HeaderPanel    =   new JPanel();
        homeLabel   =   new JLabel();
        aboutUs     =   new JLabel();
        faqs        =   new JLabel();
        contactUs   =   new JLabel();
        policy      =   new JLabel();

        logoImageLabel  =  new JLabel();

        hollaLogo  = new ImageIcon("src/Images/hollalogo2.png");

        headerPanelListeners = new HeaderPanelListeners();
        headerPanelMouseListners = new HeaderPanelMouseListners();

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
        homeLabel.setForeground(Color.RED);

        contactUs.setFont(new Font("Century Gothic", Font.BOLD, 22));
        contactUs.setForeground(Color.WHITE);

        aboutUs.setFont(new Font("Century Gothic", Font.BOLD, 22));
        aboutUs.setForeground(Color.WHITE);

        faqs.setFont(new Font("Century Gothic", Font.BOLD, 22));
        faqs.setForeground(Color.WHITE);

        policy.setFont(new Font("Century Gothic", Font.BOLD, 22));
        policy.setForeground(Color.WHITE);

        logoImageLabel.setIcon(hollaLogo);

    }

    private void setBounds(){
        //setting panel bounds
        HeaderPanel.setBounds(0, 0, 1400, 140);

        //adding bounds to other components;
        homeLabel.setBounds(740,70,100,30);
        policy.setBounds(850,70,100,30);
        aboutUs.setBounds(970,70,150,30);
        faqs.setBounds(1110,70,100,30);
        contactUs.setBounds(1210,70,150,30);
        logoImageLabel.setBounds(30,20,300,135);

    }

    private void addComponentToPanel(){
        // adding Component to panel
        HeaderPanel.add(homeLabel);
        HeaderPanel.add(aboutUs);
        HeaderPanel.add(contactUs);
        HeaderPanel.add(faqs);
        HeaderPanel.add(policy);
        HeaderPanel.add(logoImageLabel);
    }

    public JPanel getHeaderPanel(){
        return this.HeaderPanel;
    }


   private void addListeners() {

        headerPanelListeners.contactLabelListener(contactUs);

        headerPanelListeners.faqsLabelListener(faqs);

        headerPanelListeners.homeLabelListener(homeLabel);

        headerPanelListeners.policyLabelListener(policy);

        headerPanelListeners.aboutusLabelListener(aboutUs);

        headerPanelListeners.hollaLogoListener(logoImageLabel);


       headerPanelMouseListners.contactLabelMouseListener(contactUs);

       headerPanelMouseListners.faqsLabelMouseListener(faqs);

       headerPanelMouseListners.homeLabelMouseListener(homeLabel);

       headerPanelMouseListners.policyLabelMouseListener(policy);

       headerPanelMouseListners.aboutusLabelListener(aboutUs);



   }



}
