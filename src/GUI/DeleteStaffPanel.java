package GUI;

import listeners.DeleteStaffPanelListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class DeleteStaffPanel {

    private JPanel deleteStaffPanel;

    private JLabel staffIDLabel;
    public JTextField staffIdTextField;


    private JButton deleteStaffButton;

    private DeleteStaffPanelListener deleteStaffPanelListener;

    public DeleteStaffPanel() {

        System.out.println("Creating Delete Staff Panel...");

        deleteStaffPanel = new JPanel();


        staffIDLabel = new JLabel();
        staffIdTextField = new JTextField();


        deleteStaffButton = new JButton();

        deleteStaffPanelListener=new DeleteStaffPanelListener();

        setProperty();

        setBounds();

        addComponentToPanel();

        addListeners();

        System.out.println("Delete Staff Panel Created...");

    }

    private void addListeners() {
        deleteStaffPanelListener.deleteButtonListener(deleteStaffButton);
    }

    private void setProperty() {

        deleteStaffPanel.setOpaque(false);
        deleteStaffPanel.setLayout(null);


        staffIDLabel.setText("Enter Staff Id");
        staffIDLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        staffIDLabel.setForeground(Color.white);


        staffIdTextField.setFont(new Font("Century Gothic", Font.BOLD,15));

        deleteStaffButton.setText("Delete");

        deleteStaffButton.setFont(new Font("Lithos Pro Regular",Font.PLAIN,17));
        deleteStaffButton.setBackground(Color.red);
        deleteStaffButton.setForeground(Color.WHITE);

    }

    private void setBounds() {

        deleteStaffPanel.setBounds(0,140,1000,550);

        staffIDLabel.setBounds(400,200,250,25);
        staffIdTextField.setBounds(600,200,150,25);

        deleteStaffButton.setBounds(450,280,200,30);

    }

    private void addComponentToPanel() {



        deleteStaffPanel.add(staffIDLabel);
        deleteStaffPanel.add(staffIdTextField);

        deleteStaffPanel.add(deleteStaffButton);

    }

    public JPanel getDeleteStaffPanel() {
        return this.deleteStaffPanel;
    }

    public void destroy() {
        deleteStaffPanel.setVisible(false);
    }




}
