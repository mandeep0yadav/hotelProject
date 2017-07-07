package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class AdminHomePanel {

    private JPanel adminHomePanel;
    private JPanel showOptionsPanel;


    private JLabel viewDetails;
    private JLabel addEmployee;
    private JLabel deleteEmployee;
    private JLabel updateEmployee;
    private JLabel welcomeLabel;


    public AdminHomePanel() {
        System.out.println("Creating Admin panel...");
        adminHomePanel =new JPanel();
        showOptionsPanel=new JPanel();
        viewDetails = new JLabel();
        addEmployee = new JLabel();
        deleteEmployee = new JLabel();
        updateEmployee = new JLabel();
        welcomeLabel=new JLabel();


        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Admin Panel Created...");

    }

    private void setProperty() {
        viewDetails.setText("View Details");
        addEmployee.setText("Add Employee");
        deleteEmployee.setText("Delete Employee");
        updateEmployee.setText("Update Employee");
        welcomeLabel.setText("Welcome Admin/0wner");

        showOptionsPanel.setLayout(null);
        showOptionsPanel.setOpaque(false);
        adminHomePanel.setLayout(null);
        adminHomePanel.setOpaque(false);

        viewDetails.setFont(new Font("Century Gothic",Font.BOLD, 20));
        viewDetails.setForeground(Color.WHITE);
        addEmployee.setFont(new Font("Century Gothic",Font.BOLD, 20));
        addEmployee.setForeground(Color.WHITE);
        deleteEmployee.setFont(new Font("Century Gothic",Font.BOLD, 20));
        deleteEmployee.setForeground(Color.WHITE);
        updateEmployee.setFont(new Font("Century Gothic",Font.BOLD, 20));
        updateEmployee.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("Century Gothic",Font.BOLD, 40));
        welcomeLabel.setForeground(Color.WHITE);

    }

    private void setBounds() {
        adminHomePanel.setBounds(5,140,1400,550);
        showOptionsPanel.setBounds(1100,0,300,550);
        viewDetails.setBounds(50,100,300,30);
        addEmployee.setBounds(50,150,300,30);
        deleteEmployee.setBounds(50,200,300,30);
        updateEmployee.setBounds(50,350,300,30);
        welcomeLabel.setBounds(360,100,500,200);

    }

    private void addComponentToPanel() {
        showOptionsPanel.add(viewDetails);
        showOptionsPanel.add(addEmployee);
        showOptionsPanel.add(deleteEmployee);
        showOptionsPanel.add(updateEmployee);
        adminHomePanel.add(welcomeLabel);
        adminHomePanel.add(showOptionsPanel);
    }

    public void destroy() {
        adminHomePanel.setVisible(false);
    }

    public JPanel getAdminHomePanel(){
        return this.adminHomePanel;
    }
}
