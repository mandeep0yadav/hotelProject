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

    private JSeparator issueBillLabelSeparator;

    private JButton generateBill;

    public IssueBillPanel() {

        System.out.println("Creating Issue Bill Panel...");

        issueBillPanel = new JPanel();

        issueBillLabel = new JLabel();

        customerIdLabel = new JLabel();
        editCustomerId = new JTextField();

        issueBillLabelSeparator = new JSeparator();

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
        issueBillLabel.setFont(new Font("Century Gothic", Font.BOLD,22));
        issueBillLabel.setForeground(Color.white);
        issueBillLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        customerIdLabel.setText("Customer ID");
        customerIdLabel.setFont(new Font("Century Gothic", Font.BOLD,12));
        customerIdLabel.setForeground(Color.white);

        generateBill.setText("Generate Bill");
        generateBill.setFont(new Font("Century Gothic", Font.BOLD,12));

    }

    private void setBounds() {

        issueBillPanel.setBounds(0,140,1000,550);

        issueBillLabel.setBounds(450,0,200,39);

        issueBillLabelSeparator.setBounds(50,39,900,1);

        customerIdLabel.setBounds(400,100,100,25);
        editCustomerId.setBounds(500,100,120,25);

        generateBill.setBounds(440,140,125,25);

    }

    private void addComponentToPanel() {

        issueBillPanel.add(issueBillLabel);

        issueBillPanel.add(issueBillLabelSeparator);

        issueBillPanel.add(customerIdLabel);
        issueBillPanel.add(editCustomerId);

        issueBillPanel.add(generateBill);

    }

    public JPanel getIssueBillPanel() {
        return this.issueBillPanel;
    }

    public void destroy() {
        issueBillPanel.setVisible(false);
    }

}
