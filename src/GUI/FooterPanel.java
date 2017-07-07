package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nirmit on 4/7/17.
 */
public class FooterPanel {

    private JPanel footerPanel;

    //component in the panel
    private JLabel bottomLabel;

    public FooterPanel(){

        footerPanel    =   new JPanel();
        bottomLabel    =   new JLabel();

        setProperty();

        setBounds();

        addComponentToPanel();
    }

    private void setProperty(){

        //setting panel property
        footerPanel.setLayout(null);
        footerPanel.setOpaque(false);

        //setting text to the components added
        bottomLabel.setText("Copyright \u00a9 2017 Hotel Holla,Inc.  All rights reserved.");

        //applying properties to the label

        bottomLabel.setFont(new Font("Calisto MT", Font.ITALIC, 20));
        bottomLabel.setForeground(Color.WHITE);

    }

    private void setBounds(){
        //setting panel bounds
        footerPanel.setBounds(0,640,1400,100);

        //adding bounds to other components;
        bottomLabel.setBounds(500,45,450,40);

    }

    private void addComponentToPanel(){
        // adding Component to panel
        footerPanel.add(bottomLabel);
    }

    public JPanel getFooterPanel(){
        return this.footerPanel;
    }

}
