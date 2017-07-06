package singleton;

import GUI.HeaderPanel;

/**
 * Created by nirmit on 6/7/17.
 */
public class HeaderSingleTon {

    //creating singleton object
    private static HeaderSingleTon headerSingleTon;

    private static HeaderPanel headerPanel;

    //singleton constructor
    private HeaderSingleTon(){
        headerPanel = new HeaderPanel();
        System.out.println("Header Panel Created...");
    }

    public static HeaderPanel getHeaderPanel() {
        return  headerPanel;
    }

    public static void setHeaderPanel() {

        //if singleton object is not created
        if(headerSingleTon == null){
            headerSingleTon = new HeaderSingleTon();
        }

    }
}
