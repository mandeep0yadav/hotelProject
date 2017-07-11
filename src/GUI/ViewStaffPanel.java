package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 4/7/17.
 */
public class ViewStaffPanel {

    private JPanel viewStaffPanel;

    private JLabel testLabel;

    public ViewStaffPanel() {

        System.out.println("Creating employeeview Panel...");

        viewStaffPanel = new JPanel();

        testLabel = new JLabel();

        setProperty();

        setBounds();

        addComponentToPanel();



    }

    private void setProperty() {

        viewStaffPanel.setOpaque(false);
        viewStaffPanel.setLayout(null);

        testLabel.setText("Staff View");
        testLabel.setForeground(Color.white);



    }

    private void setBounds() {

        viewStaffPanel.setBounds(0,140,1000,550);

        testLabel.setBounds(100,100,100,25);

    }

    private void addComponentToPanel() {

        viewStaffPanel.add(testLabel);

    }

    public JPanel getViewStaffPanel() {
        return this.viewStaffPanel;
    }

    public void destroy() {
        viewStaffPanel.setVisible(false);
    }


}
