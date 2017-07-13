package GUI;

import listeners.UpdateStaffManagerPanelListeners;
import listeners.UpdateStaffPanelListeners;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/14/2017.
 */
public class UpdateStaffManagerPanel {




    private JPanel updateStaffPanel;

    private JLabel staffIdLabel;
    public JTextField staffIdTexField;


    private JButton updateButton;

    private UpdateStaffManagerPanelListeners updateStaffManagerPanelListeners;

    public UpdateStaffManagerPanel() {

        System.out.println("Creating update Staff manager Panel...");

        updateStaffPanel = new JPanel();


        staffIdLabel = new JLabel();
        staffIdTexField = new JTextField();


        updateButton = new JButton();

        updateStaffManagerPanelListeners=new UpdateStaffManagerPanelListeners();

        setProperty();

        setBounds();

        addComponentToPanel();

        addListeners();

        System.out.println("update staff panel Created...");

    }


    private void setProperty() {

        updateStaffPanel.setOpaque(false);
        updateStaffPanel.setLayout(null);


        staffIdLabel.setText("Enter Staff Id");
        staffIdLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        staffIdLabel.setForeground(Color.white);


        staffIdTexField.setFont(new Font("Century Gothic", Font.BOLD,15));

        updateButton.setText("Update");
        updateButton.setFont(new Font("Lithos Pro Regular",Font.BOLD,17));
        updateButton.setBackground(Color.red);


        updateButton.setForeground(Color.WHITE);

    }

    private void setBounds() {

        updateStaffPanel.setBounds(0,140,1000,550);

        staffIdLabel.setBounds(400,200,250,25);
        staffIdTexField.setBounds(600,200,150,25);

        updateButton.setBounds(450,280,200,25);

    }

    private void addComponentToPanel() {



        updateStaffPanel.add(staffIdLabel);
        updateStaffPanel.add(staffIdTexField);

        updateStaffPanel.add(updateButton);

    }

    private void addListeners() {
        updateStaffManagerPanelListeners.updateButtonListener(updateButton);
    }

    public JPanel getUpdateStaffPanel() {
        return this.updateStaffPanel;
    }

    public void destroy() {
        updateStaffPanel.setVisible(false);
    }



}
