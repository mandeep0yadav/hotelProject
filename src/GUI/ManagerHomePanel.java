package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class ManagerHomePanel {
    private JPanel managerHomePanel;
    private JPanel showOptionsPanel;


    private JLabel addRoom;
    private JLabel updateRoom;
    private JLabel deleteRoom;
    private JLabel addStaff;
    private JLabel updateStaff;
    private JLabel deleteStaff;
    private JLabel welcomeLabel;


    public ManagerHomePanel() {

        System.out.println("Creating Manager Home Panel...");

        managerHomePanel =new JPanel();
        showOptionsPanel=new JPanel();
        addRoom = new JLabel();
        updateRoom = new JLabel();
        deleteRoom = new JLabel();
        addStaff = new JLabel();
        updateStaff = new JLabel();
        deleteStaff = new JLabel();
        welcomeLabel=new JLabel();


        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Manager Home Panel Created...");

    }

    private void setProperty() {
        addRoom.setText("Add Room");
        updateRoom.setText("Update Room");
        deleteRoom.setText("Delete Room");
        addStaff.setText("Add Staff");
        updateStaff.setText("Update Staff");
        deleteStaff.setText("Delete Staff");
        welcomeLabel.setText("Welcome Manager");

        showOptionsPanel.setLayout(null);
        showOptionsPanel.setOpaque(false);
        managerHomePanel.setLayout(null);
        managerHomePanel.setOpaque(false);

        addRoom.setFont(new Font("Century Gothic",Font.BOLD, 20));
        addRoom.setForeground(Color.WHITE);
        updateRoom.setFont(new Font("Century Gothic",Font.BOLD, 20));
        updateRoom.setForeground(Color.WHITE);
        deleteRoom.setFont(new Font("Century Gothic",Font.BOLD, 20));
        deleteRoom.setForeground(Color.WHITE);
        addStaff.setFont(new Font("Century Gothic",Font.BOLD, 20));
        addStaff.setForeground(Color.WHITE);
        updateStaff.setFont(new Font("Century Gothic",Font.BOLD, 20));
        updateStaff.setForeground(Color.WHITE);
        deleteStaff.setFont(new Font("Century Gothic",Font.BOLD, 20));
        deleteStaff.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("Century Gothic",Font.BOLD, 40));
        welcomeLabel.setForeground(Color.WHITE);

    }

    private void setBounds() {
        managerHomePanel.setBounds(5,140,1400,550);
        showOptionsPanel.setBounds(1100,0,300,550);
        addRoom.setBounds(50,100,300,30);
        updateRoom.setBounds(50,150,300,30);
        deleteRoom.setBounds(50,200,300,30);
        updateStaff.setBounds(50,250,300,30);
        deleteStaff.setBounds(50,300,300,30);
        addStaff.setBounds(50,350,300,30);
        welcomeLabel.setBounds(360,100,500,200);

    }

    private void addComponentToPanel() {
        showOptionsPanel.add(addRoom);
        showOptionsPanel.add(updateRoom);
        showOptionsPanel.add(deleteRoom);
        showOptionsPanel.add(deleteStaff);
        showOptionsPanel.add(updateStaff);
        showOptionsPanel.add(addStaff);
        managerHomePanel.add(welcomeLabel);
        managerHomePanel.add(showOptionsPanel);
    }

    public void destroy() {
        managerHomePanel.setVisible(false);
        System.out.println("Manager Home Panle Destroyed...");
    }

    public JPanel getManagerHomePanel(){
        return this.managerHomePanel;
    }
}
