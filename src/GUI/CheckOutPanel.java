package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class CheckOutPanel {



    private JPanel checkOutPanel;

    private JLabel checkOutLabel;

    public CheckOutPanel() {

        System.out.println("Creating  checkout Panel...");

        checkOutPanel = new JPanel();

        checkOutLabel = new JLabel();


        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("checkout Panel Created...");

    }

    private void setProperty() {

        checkOutPanel.setOpaque(false);
        checkOutPanel.setLayout(null);

        checkOutLabel.setText("Check-Out");
        checkOutLabel.setFont(new Font("Century Gothic", Font.BOLD,22));
        checkOutLabel.setForeground(Color.white);
        checkOutLabel.setHorizontalTextPosition(SwingConstants.CENTER);

    }

    private void setBounds() {

        checkOutPanel.setBounds(0,140,1000,550);

        checkOutLabel.setBounds(450,0,200,39);


    }

    private void addComponentToPanel() {

        checkOutPanel.add(checkOutLabel);


    }

    public JPanel getCheckOutPanel() {
        return this.checkOutPanel;
    }

    public void destroy() {
        checkOutPanel.setVisible(false);
    }
}
