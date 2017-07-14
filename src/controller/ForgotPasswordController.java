package controller;

import GUI.AboutUsPanel;
import GUI.ForgotPasswordPanel;
import ValueObjects.CustomerDetails;
import ValueObjects.CustomerLogin;
import ValueObjects.EmployeeDetails;
import ValueObjects.EmployeeLogin;
import dao.MysqlDAO.MysqlCustomerDetailsDAO;
import dao.MysqlDAO.MysqlCustomerLoginDAO;
import dao.MysqlDAO.MysqlEmployeeDetailsDAO;
import dao.MysqlDAO.MysqlEmployeeLoginDAO;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by Himanshu on 12-07-2017.
 */
public class ForgotPasswordController {

    private JFrame initialFrame ;
    private static ForgotPasswordPanel forgotPasswordPanel ;

    public ForgotPasswordController(){

        System.out.println("Controls in Forgot Password Controller...");

        forgotPasswordPanel = new ForgotPasswordPanel();
        initialFrame = JframeSingleTon.getjFrame();

        setproperty();

        addComponent();
    }

    private void setproperty(){

        //adding frame properties
        initialFrame.setContentPane(new JLabel(new ImageIcon("src/Images/guestRoomSofa.jpg")));
        initialFrame.setTitle("Holla Hotel");
        initialFrame.setVisible(true);
        initialFrame.setResizable(false);

    }

    private void addComponent(){

        //adding panel to frame
        initialFrame.add(HeaderSingleTon.getHeaderSingleTon().getHeaderPanel());
        initialFrame.add(forgotPasswordPanel.getForgotPasswordPanel());
        initialFrame.add(FooterSingleTon.getFooterSingleTon().getFooterPanel());

    }

    public static void validate(){
        EmployeeLogin employeeLogin = new MysqlEmployeeLoginDAO().findEmployeeLogin(forgotPasswordPanel.editUserId.getText());
        EmployeeDetails employeeDetails = new MysqlEmployeeDetailsDAO().findEmployeeDetails(employeeLogin.getEmpid());
        System.out.println("adasdas");
        if(employeeDetails.getMobile() == Integer.parseInt(forgotPasswordPanel.editPhoneNo.getText())){
            System.out.println("sdfsdf");
                System.out.println("corrected");
                employeeLogin.setPassword(String.valueOf(forgotPasswordPanel.editNewPassword.getPassword()));
                new MysqlEmployeeLoginDAO().updateEmployeeLogin(employeeLogin);
                new LoginController();

        }

    }
}
