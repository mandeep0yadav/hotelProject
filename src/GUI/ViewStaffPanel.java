package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Date;


public class ViewStaffPanel {

    private JPanel viewStaffPanel;

    private JTable staffTable;
    private JScrollPane scrollPane;

    private String[] coloumnTitles;

    private Object[][] sampledata;

    public ViewStaffPanel() {

        System.out.println("Creating employeeview Panel...");

        viewStaffPanel = new JPanel();


        coloumnTitles= new String[]{"Emplyee ID","Name","House No.","Street","City","Postalcode","country","Salary","dob","Email","Mob No."};
        sampledata=new Object[][]{
                {"101A","Smith first",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmafergegegwwrewegerwgwresgevdvdfil.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith Thomason",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},
                {"101A","Smith last",new Integer(120),"new colony","Sydney",new Integer(2503),"Australia",new Integer(200), "23jul2015","xyz@gmail.com",new Integer(999028233)},

                };

        staffTable=new JTable(sampledata, coloumnTitles);
        scrollPane=new JScrollPane(staffTable);


        setProperty();

        setBounds();

        addComponentToPanel();



    }

    private void setProperty() {

        viewStaffPanel.setOpaque(false);
        viewStaffPanel.setLayout(null);


        staffTable.setFillsViewportHeight(true);

        viewStaffPanel.setLayout(new BorderLayout());
        viewStaffPanel.add(staffTable.getTableHeader(), BorderLayout.PAGE_START);

        staffTable.setOpaque(false);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setBorder(null);



    }

    private void setBounds() {

        viewStaffPanel.setBounds(0,140,1100,550);
        scrollPane.setBounds(60,30,990,500);

    }

    private void addComponentToPanel() {

        viewStaffPanel.add(scrollPane);


    }

    public JPanel getViewStaffPanel() {
        return this.viewStaffPanel;
    }

    public void destroy() {
        viewStaffPanel.setVisible(false);
    }


}
