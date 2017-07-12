package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/11/2017.
 */
public class RoomViewPanel {

    private JPanel roomViewPanel;

    private JLabel luxuryRoomLabel;
    private JLabel semiLuxuryRoomLabel;
    private JLabel normalRoomLabel;

    private JLabel totalNormalRoomLabel;
    private JLabel totalLuxuryRoomLabel;
    private JLabel totalSemiluxuryRoomLabel;

    private JLabel bookedLuxuryRooms;
    private JLabel bookedNormalRoomLabel;
    private JLabel bookedSemiLuxuryRoomLabel;

    private JLabel vacantLuxuryRoomLabel;
    private JLabel vacantNormalRoomLabel;
    private JLabel vacantSemiLuxuryRoomLabel;

    private JLabel totalRoomLabel;
    private JLabel vacantRoomLabel;
    private JLabel bookedRoomLabel;




    public RoomViewPanel() {

        System.out.println("Creating Room View Panel...");

        roomViewPanel=new JPanel();

        luxuryRoomLabel=new JLabel();
        semiLuxuryRoomLabel=new JLabel();
        normalRoomLabel=new JLabel();

        vacantLuxuryRoomLabel=new JLabel("", SwingConstants.CENTER);
        vacantNormalRoomLabel=new JLabel("", SwingConstants.CENTER);
        vacantSemiLuxuryRoomLabel=new JLabel("", SwingConstants.CENTER);


        totalLuxuryRoomLabel=new JLabel("", SwingConstants.CENTER);
        totalNormalRoomLabel=new JLabel("", SwingConstants.CENTER);
        totalSemiluxuryRoomLabel=new JLabel("", SwingConstants.CENTER);

        bookedSemiLuxuryRoomLabel=new JLabel("", SwingConstants.CENTER);
        bookedNormalRoomLabel=new JLabel("", SwingConstants.CENTER);
        bookedLuxuryRooms=new JLabel("", SwingConstants.CENTER);

        totalRoomLabel=new JLabel("", SwingConstants.CENTER);
        vacantRoomLabel=new JLabel("", SwingConstants.CENTER);
        bookedRoomLabel=new JLabel("", SwingConstants.CENTER);

        setProperty();

        setBounds();

        addComponentToPanel();


    }

    private void setProperty() {

        roomViewPanel.setOpaque(false);

        luxuryRoomLabel.setText("Luxury Rooms");
        semiLuxuryRoomLabel.setText("Semi-Luxury Roooms");
        normalRoomLabel.setText("Normal Rooms");

        totalRoomLabel.setText("Total Rooms");
        vacantRoomLabel.setText("VacantRooms");
        bookedRoomLabel.setText("Booked Rooms");

        totalSemiluxuryRoomLabel.setText("70");
        totalLuxuryRoomLabel.setText("50");
        totalNormalRoomLabel.setText("100");

        bookedLuxuryRooms.setText("25");
        bookedSemiLuxuryRoomLabel.setText("35");
        bookedNormalRoomLabel.setText("50");

        vacantLuxuryRoomLabel.setText("25");
        vacantSemiLuxuryRoomLabel.setText("35");
        vacantNormalRoomLabel.setText("50");

        luxuryRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        luxuryRoomLabel.setForeground(Color.white);


        semiLuxuryRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        semiLuxuryRoomLabel.setForeground(Color.white);

        normalRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        normalRoomLabel.setForeground(Color.white);

        totalNormalRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        totalNormalRoomLabel.setForeground(Color.white);


        totalLuxuryRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        totalLuxuryRoomLabel.setForeground(Color.white);

        totalSemiluxuryRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        totalSemiluxuryRoomLabel.setForeground(Color.white);

        totalRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        totalRoomLabel.setForeground(Color.white);

        bookedLuxuryRooms.setFont(new Font("Century Gothic", Font.BOLD,18));
        bookedLuxuryRooms.setForeground(Color.white);

        bookedSemiLuxuryRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        bookedSemiLuxuryRoomLabel.setForeground(Color.white);

        bookedNormalRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        bookedNormalRoomLabel.setForeground(Color.white);


        bookedRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        bookedRoomLabel.setForeground(Color.white);


        vacantNormalRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        vacantNormalRoomLabel.setForeground(Color.white);

        vacantSemiLuxuryRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        vacantSemiLuxuryRoomLabel.setForeground(Color.white);

        vacantLuxuryRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        vacantLuxuryRoomLabel.setForeground(Color.white);

        vacantRoomLabel.setFont(new Font("Century Gothic", Font.BOLD,18));
        vacantRoomLabel.setForeground(Color.white);


        roomViewPanel.setLayout(null);


    }

    private void setBounds() {

        roomViewPanel.setBounds(0,140,1000,550);

        luxuryRoomLabel.setBounds(180,200,200,30);
        semiLuxuryRoomLabel.setBounds(180,280,200,30);
        normalRoomLabel.setBounds(180,360,200,30);

        totalRoomLabel.setBounds(400,120,200,30);
        bookedRoomLabel.setBounds(600,120,200,30);
        vacantRoomLabel.setBounds(800,120,200,30);

        totalLuxuryRoomLabel.setBounds(400,200,200,30);
        totalSemiluxuryRoomLabel.setBounds(400,280,200,30);
        totalNormalRoomLabel.setBounds(400,360,200,30);

        bookedLuxuryRooms.setBounds(600,200,200,30);
        bookedSemiLuxuryRoomLabel.setBounds(600,280,200,30);
        bookedNormalRoomLabel.setBounds(600,360,200,30);

        vacantLuxuryRoomLabel.setBounds(800,200,200,30);
        vacantSemiLuxuryRoomLabel.setBounds(800,280,200,30);
        vacantNormalRoomLabel.setBounds(800,360,200,30);


    }

    private void addComponentToPanel() {
        roomViewPanel.add(totalLuxuryRoomLabel);
        roomViewPanel.add(totalNormalRoomLabel);
        roomViewPanel.add(totalRoomLabel);
        roomViewPanel.add(totalSemiluxuryRoomLabel);

        roomViewPanel.add(bookedLuxuryRooms);
        roomViewPanel.add(bookedNormalRoomLabel);
        roomViewPanel.add(bookedRoomLabel);
        roomViewPanel.add(bookedSemiLuxuryRoomLabel);

        roomViewPanel.add(vacantLuxuryRoomLabel);
        roomViewPanel.add(vacantNormalRoomLabel);
        roomViewPanel.add(vacantRoomLabel);
        roomViewPanel.add(vacantSemiLuxuryRoomLabel);

        roomViewPanel.add(luxuryRoomLabel);
        roomViewPanel.add(semiLuxuryRoomLabel);
        roomViewPanel.add(normalRoomLabel);


    }

    public JPanel getRoomViewPanel() {
        return this.roomViewPanel;
    }

    public void destroy() {
        roomViewPanel.setVisible(false);
    }

}
