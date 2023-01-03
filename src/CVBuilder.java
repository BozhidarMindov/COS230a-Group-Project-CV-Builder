/**

 * File: CVBuilder.java

 * Authors: Bozhidar Mindov, Kamen Georgiev, Gerald Proda, Dhimiter Goxhaj, Emiliano Cupi

 * Date: 12/03/2022

 */

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;

// This class takes in all the user's input and writes it onto a pdf file, thus creating their CV.
public class CVBuilder{
    // Instance variables
    private String fullName;
    private String address;
    private String email;
    private String phone;
    private String skills;
    private String socialMedia;
    private String education;
    private String workExperience;

    private String achievements;
    private String languages;

    // Default constructor
    public CVBuilder(){
        fullName = "";
        address = "";
        email = "";
        phone = "";
        socialMedia = "";
        skills = "";
        education = "";
        workExperience = "";
        achievements = "";
        languages = "";
    }

    // Constructor with parameters
    public CVBuilder(String fullName, String address, String email, String phone, String skills, String socialMedia, String education, String workExperience, String achievements, String languages){
        setFullName(fullName);
        setAddress(address);
        setEmail(email);
        setPhone(phone);
        setSkills(skills);
        setSocialMedia(socialMedia);
        setEducation(education);
        setWorkExperience(workExperience);
        setAchievements(achievements);
        setLanguages(languages);
    }

    // Setters
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setSkills(String skills){
        this.skills = skills;
    }

    public void setSocialMedia(String socialMedia){
        this.socialMedia = socialMedia;
    }

    public void setEducation(String education){
        this.education = education;
    }

    public void setWorkExperience(String workExperience){
        this.workExperience = workExperience;
    }

    public void setAchievements(String achievements){
        this.achievements = achievements;
    }

    public void setLanguages(String languages){
        this.languages = languages;
    }

    // Getters
    public String getFullName(){
        return fullName;
    }

    public String getAddress(){
        return address;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone(){
        return phone;
    }

    public String getSocialMedia(){
        return socialMedia;
    }

    public String getSkills() {
        return skills;
    }

    public String getEducation(){
        return education;
    }

    public String getWorkExperience(){
        return workExperience;
    }

    public String getAchievements(){
        return achievements;
    }

    public String getLanguages(){
        return languages;
    }

    public void writeText(PdfContentByte cb, BaseFont bf, String textToDisplay, int x, int y, int fontSize, boolean bold){
        // This method takes the text from the text entry and places it onto the pdf file, based on the entered coordinates.
        // It can also be specified whether the text in the pdf should be bold.
        // Font size should also be specified.

        // Splitting the input string into a different array elements. We use the `\n` character to do the splits.
        // This array allows us to display each new line correctly.
        String[] lines = textToDisplay.split("\n");

        // A for loop is used to place the text on screen, because the `itext` library can only display single lines.
        // That is why, we display the inputted text line by line on the screen, each row being 20 coordinate units lower that the previous.
        for (int i = 0; i < lines.length; i++){
            Chunk chunk = new Chunk(lines[i]);
            if (bold){
                chunk.setFont(new Font(bf, fontSize, com.itextpdf.text.Font.BOLD));
            }
            else{
                chunk.setFont(new Font(bf, fontSize));
            }
            ColumnText.showTextAligned(cb, Element.ALIGN_LEFT, new Phrase(chunk), x, y, 0);
            y = y - 20;
        }
    }

    public void saveFile(){
        // This function reads the template pdf file and places all the user's input from the GUI on the template.

        try {
            // Creating a pdf reader to read from the template.
            PdfReader pdfReader =
                    new PdfReader("PDF_Resume_template_1_empty.pdf");

            // Creating a pdfStamper which will write on the template.
            PdfStamper pdfStamper = new PdfStamper(pdfReader,
                    new FileOutputStream(this.getFullName() + "_CV.pdf"));

            // Specifying the base font.
            BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
            // Specifying the content byte that will be used to write the needed text.
            PdfContentByte cb = pdfStamper.getOverContent(1);

            // Writing all the text on the template.
            writeText(cb, bf, this.getFullName(), 50, 700, 24, true);
            writeText(cb, bf, this.getAddress(), 380, 700, 12, false);
            writeText(cb, bf, this.getEmail(), 380, 680, 12, false);
            writeText(cb, bf, this.getPhone(), 380, 660, 12, false);
            writeText(cb, bf, this.getWorkExperience(), 50, 580, 12, false);
            writeText(cb, bf, this.getSkills(), 370, 580, 12, false);
            writeText(cb, bf, this.getEducation(), 50, 330, 12, false);
            writeText(cb, bf, this.getAchievements(), 370, 410, 12, false);
            writeText(cb, bf, this.getSocialMedia(), 50, 150, 12, false);
            writeText(cb, bf, this.getLanguages(), 370, 220, 12, false);

            // Closing the pdf stamper.
            pdfStamper.close();

        } catch (Exception e1) {
            //If, for some reason, there is a problem with the files, the program will display an error message.
            System.out.println("Error");
        }

    }

}
