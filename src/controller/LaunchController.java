package controller;

import javax.swing.*;

import GUI.*;

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
        //LogInScreenPanel logInScreenPanel=new LogInScreenPanel();
        //ReceptionistHomePanel receptionistHomePanel=new ReceptionistHomePanel();
        //ManagerHomePanel managerHomePanel=new ManagerHomePanel();
        //AdminHomePanel adminHomePanel=new AdminHomePanel();
        RegisterPanel registerPanel=new RegisterPanel();


        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/redwall.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setExtendedState(initialFrame.MAXIMIZED_BOTH);

        initialFrame.add(headerPanel.getHeaderPanel());
        initialFrame.add(footerPanel.getfooterPanel());
        //initialFrame.add(launchPanel.getLaunchPanel());
        //initialFrame.add(receptionistHomePanel.getReceptionistHomePanel());
        //initialFrame.add(logInScreenPanel.getlogInScreenPanel());
        //initialFrame.add(managerHomePanel.getManagerHomePanel());
       // initialFrame.add(adminHomePanel.getAdminHomePanel());
        initialFrame.add(registerPanel.getRegisterPanel());

        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }
}
