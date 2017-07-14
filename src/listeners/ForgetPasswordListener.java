package listeners;

import controller.ForgotPasswordController;
import controller.LoginController;

import javax.swing.*;

/**
 * Created by Dell on 7/14/2017.
 */

public class ForgetPasswordListener {


    private JButton button;
    public void changePasswordButtonListener(JButton button){
        this.button = button;
        this.button.addActionListener(e -> {
            ForgotPasswordController.validate();
        });
    }
}
