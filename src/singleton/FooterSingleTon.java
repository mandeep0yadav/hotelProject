package singleton;

import GUI.FooterPanel;

/**
 * Created by nirmit on 6/7/17.
 */
public class FooterSingleTon {

    //creating singleton object
    private static FooterSingleTon footerSingleTon;

    private static FooterPanel footerPanel;

    //singleton constructor
    private FooterSingleTon(){
        footerPanel = new FooterPanel();
        System.out.println("Footer Panel Created...");
    }

    public static FooterPanel getFooterSingleTon() {
        return  footerPanel;
    }

    public static void setFooterPanel() {

        //if singleton object is not created
        if(footerSingleTon == null){
            footerSingleTon = new FooterSingleTon();
        }

    }
}
