package GUI;

import listeners.AdminOptionPanelListeners;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class AdminHomePanel {

    private JPanel adminHomePanel;
    private JPanel showOptionsPanel;


    private JLabel viewStaff;
    private JLabel addStaff;
    private JLabel deleteStaff;
    private JLabel updateStaff;
    private JLabel welcomeLabel;

    private AdminOptionPanelListeners adminOptionPanelListeners;


    public AdminHomePanel() {
        System.out.println("Creating Admin panel...");
        adminHomePanel =new JPanel();
        showOptionsPanel=new JPanel();
        viewStaff = new JLabel();
        addStaff = new JLabel();
        deleteStaff = new JLabel();
        updateStaff = new JLabel();
        welcomeLabel=new JLabel();

        adminOptionPanelListeners=new AdminOptionPanelListeners();


        setProperty();

        setBounds();

        addComponentToPanel();




        addListeners();

        System.out.println("Admin Panel Created...");

    }

    private void addListeners() {
        adminOptionPanelListeners.employeeViewListeners(viewStaff);
    }

    private void setProperty() {
        viewStaff.setText("View Staff");
        addStaff.setText("Add Staff");
        deleteStaff.setText("Delete Staff");
        updateStaff.setText("Update Staff");
        welcomeLabel.setText("Welcome Admin");

        showOptionsPanel.setLayout(null);
        showOptionsPanel.setOpaque(false);
        adminHomePanel.setLayout(null);
        adminHomePanel.setOpaque(false);

        viewStaff.setFont(new Font("Century Gothic",Font.BOLD, 20));
        viewStaff.setForeground(Color.WHITE);
        addStaff.setFont(new Font("Century Gothic",Font.BOLD, 20));
        addStaff.setForeground(Color.WHITE);
        deleteStaff.setFont(new Font("Century Gothic",Font.BOLD, 20));
        deleteStaff.setForeground(Color.WHITE);
        updateStaff.setFont(new Font("Century Gothic",Font.BOLD, 20));
        updateStaff.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("Century Gothic",Font.BOLD, 40));
        welcomeLabel.setForeground(Color.WHITE);

    }

    private void setBounds() {
        adminHomePanel.setBounds(0,140,1100,550);
        showOptionsPanel.setBounds(1100,140,300,550);
        viewStaff.setBounds(50,150,300,30);
        addStaff.setBounds(50,200,300,30);
        deleteStaff.setBounds(50,250,300,30);
        updateStaff.setBounds(50,300,300,30);
        welcomeLabel.setBounds(360,100,500,200);

    }

    private void addComponentToPanel() {
        showOptionsPanel.add(viewStaff);
        showOptionsPanel.add(addStaff);
        showOptionsPanel.add(deleteStaff);
        showOptionsPanel.add(updateStaff);
        adminHomePanel.add(welcomeLabel);
        adminHomePanel.add(showOptionsPanel);
    }

    public void destroy() {
        adminHomePanel.setVisible(false);
    }

    public JPanel getAdminHomePanel(){
        return this.adminHomePanel;
    }

    public JPanel getShowOptionsPanel(){return  this.showOptionsPanel;}
}
