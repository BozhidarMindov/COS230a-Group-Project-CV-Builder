# COS230a-Group-Project-CV-Builder
This repository contains the group project that Gerald Proda, Dhimiter Goxhaj, Emiliano Cupi, Kamen Gerogiev and I created for the COS230a_F2022 Basics in Java Programming course.


### HW2 Group Project Report
### Team 1 - Kamen Georgiev, Bozhidar Mindov, Emiliano Cupi, Dhimiter Goxhaj, Gerald Proda
### 12/03/2022

# CV Builder App Report 

## Description of the program 

### The aim of the program is to create a CV Builder App, where the user would be able to enter different types of information about themselves (like work experience, education, etc..) and the program would produce a pdf file containing their CV, placed on a nice template.

- The program uses a **GUI** for better visualization.
- The user can enter information in multiple text entries. 
- The user will be able to save their CV as `.pdf` file.
- The saved `.pdf` file will go to the project folder.
- If needed, the user can start creating a new CV, even if they have already made one.

-----

## Classes 

The program has `3` classes:

-----

## CVBuilder
This class is intended to take the input of the user and use it to create the CV `.pdf` file.

### Data Attributes
- `private String fullName;` - stores the name of the user.
- `private String address;` - stores the address of the user.
- `private String email;` - store the email of the user.
- `private String phone;` - store the phone of the user.
- `private String skills;` - store the skills information of the user.
- `private String socialMedia;` - store the social media information of the user.
- `private String education;` - store the education information of the user.
- `private String workExperience;` - store the work experience information of the user.
- `private String achievements;` - store the achievements information of the user.
- `private String languages;` - store the languages information of the user.


### Methods 

`public CVBuilder` - this is the default constructor 

`public CVBuilder` - a constructor that takes fullName, address, email, phone, skills, socialMedia, education, workExperience, achievements and languages as parameters. 

- Setters

`public void setFullName(String fullName)`
       
`public void setAddress(String address)`
        
`public void setEmail(String email)`
      
`public void setPhone(String phone)`
       
`public void setSkills(String skills)`
    
`public void setSocialMedia(String socialMedia)`
          
`public void setEducation(String education)`
       
`public void setWorkExperience(String workExperience)`
         
`public void setAchievements(String achievements)`
      
`public void setLanguages(String languages)`

- Getters 

`public String getFullName()`
        
`public String getAddress()`
       
`public String getEmail()`
          
`public String getPhone()`
           
`public String getSocialMedia()`
          
`public String getSkills()`
        
`public String getEducation()`
          
`public String getWorkExperience()' `
    
`public String getAchievements()`
       
`public String getLanguages()`

### Other methods
`public void writeText()` - takes text string input and places it line by line onto the `.pdf` file. Used in the `saveFile()` method.

`public void saveFile()` - takes the input from the text entries and places it onto the pdf file. 

 -----      
   
## CVBuilderUI `extends JFrame implements ActionListener`
This is the class that creates the GUI where the user will be able to input their data.
When tha save button in the GUI is clicked, the program will save the user's personalized CV onto a `pdf file.`
The class inherits the `JFrame` class and uses some of its functionality. It also implements the `ActionListener` interface, which makes the buttons functional.

### Data Attributes 

#### Labels
```
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
```

#### TextPanes
```
JTextPane educationTextPane; // input education
JTextPane experienceTextPane; // input experience
JTextPane skillsTextPane; // input skills
JTextPane languagesTextPane; // input language skills
JTextPane socialMediaTextPane; // input social media links
JTextPane achievementsTextPane; //input achievements
```

#### Text fields
```
JTextField nameTextField; // input text
JTextField addressTextField; // input address
JTextField phoneTextField; // input phone number
JTextField emailTextField; // input email
```
#### Buttons 
```
JButton saveButton; // saves the .pdf file to program directory.
JButton newCVButton; // starts a new CV creation, clearing all previus input.
```

### Methods

`public CVBuilder()` - a constructor. This is where all the labels, text fields, buttons and text panes are designed. Then all components are added to the GUI using `.add`. Lastly, the pane is made visible with `this.setVisible(true)`

`public void actionPerformed()` - when the user presses the `Save` button, the program saves the `.pdf` file in the project folder. This method gives functionality to the buttons in the GUI.

`public void clearTextEntries()` - reset text in the text entries 

-----

### Main 
**This is the driver class of the program.**
**It creates the `CVBuilderUI` object which is the one displaying the GUI.**

`public static void main(String[] args)` - This is the main method of the program.
In the main method we create all needed objects for the program.
