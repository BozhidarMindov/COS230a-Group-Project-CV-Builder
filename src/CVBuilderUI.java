/**

 * File: CVBuilderUI.java

 * Authors: Bozhidar Mindov, Kamen Georgiev, Gerald Proda, Dhimiter Goxhaj, Emiliano Cupi

 * Date: 12/03/2022

 */

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// This class creates and operates a GUI that the user will use to enter their information for their CV.
// The GUI has a save button, which when clicked, will save the user's personalized CV onto a pdf file.
public class CVBuilderUI extends JFrame implements ActionListener{
    JLabel nameLabel;
    JLabel addressLabel;
    JLabel emailLabel;
    JLabel phoneLabel;
    JLabel socialMediaLabel;
    JLabel skillsLabel;
    JLabel educationLabel;
    JLabel workExperienceLabel;
    JLabel languagesLabel;
    JLabel achievementsLabel;

    JTextPane educationTextPane;
    JTextPane experienceTextPane;
    JTextPane skillsTextPane;
    JTextPane languagesTextPane;
    JTextPane socialMediaTextPane;

    JTextPane achievementsTextPane;

    JTextField nameTextField;
    JTextField addressTextField;
    JTextField phoneTextField;
    JTextField emailTextField;

    JButton saveButton;
    JButton newCVButton;

    // Constructor
    public CVBuilderUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exits on close
        this.setResizable(false); // Prevents the frame from being resized
        this.setTitle("CV Builder");
        this.setSize(700, 850);
        this.getContentPane().setBackground(new Color(44, 56, 99));
        this.setLayout(null);

        // Labels
        nameLabel = new JLabel();
        nameLabel.setBounds(20,0,180,50);
        nameLabel.setText("Name:");
        nameLabel.setForeground(new Color(255, 255, 255));
        nameLabel.setFont(new Font("Roboto",Font.BOLD,25));
        nameLabel.setHorizontalTextPosition(JLabel.CENTER);
        nameLabel.setVerticalTextPosition(JLabel.CENTER);
        nameLabel.setVerticalAlignment(JLabel.CENTER);
        nameLabel.setFocusable(false);

        addressLabel = new JLabel();
        addressLabel.setBounds(20,50,180,50);
        addressLabel.setText("Address:");
        addressLabel.setForeground(new Color(255, 255, 255));
        addressLabel.setFont(new Font("Roboto",Font.BOLD,25));
        addressLabel.setHorizontalTextPosition(JLabel.CENTER);
        addressLabel.setVerticalTextPosition(JLabel.CENTER);
        addressLabel.setVerticalAlignment(JLabel.CENTER);
        addressLabel.setFocusable(false);

        emailLabel = new JLabel();
        emailLabel.setBounds(20,100,180,50);
        emailLabel.setText("Email:");
        emailLabel.setForeground(new Color(255, 255, 255));
        emailLabel.setFont(new Font("Roboto",Font.BOLD,25));
        emailLabel.setHorizontalTextPosition(JLabel.CENTER);
        emailLabel.setVerticalTextPosition(JLabel.CENTER);
        emailLabel.setVerticalAlignment(JLabel.CENTER);
        emailLabel.setFocusable(false);

        phoneLabel = new JLabel();
        phoneLabel.setBounds(20,150,180,50);
        phoneLabel.setText("Phone:");
        phoneLabel.setForeground(new Color(255, 255, 255));
        phoneLabel.setFont(new Font("Roboto",Font.BOLD,25));
        phoneLabel.setHorizontalTextPosition(JLabel.CENTER);
        phoneLabel.setVerticalTextPosition(JLabel.CENTER);
        phoneLabel.setVerticalAlignment(JLabel.CENTER);
        phoneLabel.setFocusable(false);

        socialMediaLabel = new JLabel();
        socialMediaLabel.setBounds(20,200,180,50);
        socialMediaLabel.setText("Social media:");
        socialMediaLabel.setForeground(new Color(255, 255, 255));
        socialMediaLabel.setFont(new Font("Roboto",Font.BOLD,25));
        socialMediaLabel.setHorizontalTextPosition(JLabel.CENTER);
        socialMediaLabel.setVerticalTextPosition(JLabel.CENTER);
        socialMediaLabel.setVerticalAlignment(JLabel.CENTER);
        socialMediaLabel.setFocusable(false);

        skillsLabel = new JLabel();
        skillsLabel.setBounds(350,200,180,50);
        skillsLabel.setText("Skills:");
        skillsLabel.setForeground(new Color(255, 255, 255));
        skillsLabel.setFont(new Font("Roboto",Font.BOLD,25));
        skillsLabel.setHorizontalTextPosition(JLabel.CENTER);
        skillsLabel.setVerticalTextPosition(JLabel.CENTER);
        skillsLabel.setVerticalAlignment(JLabel.CENTER);
        skillsLabel.setFocusable(false);

        educationLabel = new JLabel();
        educationLabel.setBounds(20,400,180,50);
        educationLabel.setText("Education:");
        educationLabel.setForeground(new Color(255, 255, 255));
        educationLabel.setFont(new Font("Roboto",Font.BOLD,25));
        educationLabel.setHorizontalTextPosition(JLabel.CENTER);
        educationLabel.setVerticalTextPosition(JLabel.CENTER);
        educationLabel.setVerticalAlignment(JLabel.CENTER);
        educationLabel.setFocusable(false);

        workExperienceLabel = new JLabel();
        workExperienceLabel.setBounds(350,400,250,50);
        workExperienceLabel.setText("Work Experience:");
        workExperienceLabel.setForeground(new Color(255, 255, 255));
        workExperienceLabel.setFont(new Font("Roboto",Font.BOLD,25));
        workExperienceLabel.setHorizontalTextPosition(JLabel.CENTER);
        workExperienceLabel.setVerticalTextPosition(JLabel.CENTER);
        workExperienceLabel.setVerticalAlignment(JLabel.CENTER);
        workExperienceLabel.setFocusable(false);

        languagesLabel = new JLabel();
        languagesLabel.setBounds(20,590,180,50);
        languagesLabel.setText("Languages:");
        languagesLabel.setForeground(new Color(255, 255, 255));
        languagesLabel.setFont(new Font("Roboto",Font.BOLD,25));
        languagesLabel.setHorizontalTextPosition(JLabel.CENTER);
        languagesLabel.setVerticalTextPosition(JLabel.CENTER);
        languagesLabel.setVerticalAlignment(JLabel.CENTER);
        languagesLabel.setFocusable(false);

        achievementsLabel = new JLabel();
        achievementsLabel.setBounds(350,590,180,50);
        achievementsLabel.setText("Achievements:");
        achievementsLabel.setForeground(new Color(255, 255, 255));
        achievementsLabel.setFont(new Font("Roboto",Font.BOLD,25));
        achievementsLabel.setHorizontalTextPosition(JLabel.CENTER);
        achievementsLabel.setVerticalTextPosition(JLabel.CENTER);
        languagesLabel.setVerticalAlignment(JLabel.CENTER);
        languagesLabel.setFocusable(false);
        //----------------------------------------------------------------------

        // Text Fields
        nameTextField = new JTextField();
        nameTextField.setBounds(140,10,340,30);
        nameTextField.setBackground(new Color(255, 255, 255));
        nameTextField.setFont(new Font("Roboto",Font.BOLD,14));

        addressTextField = new JTextField();
        addressTextField.setBounds(140,60,340,30);
        addressTextField.setBackground(new Color(255, 255, 255));
        addressTextField.setFont(new Font("Roboto",Font.BOLD,14));

        emailTextField = new JTextField();
        emailTextField.setBounds(140,110,340,30);
        emailTextField.setBackground(new Color(255, 255, 255));
        emailTextField.setFont(new Font("Roboto",Font.BOLD,14));

        phoneTextField = new JTextField();
        phoneTextField.setBounds(140,160,340,30);
        phoneTextField.setBackground(new Color(255, 255, 255));
        phoneTextField.setFont(new Font("Roboto",Font.BOLD,14));
        //--------------------------------------------------------------------

        // Text panes
        socialMediaTextPane = new JTextPane();
        socialMediaTextPane.setBounds(20,245,300,155);
        socialMediaTextPane.setBackground(new Color(238,238,238));
        socialMediaTextPane.setFont(new Font("Roboto",Font.BOLD,14));
        socialMediaTextPane.setOpaque(true);

        skillsTextPane = new JTextPane();
        skillsTextPane.setBounds(350,245,300,155);
        skillsTextPane.setBackground(new Color(238,238,238));
        skillsTextPane.setFont(new Font("Roboto",Font.BOLD,14));
        skillsTextPane.setOpaque(true);

        educationTextPane = new JTextPane();
        educationTextPane.setBounds(20,445,300,155);
        educationTextPane.setBackground(new Color(238,238,238));
        educationTextPane.setFont(new Font("Roboto",Font.BOLD,14));
        educationTextPane.setOpaque(true);

        experienceTextPane = new JTextPane();
        experienceTextPane.setBounds(350,445,300,155);
        experienceTextPane.setBackground(new Color(238,238,238));
        experienceTextPane.setFont(new Font("Roboto",Font.BOLD,14));
        experienceTextPane.setOpaque(true);

        languagesTextPane = new JTextPane();
        languagesTextPane.setBounds(20,635,300,150);
        languagesTextPane.setBackground(new Color(238,238,238));
        languagesTextPane.setFont(new Font("Roboto",Font.BOLD,14));
        languagesTextPane.setOpaque(true);

        achievementsTextPane = new JTextPane();
        achievementsTextPane.setBounds(350,635,300,150);
        achievementsTextPane.setBackground(new Color(238,238,238));
        achievementsTextPane.setFont(new Font("Roboto",Font.BOLD,14));
        achievementsTextPane.setOpaque(true);
        //-----------------------------------------------------------------------

        // Creating a button, which will allow the user to reset the text on the display and start making a CV again.
        newCVButton = new JButton("Start Again");
        newCVButton.addActionListener(this);
        newCVButton.setFocusable(false);
        newCVButton.setBounds(520, 10, 130, 80);

        // Creating a save button.
        saveButton = new JButton("Save CV");
        saveButton.addActionListener(this);
        saveButton.setFocusable(false);
        saveButton.setBounds(520, 110, 130, 80);

        // Adding all components to the GUI.
        this.add(nameLabel);
        this.add(addressLabel);
        this.add(emailLabel);
        this.add(phoneLabel);
        this.add(socialMediaLabel);
        this.add(skillsLabel);
        this.add(educationLabel);
        this.add(workExperienceLabel);
        this.add(languagesLabel);
        this.add(achievementsLabel);

        this.add(nameTextField);
        this.add(addressTextField);
        this.add(emailTextField);
        this.add(phoneTextField);

        this.add(socialMediaTextPane);
        this.add(skillsTextPane);
        this.add(educationTextPane);
        this.add(experienceTextPane);
        this.add(languagesTextPane);
        this.add(achievementsTextPane);

        this.add(saveButton);
        this.add(newCVButton);

        this.setVisible(true); // Making the frame visible
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // This method implementation gives functionality to the buttons.
        /*When the user presses the 'Save' button, the program captures their input from the text entries,
        and places it onto the CV template.*/
        if (e.getSource() == saveButton){
            // When the button is pressed, we initialize a CVBuilder object which uses the user's input.
            CVBuilder cv = new CVBuilder(nameTextField.getText(),
                    addressTextField.getText(),
                    emailTextField.getText(),
                    phoneTextField.getText(),
                    skillsTextPane.getText(),
                    socialMediaTextPane.getText(),
                    educationTextPane.getText(),
                    experienceTextPane.getText(),
                    achievementsTextPane.getText(),
                    languagesTextPane.getText()
            );

            // The `saveFile` method is invoked and the user's CV is saved onto a pdf file.
            cv.saveFile();
            // After the file is saved, the `saveButton` is disabled.
            saveButton.setEnabled(false);
        }
        // If the user presses the` newCVBUtton` all the text in the text entries is cleared and the user can start creating a CV again.
        if (e.getSource() == newCVButton){
            clearTextEntries();
            // The save button is enabled again.
            saveButton.setEnabled(true);
        }
    }

    public void clearTextEntries(){
        // This method resets the text in all text entries.

        nameTextField.setText("");
        addressTextField.setText("");
        emailTextField.setText("");
        phoneTextField.setText("");
        skillsTextPane.setText("");
        socialMediaTextPane.setText("");
        educationTextPane.setText("");
        experienceTextPane.setText("");
        achievementsTextPane.setText("");
        languagesTextPane.setText("");
    }
}
