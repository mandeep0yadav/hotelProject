package GUI;

import listeners.UpdateStaffPanelListeners;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jatin kumar vimal on 12/07/2017.
 */
public class UpdateStaffPanel {


    private JPanel updateStaffPanel;

    private JLabel staffIdLabel;
    public JTextField staffIdTexField;


    private JButton updateButton;

    private UpdateStaffPanelListeners updateStaffPanelListeners;

    public UpdateStaffPanel() {

        System.out.println("Creating update Staff Panel...");

        updateStaffPanel = new JPanel();


        staffIdLabel = new JLabel();
        staffIdTexField = new JTextField();


        updateButton = new JButton();

        updateStaffPanelListeners=new UpdateStaffPanelListeners();

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
        updateButton.setFont(new Font("Lithos Pro Regular",Font.PLAIN,17));
        updateButton.setBackground(Color.red);


        updateButton.setForeground(Color.WHITE);

    }

    private void setBounds() {

        updateStaffPanel.setBounds(0,140,1000,550);

        staffIdLabel.setBounds(400,200,250,25);
        staffIdTexField.setBounds(600,200,150,25);

        updateButton.setBounds(450,280,200,30);

    }

    private void addComponentToPanel() {



        updateStaffPanel.add(staffIdLabel);
        updateStaffPanel.add(staffIdTexField);

        updateStaffPanel.add(updateButton);

    }

    private void addListeners() {
        updateStaffPanelListeners.updateButtonListener(updateButton);
    }

    public JPanel getUpdateStaffPanel() {
        return this.updateStaffPanel;
    }

    public void destroy() {
        updateStaffPanel.setVisible(false);
    }



}







/*public class UpdateStaffPanel {


    private JPanel updateStaffPanel;

    private JLabel testLabel;
    private JLabel EMPID;
    private JTextField EMPIDTEXT;
    private JButton SUBMIT;

    public UpdateStaffPanel() {

        System.out.println("Creating UpdateStaff Panel...");

        updateStaffPanel = new JPanel();

        testLabel = new JLabel();

        EMPID = new JLabel("empid");
        EMPIDTEXT = new JTextField();
        SUBMIT = new JButton("Submit");

        setProperty();

        setBounds();

        addComponentToPanel();

    }

    private void setProperty() {

        updateStaffPanel.setOpaque(false);
        updateStaffPanel.setLayout(null);

        testLabel.setText("Update Staff");
        testLabel.setForeground(Color.white);



    }

    private void setBounds() {

        updateStaffPanel.setBounds(0,140,1000,550);

        EMPID.setBounds(500,200,100,25);
        EMPIDTEXT.setBounds(600,200,200,25);
        SUBMIT.setBounds(600,300,100,25);

        testLabel.setBounds(100,100,100,25);

    }

    private void addComponentToPanel() {

        updateStaffPanel.add(testLabel);
        updateStaffPanel.add(EMPID);
        updateStaffPanel.add(EMPIDTEXT);
        updateStaffPanel.add(SUBMIT);

    }

    public JPanel getUpdateStaffPanel() {
        return this.updateStaffPanel;
    }

    public void destroy() {
        updateStaffPanel.setVisible(false);
    }


}*/


































