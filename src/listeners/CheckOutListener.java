package listeners;

import GUI.BillPrint.PrintExample;
import GUI.CheckOutPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dell on 7/14/2017.
 */
public class CheckOutListener {

    private JButton issueBill;

    public void issueBilllistener(JButton issueBill) {
        this.issueBill = issueBill;
        this.issueBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("listener on issue bill button");
                new PrintExample(CheckOutPanel.editroomNumber.getText());
            }
        });
    }
}
