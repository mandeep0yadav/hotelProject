package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dell on 7/5/2017.
 */
public class FAQSPanel {

    private JPanel faqsPanel;

    private JLabel faqsHeadingLabel;

    private JLabel question1Label , question2Label , question3Label;
    private JLabel answer1Label , answer2Label , answer3Label;

    public FAQSPanel() {

        System.out.println("Creating FAQs Panel...");

        faqsPanel = new JPanel();

        faqsHeadingLabel = new JLabel();

        question1Label = new JLabel();
        question2Label = new JLabel();
        question3Label = new JLabel();

        answer1Label = new JLabel();
        answer2Label = new JLabel();
        answer3Label = new JLabel();

        setProperty();

        setBounds();

        addComponentToPanel();

        System.out.println("FAQs Panel Created...");

    }

    private void setProperty() {

        faqsPanel.setLayout(null);
        faqsPanel.setOpaque(false);

        faqsHeadingLabel.setText("FAQs");
        faqsHeadingLabel.setFont(new Font("verdana",Font.BOLD,25));
        faqsHeadingLabel.setForeground(Color.white);
        faqsHeadingLabel.setHorizontalTextPosition(SwingConstants.CENTER);

        question1Label.setText("1. How do I cancel my hotel booking?");
        question1Label.setFont(new Font("verdana",Font.BOLD,15));
        question1Label.setForeground(Color.LIGHT_GRAY);

        answer1Label.setText("<html><b>Ans:</b> You may cancel your booking over the telephone with the help of our travel advisors." +
                "<br>" +
                "     Contact us all days of the week between 6 am to 12 am" +
                "<br>" +
                "<br>" +
                "</html>");
        answer1Label.setFont(new Font("verdana",Font.PLAIN,15));
        answer1Label.setForeground(Color.white);
        answer1Label.setVerticalTextPosition(SwingConstants.TOP);


        question2Label.setText("2. What are the extra services that Holla Hotels offer?");
        question2Label.setFont(new Font("verdana",Font.BOLD,15));
        question2Label.setForeground(Color.LIGHT_GRAY);

        answer2Label.setText("<html><b>Ans:</b> We offer upright services in terms of security, cleanliness, and hygiene." +
                "<br>" +
                "     We have smartly built spaces designed keeping in mind the needs of frequent travelers at Ginger Hotels." +
                "<br>" +
                "<br>" +
                "</html>");
        answer2Label.setFont(new Font("verdana",Font.PLAIN,15));
        answer2Label.setForeground(Color.white);
        answer2Label.setVerticalTextPosition(SwingConstants.TOP);


        question3Label.setText("3. What are the documents that are required during Check-in");
        question3Label.setFont(new Font("verdana",Font.BOLD,15));
        question3Label.setForeground(Color.LIGHT_GRAY);

        answer3Label.setText("<html><b>Ans:</b> Foreign nationals are required to present their Passport and valid Visa." +
                "<br>" +
                "     Indian nationals can present any one of these, which is mandatory: Passport, Driving License," +
                "<br>" +
                "     Voter ID card, Aadhar Card bearing the holder's photograph and address." +
                "<br>" +
                "<br>" +
                "</html>");
        answer3Label.setFont(new Font("verdana",Font.PLAIN,15));
        answer3Label.setForeground(Color.white);
        answer3Label.setVerticalTextPosition(SwingConstants.TOP);

    }

    private void setBounds() {

        faqsPanel.setBounds(0,140,1400,550);

        faqsHeadingLabel.setBounds(100,40,200,40);

        question1Label.setBounds(100,100,1000,20);
        answer1Label.setBounds(100,125,1000,60);

        question2Label.setBounds(100,185,1000,20);
        answer2Label.setBounds(100,210,1000,60);

        question3Label.setBounds(100,270,1000,20);
        answer3Label.setBounds(100,295,1000,80);


    }

    private void addComponentToPanel() {

        faqsPanel.add(faqsHeadingLabel);

        faqsPanel.add(question1Label);
        faqsPanel.add(answer1Label);

        faqsPanel.add(question2Label);
        faqsPanel.add(answer2Label);

        faqsPanel.add(question3Label);
        faqsPanel.add(answer3Label);

    }

    public JPanel getFaqsPanel() {
        return this.faqsPanel;
    }

    public void destroy() {
        faqsPanel.setVisible(false);
    }

}
