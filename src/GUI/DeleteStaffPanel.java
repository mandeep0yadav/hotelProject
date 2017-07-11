package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class DeleteStaffPanel {

    private JPanel deleteStaffPanel;

    private JLabel testLabel;

    public DeleteStaffPanel() {

        System.out.println("Creating deleteStaff Panel...");

        deleteStaffPanel = new JPanel();

        testLabel = new JLabel();

        setProperty();

        setBounds();

        addComponentToPanel();


    }

    private void setProperty() {

        deleteStaffPanel.setOpaque(false);
        deleteStaffPanel.setLayout(null);

        testLabel.setText("Delete Staff");
        testLabel.setForeground(Color.white);



    }

    private void setBounds() {

        deleteStaffPanel.setBounds(0,140,1000,550);

        testLabel.setBounds(100,100,100,25);

    }

    private void addComponentToPanel() {

        deleteStaffPanel.add(testLabel);

    }

    public JPanel getDeleteStaffPanel() {
        return this.deleteStaffPanel;
    }

    public void destroy() {
        deleteStaffPanel.setVisible(false);
    }


}
