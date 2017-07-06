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

        JframeSingleTon.setjFrame();
        JFrame initialFrame = JframeSingleTon.getjFrame();

        //header panel
        HeaderSingleTon.setHeaderPanel();
        HeaderPanel headerPanel = HeaderSingleTon.getHeaderPanel();

        //footer panel
        FooterSingleTon.setFooterPanel();
        FooterPanel footerPanel = FooterSingleTon.getFooterPanel();

        //Launching launch controller
        LaunchController launchController = new LaunchController();

        //adding header and footer to main frame
        initialFrame.add(headerPanel.getHeaderPanel());
        initialFrame.add(footerPanel.getfooterPanel());


    }
}
