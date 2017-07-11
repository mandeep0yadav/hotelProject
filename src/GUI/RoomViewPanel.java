package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class RoomViewPanel {

    private JPanel roomViewPanel;

    private JLabel roomViewLabel;


    public RoomViewPanel() {

        System.out.println("Creating Room View Panel...");

        roomViewPanel = new JPanel();

        roomViewLabel = new JLabel();

        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("Issue Bill Panel Created...");

    }

    private void setProperty() {

        roomViewPanel.setOpaque(false);
        roomViewLabel.setLayout(null);

        roomViewLabel.setText("Room View");
        roomViewLabel.setForeground(Color.white);



    }

    private void setBounds() {

        roomViewPanel.setBounds(0,140,1000,550);

        roomViewLabel.setBounds(100,100,100,25);

    }

    private void addComponentToPanel() {

        roomViewPanel.add(roomViewLabel);

    }

    public JPanel getIssueBillPanel() {
        return this.roomViewPanel;
    }

    public void destroy() {
        roomViewPanel.setVisible(false);
    }

}
