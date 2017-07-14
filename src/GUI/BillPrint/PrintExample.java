package GUI.BillPrint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintExample extends JFrame implements ActionListener {


    private JLabel contactNo1;
    private JLabel contactNo2;
    private JLabel contactNo3;

    private JLabel guestId;
    private JLabel billNo;
    private JLabel guestname;
    private JLabel roomNo;
    private JLabel dated;
    private JLabel guestFrom;
    private JLabel checkIndate;
    private JLabel checkOutDate;
    private JLabel totalDays;
    private JLabel mobNo;
    private JLabel roomType;
    private JLabel totalAmount;
    private JLabel paymentMode;

    private JLabel guestIdShow;
    private JLabel billNoShow;
    private JLabel guestnameShow;
    private JLabel roomNoShow;
    private JLabel datedShow;
    private JLabel guestFromShow;
    private JLabel checkIndateShow;
    private JLabel checkOutDateShow;
    private JLabel totalDaysShow;
    private JLabel mobNoShow;
    private JLabel roomTypeShow;
    private JLabel totalAmountShow;
    private JLabel paymentModeShow;
    private JSeparator separatorTotalAmount1;
    private JSeparator separatorTotalAmount2;
    private JSeparator separatorBillNo1;
    private JSeparator separatorBillNo2;


    private JLabel logoImageLabel;
    private ImageIcon hollaLogo;



    public PrintExample() {


        super("Printing Swing Components");
        //addWindowListener(new ExitListener());

        contactNo1 = new JLabel("Phone: +917042540979");
        contactNo2 = new JLabel("+919990188039");
        contactNo3 = new JLabel("+919990442959");
        billNo = new JLabel();
        roomNo = new JLabel();
        logoImageLabel = new JLabel();
        logoImageLabel = new JLabel();
        billNo=new JLabel();
        dated=new JLabel();
        guestId=new JLabel();
        guestname=new JLabel();
        roomNo=new JLabel();
        guestFrom=new JLabel();
        mobNo=new JLabel();
        checkIndate=new JLabel();
        checkOutDate=new JLabel();
        totalDays=new JLabel();
        roomType=new JLabel();
        totalAmount=new JLabel();
        paymentMode=new JLabel();

        billNoShow=new JLabel();
        datedShow=new JLabel();
        guestIdShow=new JLabel();
        guestnameShow=new JLabel();
        roomNoShow=new JLabel();
        guestFromShow=new JLabel();
        mobNoShow=new JLabel();
        checkIndateShow=new JLabel();
        checkOutDateShow=new JLabel();
        totalDaysShow=new JLabel();
        roomTypeShow=new JLabel();
        totalAmountShow=new JLabel();
        paymentModeShow=new JLabel();

        separatorBillNo1=new JSeparator();
        separatorBillNo2=new JSeparator();
        separatorTotalAmount1=new JSeparator();
        separatorTotalAmount2=new JSeparator();







        hollaLogo = new ImageIcon("src/images/hollalogo.png");


        Container content = getContentPane();
        JButton printButton = new JButton("Print");
        printButton.addActionListener(this);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.white);
        buttonPanel.add(printButton);
        content.add(buttonPanel, BorderLayout.SOUTH);
        JPanel jPanel = new JPanel();
        content.add(jPanel, BorderLayout.CENTER);
        setSize(700, 740);
        setVisible(true);
        jPanel.setBackground(Color.white);

        property(jPanel);
        setbounds(jPanel);
        addComponents(jPanel);
    }

    private void addComponents(JPanel jPanel) {

        jPanel.add(logoImageLabel);
        jPanel.add(contactNo1);

        jPanel.add(contactNo2);
        jPanel.add(contactNo3);
        jPanel.add(billNo);
        jPanel.add(dated);
        jPanel.add(guestId);
        jPanel.add(guestname);
        jPanel.add(guestFrom);
        jPanel.add(mobNo);
        jPanel.add(checkIndate);
        jPanel.add(checkOutDate);
        jPanel.add(totalDays);
        jPanel.add(roomType);
        jPanel.add(totalAmount);
        jPanel.add(paymentMode);
        jPanel.add(roomNo);

        jPanel.add(billNoShow);
        jPanel.add(datedShow);
        jPanel.add(guestIdShow);
        jPanel.add(guestnameShow);
        jPanel.add(guestFromShow);
        jPanel.add(mobNoShow);
        jPanel.add(checkIndateShow);
        jPanel.add(checkOutDateShow);
        jPanel.add(totalDaysShow);
        jPanel.add(roomTypeShow);
        jPanel.add(totalAmountShow);
        jPanel.add(paymentModeShow);
        jPanel.add(roomNoShow);


        jPanel.add(separatorBillNo1);
        jPanel.add(separatorBillNo2);
        jPanel.add(separatorTotalAmount1);
        jPanel.add(separatorTotalAmount2);

    }

    private void setbounds(JPanel jPanel) {
        contactNo1.setBounds(550, 10, 200, 10);
        contactNo2.setBounds(590, 25, 200, 10);
        contactNo3.setBounds(590, 40, 200, 10);
        logoImageLabel.setBounds(270, 10, 150, 100);
        billNo.setBounds(30,200,150,20);
        guestId.setBounds(30,240,150,20);
        guestname.setBounds(30,280,150,20);
        guestFrom.setBounds(30,320,150,20);
        checkIndate.setBounds(30,360,150,20);
        checkOutDate.setBounds(30,400,150,20);
        totalDays.setBounds(30,440,150,20);
        roomType.setBounds(30,480,150,20);

        totalAmount.setBounds(30,540,150,20);



        roomNo.setBounds(400,240,150,20);
        mobNo.setBounds(400,320,150,20);

        billNoShow.setBounds(200,200,150,20);
        guestIdShow.setBounds(200,240,150,20);
        guestnameShow.setBounds(200,280,150,20);
        guestFromShow.setBounds(200,320,150,20);
        checkIndateShow.setBounds(200,360,150,20);
        checkOutDateShow.setBounds(200,400,150,20);
        totalDaysShow.setBounds(200,440,150,20);
        roomTypeShow.setBounds(200,480,150,20);

        totalAmountShow.setBounds(430,540,150,20);
        paymentMode.setBounds(430,580,150,20);

        paymentModeShow.setBounds(540,580,150,20);



        roomNoShow.setBounds(500,240,150,20);
        mobNoShow.setBounds(500,320,150,20);

        separatorBillNo1.setBounds(20,190,630,2);
        separatorBillNo2.setBounds(20,225,630,3);


        separatorTotalAmount1.setBounds(20,530,630,3);
        separatorTotalAmount2.setBounds(20,568,630,3);
    }

    private void property(JPanel jPanel) {

        jPanel.setLayout(null);
        logoImageLabel.setIcon(hollaLogo);
        contactNo1.setHorizontalTextPosition(SwingConstants.NORTH_EAST);

              billNo.setText("Bill No.       ");
              roomNo.setText("Room No.       ");
              guestId.setText("Guest Id");
           guestname.setText("Guest Name      ");
           guestFrom.setText("Guest From     ");
               mobNo.setText("Contact No.    ");
         checkIndate.setText("Check-In Date  ");
        checkOutDate.setText("Check-Out Date ");
           totalDays.setText("Total Days     ");
            roomType.setText("Room Type         ");

        totalAmount.setText("Total Amount");
        paymentMode.setText("Payment Mode");

        billNoShow.setText("12");
        roomNoShow.setText("007");
        guestIdShow.setText("A31");
        guestnameShow.setText("Naveen Kumar");
        guestFromShow.setText("Dehradun");
        mobNoShow.setText("+919736447834");
        checkIndateShow.setText("27-jun-2017");
        checkOutDateShow.setText("4-july-2017");
        totalDaysShow.setText("8");
        roomTypeShow.setText("Luxury");

        totalAmountShow.setText("24000.00");
        paymentModeShow.setText("Cash");

        separatorTotalAmount1.setForeground(Color.black);
        separatorTotalAmount2.setForeground(Color.black);
        separatorBillNo1.setForeground(Color.black);
        separatorBillNo2.setForeground(Color.black);


    }

    public void actionPerformed(ActionEvent event) {
        PrintableDocument.printComponent(this);

    }
}

    
