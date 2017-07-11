package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class IssueBillPanel {

    private JPanel issueBillPanel;

    private JLabel issueBillLabel;

    private JLabel customerIdLabel;
    private JTextField editCustomerId;

    private JButton generateBill;

    public IssueBillPanel() {

        System.out.println("Creating Issue Bill Panel...");

        issueBillPanel = new JPanel();

        issueBillLabel = new JLabel();

        customerIdLabel = new JLabel();
        editCustomerId = new JTextField();

        generateBill = new JButton();

        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Issue Bill Panel Created...");

    }

    private void setProperty() {

        issueBillPanel.setOpaque(false);
        issueBillPanel.setLayout(null);

        issueBillLabel.setText("Issue Bill");
        issueBillLabel.setForeground(Color.white);

        customerIdLabel.setText("Customer ID");
        customerIdLabel.setForeground(Color.white);


    }

    private void setBounds() {

        issueBillPanel.setBounds(0,140,1000,550);

        issueBillLabel.setBounds(100,100,100,25);

    }

    private void addComponentToPanel() {

        issueBillPanel.add(issueBillLabel);

    }

    public JPanel getIssueBillPanel() {
        return this.issueBillPanel;
    }

    public void destroy() {
        issueBillPanel.setVisible(false);
    }

}
