package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 4/7/17.
 */
public class EmployeeViewPanel {

    private JPanel employeeViewPanel;

    private JLabel employeeLabel;

    private JLabel customerIdLabel;

    private JTextField editCustomerId;

    private JButton generateBill;

    public EmployeeViewPanel() {

        System.out.println("Creating employeeview Panel...");

        employeeViewPanel = new JPanel();

        employeeLabel = new JLabel();

        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Issue Bill Panel Created...");

    }

    private void setProperty() {

        employeeViewPanel.setOpaque(false);
        employeeViewPanel.setLayout(null);

        employeeLabel.setText("Issue Bill");
        employeeLabel.setForeground(Color.white);



    }

    private void setBounds() {

        employeeViewPanel.setBounds(0,140,1000,550);

        employeeLabel.setBounds(100,100,100,25);

    }

    private void addComponentToPanel() {

        employeeViewPanel.add(employeeLabel);

    }

    public JPanel getEmployeeViewPanel() {
        return this.employeeViewPanel;
    }

    public void destroy() {
        employeeViewPanel.setVisible(false);
    }


}
