import GUI.ContactsPanel;
import GUI.FooterPanel;
import GUI.HeaderPanel;
import controller.LaunchController;
import singleton.FooterSingleTon;
import singleton.HeaderSingleTon;
import singleton.JframeSingleTon;

import javax.swing.*;

/**
 * Created by nirmit on 6/7/17.
 */

public class Main {

    public static void main(String args[]){

        System.out.println("Main Class...");

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
