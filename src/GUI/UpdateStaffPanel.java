package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class UpdateStaffPanel {


    private JPanel updateStaffPanel;

    private JLabel testLabel;

    public UpdateStaffPanel() {

        System.out.println("Creating UpdateStaff Panel...");

        updateStaffPanel = new JPanel();

        testLabel = new JLabel();

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

        testLabel.setBounds(100,100,100,25);

    }

    private void addComponentToPanel() {

        updateStaffPanel.add(testLabel);

    }

    public JPanel getUpdateStaffPanel() {
        return this.updateStaffPanel;
    }

    public void destroy() {
        updateStaffPanel.setVisible(false);
    }


}
