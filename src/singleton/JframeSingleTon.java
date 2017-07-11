package singleton;

import javax.swing.*;

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
        jFrame.setSize(1366,768);
        System.out.println("JFrame Created...");
    }

    public static JFrame getjFrame() {
        return jFrame;
    }

    public static void setjFrame() {

        //if singleton object is not created
        if(jframeSingleTon == null){
            jframeSingleTon = new JframeSingleTon();
            jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }

    }
}
