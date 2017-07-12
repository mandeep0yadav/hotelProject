package listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dell on 7/13/2017.
 */
public class DeleteStaffPanelListener {

    private JButton deleteButton;
    final JOptionPane optionPane = new JOptionPane(
            "The only way to close this dialog is by\n"
                    + "pressing one of the following buttons.\n"
                    + "Do you understand?",
            JOptionPane.QUESTION_MESSAGE,
            JOptionPane.YES_NO_OPTION);

    public void deleteButtonListener(JButton deleteButton){
        this.deleteButton=deleteButton;
        this.deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int dialogButton = JOptionPane.YES_NO_OPTION;
                JOptionPane.showConfirmDialog (null, "Staff member will be delete permanently.\n" +
                        "Do you want to contine ?","WARNING", dialogButton);
                if(dialogButton == JOptionPane.YES_OPTION) {
                    deleteStaff();

                }
                if(dialogButton == JOptionPane.NO_OPTION) {
                    //do nothing
                    }

            }

            private void deleteStaff() {

                //perform delete staff query and oll
            }
        });
    }
}
