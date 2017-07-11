import controller.LaunchController;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;
import sqlTable.MysqlTables.*;

import javax.swing.*;
import java.util.Scanner;

/**
 * Created by nirmit on 6/7/17.
 */

public class Main {

    public static void main(String args[]) {

        int choice;
        System.out.println("Main Class...");
        System.out.println("1.Create Table\n2.StartApplication");

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                createTable();
                break;
            case 2:
                startApplication();
                break;
            default:
                System.out.println("Enter correct choice");
                break;
        }

    }

    private static void createTable() {

        new CreateEmployeeLogInTable();
        new CreateEmployeeDetailTable();

        new CreateRoomDetailsTable();

        new CreateCustomerLoginTable();
        new CreateCustomerAddProofTable();
        new CreateCustomerDetailsTable();
        new CreateCustomerStayInformationTable();


        new CreateAllottedRoomTable();
        new CreateEmployeeLevelTaskTable();
        new CreateEmployeeLevelTable();



    }

    private static void startApplication() {

        JframeSingleTon.setjFrame();
        JFrame initialFrame = JframeSingleTon.getjFrame();

        //header panel
        HeaderSingleTon.setHeaderPanel();

        //footer panel
        FooterSingleTon.setFooterPanel();

        //Launching launch controller
        LaunchController launchController = new LaunchController();

    }
}
