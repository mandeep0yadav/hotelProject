package singleton;

import javax.swing.JFrame;

/**
 * Created by nirmit on 6/7/17.
 */
public class JframeSingleTon {

    //creating singleton object
    private static JframeSingleTon jframeSingleTon;

    private static JFrame jFrame;


    //singleton constructor
    private JframeSingleTon(){
        jFrame = new JFrame();
        System.out.println("JFrame Created...");
    }

    public static JFrame getjFrame() {
        return jFrame;
    }

    public static void setjFrame() {

        //if singleton object is not created
        if(jframeSingleTon == null){
            jframeSingleTon = new JframeSingleTon();
        }

    }
}
