package GUI;

import listeners.ManagerOptionsPanelListeners;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class ManagerHomePanel {

    private JPanel managerHomePanel;
    private JPanel showOptionsPanel;

    private JLabel addStaff;
    private JLabel updateStaff;
    private JLabel welcomeLabel;

    private ManagerOptionsPanelListeners managerOptionsPanelListeners;


    public ManagerHomePanel() {

        System.out.println("Creating Manager Home Panel...");

        managerHomePanel =new JPanel();
        showOptionsPanel=new JPanel();

        addStaff = new JLabel();
        updateStaff = new JLabel();
        welcomeLabel=new JLabel();

        managerOptionsPanelListeners=new ManagerOptionsPanelListeners();


        setProperty();

        setBounds();

        addComponentToPanel();

        addListeners();

        System.out.println("Manager Home Panel Created...");

    }
    private void addListeners() {

        managerOptionsPanelListeners.addStaffListener(addStaff);

        managerOptionsPanelListeners.updateStaffListener(updateStaff);

    }

    private void setProperty() {
        addStaff.setText("Add Staff");
        updateStaff.setText("Update Staff");
        welcomeLabel.setText("Welcome Manager");

        showOptionsPanel.setLayout(null);
        showOptionsPanel.setOpaque(false);
        managerHomePanel.setLayout(null);
        managerHomePanel.setOpaque(false);

        addStaff.setFont(new Font("Century Gothic",Font.BOLD, 20));
        addStaff.setForeground(Color.WHITE);
        updateStaff.setFont(new Font("Century Gothic",Font.BOLD, 20));
        updateStaff.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("Century Gothic",Font.BOLD, 40));
        welcomeLabel.setForeground(Color.WHITE);

    }

    private void setBounds() {
        managerHomePanel.setBounds(5,140,1100,550);
        showOptionsPanel.setBounds(1100,140,300,550);

        addStaff.setBounds(50,250,300,30);
        updateStaff.setBounds(50,300,300,30);

        welcomeLabel.setBounds(360,100,500,200);

    }

    private void addComponentToPanel() {

        showOptionsPanel.add(updateStaff);
        showOptionsPanel.add(addStaff);
        managerHomePanel.add(welcomeLabel);
//        managerHomePanel.add(showOptionsPanel);
    }

    public void destroy() {
        managerHomePanel.setVisible(false);
        System.out.println("Manager Home Panle Destroyed...");
    }

    public JPanel getManagerHomePanel(){
        return this.managerHomePanel;
    }


    public JPanel getShowOptionsPanel(){return  this.showOptionsPanel;}
}
