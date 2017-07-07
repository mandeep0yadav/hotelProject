package GUI;

import javax.swing.*;
import java.awt.*;

import static javax.print.attribute.standard.MediaSizeName.B;

/**
 * Created by Dell on 7/5/2017.
 */
public class PolicyPanel {
    private JPanel policyPanel;


    private JTextArea policyTextArea;
    private JScrollPane jScrollPane;
    private Color colorForPanelText;



    public PolicyPanel() {
        policyPanel=new JPanel();
        policyTextArea = new JTextArea();
        jScrollPane=new JScrollPane(policyTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        colorForPanelText=Color.decode("#B8CDFF");




        setProperty();

        setBounds();

        addComponentToPanel();

    }

    private void setProperty() {
        policyTextArea.setText("1. INRODUCTION\n" +
                "     We use your personal information in order to fulfil our commitment to providing an unparalleled guest service experience in connection with all of your interactions with            Holla (the “Purpose”). As part of that undertaking, we are committed to safeguarding the privacy of the personal information that we gather.\n" +
                "     As one of our guests or someone else with whom we do business, you understand and agree that we collect, use and disclose your personal information in accordance              with this Global Privacy Policy (this “Policy”).\n" +
                "\n" +
                "2.  The Application of this Policy\n" +
                "    This Policy applies to personal information regarding guests and the other individuals with whom we do business or who visit us and to the use of that personal information in      any form – whether oral, electronic or written.\n" +
                "    This Policy gives effect to our commitment to protect your personal information and has been adopted by all of the separate and distinct legal entities that manage,                  operate, franchise, license, own and/or provide services to the various Holla hotels and resorts (including those branded “Holla®”, “Holla Regency®”, “Park Holla®”,                   “Grand Holla®”, “Andaz®”, “Holla Centric®”, “Holla Place®”, “Holla House\uF8EA”, “Holla Ziva\uF8EA” or “Holla Zilara\uF8EA”) or “Holla Residence Club®” properties around the world               (“Holla Hotels & Resorts®”). Those entities include Holla Hotels Corporation and its direct and indirect subsidiaries, and all of the separate and distinct legal entities that own      the individual Holla hotels and resorts and Holla Residence Club properties worldwide or provide services to you under a Holla brand. References to “Holla”, “we” and                “our” throughout this Policy, depending upon the context, collectively refer to those separate and distinct legal entities.\n" +
                "      While this Policy is intended to describe the broadest range of our personal information processing activities globally, those processing activities may be more limited in           some jurisdictions based on the restrictions of their laws. For example, the laws of a particular country may limit the types of personal information we can collect or the              manner in which we process that personal information. In those instances, we adjust our internal policies and/or practices to reflect the requirements of local law.\n" +
                "      If  you are a Holla associate, please see the Global Privacy Policy for Employees or your applicable employer’s privacy policy, as this Policy does not apply to your                      personal information, unless collected in your capacity as a guest.\n" +
                "\n" +
                "3.  Types of Personal Information We Collect\n" +
                "     The term “personal information” in this Policy refers to information that does or is capable of identifying you as an individual. The types of personal information that we                process (which may vary by jurisdiction based on applicable law) include:\n" +
                "      your name, gender, personal and work contact details, business title, date and place of birth, image, nationality, and passport and visa information;\n" +
                "      guest stay information, including the hotels where you have stayed, dates of arrival and departure, goods and services utilised, special requests made, observations about         your service preferences (including room and vacation preferences), telephone numbers dialed and faxes, texts and telephone messages received;\n" +
                "      your credit card details, and your account details and credentials for the Holla frequent guest program and any frequent flyer or travel partner program;\n" +
                "      any information necessary to fulfil special requests (e.g. health conditions that require specific accommodation or services);\n" +
                "      information, feedback or content you provide regarding your marketing preferences, in surveys, sweepstakes, contests, or promotional offers, or to our websites or apps           and those of third parties;\n" +
                "      information collected whilst at a Holla hotel or resort through the use of closed circuit television systems, internet systems (including wireless networks that collect data               about your computer, smart or mobile device, or your location), card key and other security and technology systems;\n" +
                "      information collected whilst you access a Holla app or Holla website (we describe this in more detail in Sections 7 and 8 below);\n" +
                "      contact and other relevant details concerning the employees of corporate accounts and vendors and other individuals with whom we do business (e.g. travel agents or            meeting and event planners); and\n" +
                "      in limited cases, information relating to the credit of customers.\n" +
                "      Much of the personal information we process is information that you or someone acting on your behalf knowingly provides to us. However, in other instances, we process          personal information that we are able to infer about you based on other information you provide to us or during our interactions with you, or personal information about              you that we receive from a third party. This Policy also applies to the personal information about you that we receive from a third party, unless specifically covered by such        third party’s privacy policy.\n" +
                "      There may be instances in which the personal information that you provide to us or that we collect is considered Sensitive Personal Information under the privacy laws of           some countries. Those laws define “Sensitive Personal Information” to mean personal information from which we can determine or infer an individual’s racial or ethnic                origin, political opinions, religious beliefs or other beliefs of a similar nature, membership in a trade union or professional association, physical or mental health or                        condition, medical treatment, genetic data, sexual life or judicial data (including information concerning the commission or alleged commission of a criminal offence).          In some very rare instances, financial records may form part of Sensitive Personal Information where you are located. We only process Sensitive Personal Information in              your jurisdiction if and to the extent permitted or required by applicable law.\n" +
                "      When you agree to this Policy you are, to the extent required under your local law, granting your express and written consent to the processing of any personal information        that you provide to Holla that is considered to be Sensitive Personal Information or financial information. Save to the extent required by law, you are not obliged to                      provide Holla with any of your Sensitive Personal Information, and should you chose not to, this will not prevent you from purchasing any products or services from Holla.\n" +
                "\n" +
                "4.   How We Use Personal Information\n" +
                "      Subject to applicable laws, we may collect, use and disclose relevant portions of your personal information in order to:\n" +
                "      provide and charge for hotel accommodation and other goods and services;\n" +
                "      provide you with a better or more personalized level of service, including information and services from a third party (such as additional guest services at Holla hotels and         resorts, local attractions and transportation options);\n" +
                "      respond to requests for information and services, including services from a third party (such as restaurants or transportation providers);\n" +
                "     administer the Holla frequent guest program (e.g. World of Holla®);\n" +
                "     fulfil contractual obligations to you, anyone involved in the process of making your travel arrangements (e.g. travel agents, group travel organizers or your employer) and          vendors (e.g. credit card companies, airline operators and third party loyalty programs);\n" +
                "     conduct market research, customer satisfaction and quality assurance surveys, and direct marketing and sales promotions;\n" +
                "     provide for the safety and security of staff, guests and other visitors;\n" +
                "     administer general record keeping;\n" +
                "     meet legal and regulatory requirements;\n" +
                "     test and evaluate new products and services; and\n" +
                "     process credit applications (for example in the context of Holla Residence Clubs).\n" +
                "     Holla uses and retains your personal information for as long as is necessary to fulfil the Purpose.\n" +
                "\n" +
                "5.  Disclosures of your Personal Information\n" +
                " \n" +
                "5.1  Our Agents, Service Providers and Suppliers\n" +
                "Like most international hotel brands, we may outsource the processing of certain functions and/or information to third parties. We may also engage market research firms to assist us in contacting guests for the purpose of market research and quality assurance. When we do outsource the processing of your personal information to third parties or provide your personal information to third-party service providers, we oblige those third parties to protect your personal information in accordance with the terms and conditions of this Policy, with appropriate security measures.\n" +
                "\n" +
                "5.2  Consumer Insights\n" +
                "Where we hold personal information about you, we may disclose this personal information to other companies that also hold information about you. These companies may combine the information in order to better understand your preferences and interests, thereby enabling them and us to serve you better. If your personal information is used for direct marketing purposes, you have the right to object to that by contacting us using the contact information provided under Section 12 below.\n" +
                "\n" +
                "5.3  Credit Authorization\n" +
                "When you request credit, your personal information will be used and disclosed to appropriate third parties in accordance with applicable laws for the purpose of determining whether to grant and maintain a line of credit to you.\n" +
                "\n" +
                "5.4  Business Transfers\n" +
                "As we continue to develop our business, we may sell hotels and other assets, or cease being the manager or franchisor of a hotel that is currently part of our portfolio. In those circumstances, we may include the personal information collected about you, or control of that personal information, as a business asset in any such transfer. Also, in the unlikely event that we, or substantially all of our assets, are acquired, personal information collected about you, or control of such information, may be one of the transferred assets.\n" +
                "\n" +
                "5.5  E-Folio Program\n" +
                "If you are an employee or independent contractor of a company that participates in Holla’s E-Folio Program, and you use the corporate credit card that is provided to you by your employer (if you are an employee) or corporate client (if you are an independent contractor) to pay for your hotel bill at a Holla property, then you may benefit from Holla’s E-Folio Program.\n" +
                "Under the E-Folio Program, an extract of your bill (including the dates of your stay, your credit card details and amounts incurred at the Holla property including room charges and all incidental charges including but not limited to food, beverage and entertainment charges) will be transferred electronically by the Holla property via Holla’s U.S.-based information system either to Holla or to a third-party service provider located in the United States who acts on Holla’s behalf to compile the extract and transfer it to:\n" +
                "the credit card network operator, the credit card issuer and/or their respective subcontractors, who will, in turn, forward that extract to your employer or corporate client (and/or their respective subcontractors) to facilitate the processing and tracking of your travel-related expenses; or\n" +
                "in some limited circumstances, your employer or corporate client (and/or their respective subcontractors) directly for the same purpose.\n" +
                "The entities that receive the extract of your bill may be located in the United States, which does not have privacy laws that specifically address in detail all uses of personal information in the same way as in other parts of the world (notably Europe, Canada, Australia, South Africa and most of South America). In order to ensure the protection of your personal information, its transfer to Holla’s U.S.-based information system will be governed by our binding corporate rules (where they apply to you). The third party service provider who acts on Holla’s behalf to compile the extract will be subject to contractual provisions meeting the requirements of Holla’s binding corporate rules.\n" +
                "Once the personal information is transferred to the credit card network operator, credit card issuer, your employer or corporate client and/or their respective subcontractors, it is no longer subject to the protections described in this Policy, but rather your own arrangements with your employer or corporate client, the relevant credit card network operator and/or the relevant card issuer.\n" +
                "\n" +
                "5.6  Legal Requirements\n" +
                "We reserve the right to disclose any personal information we have concerning you if we are compelled to do so by a court of law or lawfully requested to do so by a governmental entity or if we determine it is necessary or desirable to comply with the law or to protect or defend our rights or property in accordance with applicable laws. We also reserve the right to retain personal information collected and to process such personal information to comply with accounting and tax rules and regulations and any specific record retention laws.\n" +
                "\n" +
                "6.   Centralized Data Processing Activities\n" +
                "Like most international businesses, we have centralized certain aspects of our data processing activities in accordance with applicable laws, which, in many instances, will result in the transfer of your personal information from one country to another. For example, if you make a reservation and/or stay at one of the Holla hotels or resorts outside of the United States, the personal information gathered in that process will be transferred to and processed in the United States, in accordance with Holla’s binding corporate rules (where they apply to you). The jurisdictions where that information will be processed may or may not have laws that seek to preserve the privacy of personal information. Nevertheless, whenever your personal information is transferred within the Holla companies, your personal information will be processed in accordance with the terms and conditions of this Policy and applicable laws.\n" +
                "\n" +
                "7.   Information We Collect When You Visit Us Online\n" +
                "If you access any Holla website, you may wish to know the following:\n" +
                "\n" +
                "7.1  You Can Browse Without Revealing Who You Are\n" +
                "You can always visit our websites without logging in or otherwise revealing who you are.\n" +
                "\n" +
                "7.2  Usage Information\n" +
                "When you visit our websites, we collect information about how you use those websites. Examples of such information include the Internet Protocol address automatically assigned to your computer each time you browse the Internet, the date and time of your visit, the pages you access and the amount of time you spend on each page, the type of Internet browser you use, your device’s operating system and the URL of any websites that you visited before and after visiting our website. That information is not linked to you as an individual unless you create a user profile, but we may keep records of the device being used.\n" +
                "\n" +
                "7.3  Cookies and Other Similar Technology\n" +
                "We use cookie technology on our websites to allow us to evaluate and improve the functionality of our websites. Cookies by themselves cannot be used to reveal your identity. They identify your browser, but not you, to our servers when you visit our websites. For information about how Holla uses cookies, visit Holla.com.\n" +
                "If you do not want to accept cookies, you can block them by adjusting the settings on your Internet browser. However, if you block them, you will not be able to use all of the features of our websites, including the customization features associated with creating a user profile.\n" +
                "Further information about cookies and other similar technology and how they work is available at allaboutcookies.org.\n" +
                "\n" +
                "7.4  Social Media\n" +
                "Our websites may also contain plug-ins and other features that integrate third party social media platforms into our websites. You will be able to activate them manually. If you do so, the third parties who operate these platforms may be able to identify you, they may be able to determine how you use this website and they may link and store this information with your social media profile. Please consult the data protection policies of these social media platforms to understand what they will be doing with your personal data. If you activate these plug-ins and other features, you will be doing so at your own risk.\n" +
                "\n" +
                "7.5  Creating a User Profile\n" +
                "You can create a user profile on a Holla website to, among other things, facilitate your online transactions, and to tailor your experience on our websites to your interests. This allows us to make more appropriate recommendations to you. We may use the information you provide in your user profile to populate other databases maintained by us and our service providers, as applicable. By creating a user profile, you are agreeing that we may use the personal information you provide for these purposes.\n" +
                "You can view, update or remove any personal information that you have provided to us for inclusion in your user profile by amending your user profile online or emailing concierge@Holla.com. If you subsequently elect to remove your user profile, we reserve the right to use any personal information previously provided by you for inclusion in your user profile for record keeping and quality assurance purposes (unless we are required by law to delete or cease to process or use your personal information). Even if you choose not to create a user profile, you can still use our websites to search for and purchase services.\n" +
                "\n" +
                "7.6  Links to Other Websites\n" +
                "If you visit a Holla website and decide, for example, to purchase a gift certificate, make an airline reservation, rent a car, submit award request forms or apply for a job online, you may be seamlessly linked to websites maintained by third parties with whom we have contracted to provide those services. If you click on a link found on our websites or on any other website, you should always look at the location bar within your browser to determine whether you have been linked to a different website. This Policy, and our responsibility, is limited to our own information collection practices. We are not responsible for, and cannot always ensure, the information collection practices or privacy policies of other websites maintained by third parties or our service providers where you submit your personal information directly to such websites. In addition, we cannot ensure the content of the websites maintained by these third parties or our service providers, even if accessible using a link from our websites. We urge you to read the privacy and security policies of any external websites before providing any personal information while accessing those websites.\n" +
                "\n" +
                "7.7  Security\n" +
                "Because the security of your personal information is important to us, we use Secured Socket Layer (“SSL”) software in order to encrypt the personal information that you provide to us. If your browser is SSL enabled (which most are), your transmission of personal information to us online will be encrypted. You can verify whether your personal information is transmitted using SSL encryption by confirming the symbol of a closed lock or solid key on the bottom bar of your browser window. You can also verify that your personal information will be encrypted using SSL encryption by making sure that the prefix for the web address listed for that page has changed from “http” to “https”. If you do not see the appropriate symbol and the “https” prefix, you should not assume that the personal information that you are being asked to provide will be encrypted prior to transmission.\n" +
                "The personal information we collect from you online is stored by us and/or our service providers on databases protected through a combination of physical and electronic access controls, firewall technology and other reasonable security measures. Nevertheless, such security measures cannot prevent all loss, misuse or alteration of personal information and we are not responsible for any damages or liabilities relating to any such incidents to the fullest extent permitted by law. Where required under law, we will notify you of any such loss, misuse or alteration of personal information that may affect you so that you can take the appropriate actions for the due protection of your rights.\n" +
                "\n" +
                "7.8  Minor Children\n" +
                "Our websites do not sell products or services for purchase by children and we do not knowingly solicit or collect personal information from children. If you are under the age of 18 (or a minor in the jurisdiction in which you are accessing our websites), you may only use our websites with the involvement of a parent or guardian.\n" +
                "\n" +
                "7.9  Targeted Advertising\n" +
                "Where permitted by law, we may work with other companies to show you advertisements we think you may find relevant and useful. This may include advertisements displayed on our own websites or apps, or advertisements from us displayed on other companies' websites. The advertisements you see may be based on information collected by us or third parties and/or may be based on your activities on our websites or third-party websites.\n" +
                "\n" +
                "8.  Apps\n" +
                "When you download or register to use one of our apps, you may submit personal information to us such as your name, address, email address, phone number, date of birth, username, password and other registration information, financial and credit card information, personal description and/or image.\n" +
                "Further, when you use our apps, we may collect certain information automatically, including technical information related to your mobile device, your device’s unique identifier, your mobile network information, the type of mobile browser you use and information about the way you use the app.\n" +
                "Depending on the particular app you use and only after you have agreed to such collection, we may also collect information stored on your device, including contact information, friends lists, login information (where necessary to allow us to communicate with other apps at your request), photos, videos, location information or other digital content. Further details of the kinds of information we collect is set out in the privacy notice for each individual app.\n" +
                "\n" +
                "9.   Choice\n" +
                "You may always choose what personal information (if any) you wish to provide to us. However, if you choose not to provide certain details, some of your experiences with us may be affected (for example, we cannot take a reservation without a name).\n" +
                "If you provide us with your contact details (e.g. postal address, email address, telephone number or fax number), we may contact you to let you know about the products, services, promotions and events offered that we think you may be interested in. We may also share your personal information with carefully-selected third parties, who may communicate directly with you. In some jurisdictions, data privacy laws may require us to obtain a separate consent before we do so. You can always choose whether or not to receive any or all of these communications by contacting us as described in Section 12 below or following the “unsubscribe” instructions contained in the communications.\n" +
                "If you have an account with our frequent guest program (e.g. World of Holla®) we ask you to indicate your communication preferences at the time you apply for membership or when you create your user profile. We may also ask you to indicate how you would like to receive any offers, marketing and promotional information (e.g. via email or regular mail) and whether you would be willing to participate in surveys. Once you have indicated your preferences, you can always change them.\n" +
                "In some jurisdictions, in addition to you agreeing to this Policy, data privacy laws may require us to obtain a separate consent before we send you information that you have not specifically requested. In certain circumstances, your consent may be implied (e.g. where communications are required in order to fulfil your requests and/or where you have volunteered information for use by us). In other cases, we may seek your consent expressly in accordance with applicable laws (e.g. where the information collected is regarded to be Sensitive Personal Information under local regulations).\n" +
                "We will abide by any request from you not to send you direct marketing materials. When such a request is received, your contact details will be “suppressed” rather than deleted. This will ensure that your request is recorded and retained unless you provide a later consent that overrides it.\n" +
                "\n" +
                "10.   Updating or Accessing Your Personal Information\n" +
                "With some limited exceptions, you have rights to access and update personal information held about you. If you want to inquire about any personal information we may have about you, you can do so by sending us a written request by letter or email to the addresses set out in Section 12 below. Please be sure to include your full name, address and telephone number and a copy of a document evidencing your identity (such as an ID card or passport) so we can ascertain your identity and whether we have any personal information regarding you, or in case we need to contact you to obtain any additional information we may require to make that determination.\n" +
                "We reserve the right to charge you a fee, if permitted under applicable law, which is usually around US$20 for processing any such request. Where you make more than one request in quick succession, we may respond to your subsequent request by referring to our earlier response and only identifying any items that have changed materially.\n" +
                "You may request that we correct, cancel, and/or stop processing or using personal information that we hold about you. If we agree that the personal information is incorrect, or that the processing should be stopped, we will delete or correct the personal information. If we do not agree that the personal information is incorrect we will tell you that we do not agree, explain our refusal to you and record the fact that you consider that personal information to be incorrect in the relevant file(s).\n" +
                "\n" +
                "11.  Changes to this Policy\n" +
                "Just as our business changes constantly, this Policy may also change. To assist you, this Policy has an effective date set out at the end of this document.\n" +
                "\n" +
                "12.  Request for Access to Personal Information/Questions or Complaints\n" +
                "If you have any questions about this Policy, about the processing of your data described, or any concerns or complaints with regard to the administration of the Policy, or if you would like to submit a request (in the manner described in Section 10 above) for access to or deletion of the personal information that we maintain about you, please contact us by any of the following means:\n" +
                "by calling one of the following toll-free reservation numbers located at the Customer Service page on Holla.com;\n" +
                "by mail at Holla Hotels & Resorts, Attn: Consumer Affairs, 9805 Q Street, Omaha, NE 68127, United States; or\n" +
                "by contacting the front desk at any of our hotels.\n" +
                "If you are not satisfied with the response that you receive, you can escalate your concern to the Chief Privacy Officer by sending an email to privacy@Holla.com.\n" +
                "While this Policy alone does not create contractual rights, Holla has ensured compliance with some of its legal obligations in some countries in relation to personal information by creating a set of binding standards and policies (known in some countries as binding corporate rules), approved by a number of national privacy regulators. As a result, depending on your circumstances and location, you may be able to enforce your privacy rights using those standards or policies through that regulator or a court. If you would like to know more about these standards and policies, please contact Holla Hotels & Resorts at the address above or the Chief Privacy Officer at the email address above.\n" +
                "All requests for access to your personal information must be submitted in writing by letter or email. We may respond to your request by letter, email, telephone or any other suitable method.\n" +
                "Effective Date: July 30, 2015\n" +
                "In the event of any inconsistencies between the English version of this Policy and any version of this Policy in any other language, the English version shall prevail (to the fullest extent permitted under applicable law).");
        policyPanel.setLayout(null);
        policyPanel.setOpaque(false);


        policyTextArea.setFont(new Font("Century Gothic",Font.BOLD, 17));
        policyTextArea.setForeground(colorForPanelText);
        policyTextArea.setSize(30,30);
        policyTextArea.setOpaque(false);
        policyTextArea.setLineWrap(true);
        policyTextArea.setWrapStyleWord(true);

        jScrollPane.setOpaque(false);
        jScrollPane.getViewport().setOpaque(false);
    }

    private void setBounds() {
        policyPanel.setBounds(0,140,1400,550);
        // welcome.setBounds(60,20,1250,550);
        jScrollPane.setBounds(50,00,1300,550);

    }

    private void addComponentToPanel() {
//        policyPanel.add(welcome);
        policyPanel.add(jScrollPane);
    }
    public JPanel getPolicyPanel(){
        return this.policyPanel;
    }
}
