package GUI;

import listeners.IssueBillListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class IssueBillPanel {

    private JPanel issueBillPanel;

    private JLabel roomNoLabel;
    public JTextField roomNoText;
 private IssueBillListener issueBillListener;

    private JButton generateBillButton;

    public IssueBillPanel() {

        System.out.println("Creating Issue Bill Panel...");

        issueBillPanel = new JPanel();


        roomNoLabel = new JLabel();
        roomNoText = new JTextField();


        generateBillButton = new JButton();

        issueBillListener=new IssueBillListener();

        setProperty();

        setBounds();

        addComponentToPanel();

        listeners();

        System.out.println("Issue Bill Panel Created...");

    }

    private void listeners() {
        issueBillListener.issueBilllistener(generateBillButton);
    }

    private void setProperty() {

        issueBillPanel.setOpaque(false);
        issueBillPanel.setLayout(null);


        roomNoLabel.setText("Room Number");
        roomNoLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        roomNoLabel.setForeground(Color.white);


        roomNoText.setFont(new Font("Century Gothic", Font.BOLD,15));

        generateBillButton.setText("Generate Bill");
        generateBillButton.setFont(new Font("Lithos Pro Regular",Font.PLAIN,17));
        generateBillButton.setBackground(Color.red);
        generateBillButton.setForeground(Color.WHITE);

    }

    private void setBounds() {

        issueBillPanel.setBounds(0,140,1000,550);

        roomNoLabel.setBounds(400,200,250,25);
        roomNoText.setBounds(600,200,150,25);

        generateBillButton.setBounds(450,280,200,30);

    }

    private void addComponentToPanel() {



        issueBillPanel.add(roomNoLabel);
        issueBillPanel.add(roomNoText);

        issueBillPanel.add(generateBillButton);

    }

    public JPanel getIssueBillPanel() {
        return this.issueBillPanel;
    }

    public void destroy() {
        issueBillPanel.setVisible(false);
    }


}
