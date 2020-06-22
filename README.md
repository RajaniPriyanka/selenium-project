# selenium-example 

**Prerequisites**

1.Eclipse IDE Version: 2020-03 (4.15.0)

2.JAVA version "1.8.0_251"

3.Apache Maven 3.6.3

4.TestNG 7.1.0

5.Chrome Version 83.0.4103.106 

6.MAC OS

**Table Of Contents**

There are a few things we need before running the tests. These are:

1.Java Installation / Update

2.Setting up Eclipse

  - Installing TestNG
  
  - Setting up Maven
  
3.Running the Project

  - From Eclipse

**Java Installation / Update**

Check your system to see if you have the latest Java version installed.

Command:

$ java -version

If you do not have the latest Java installed, find out how to install Java https://www.java.com/en/download/help/download_options.xml
Ensure your JAVA_HOME environment to the location of the installed JDK. Find out how to do that https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/

**Setting up Eclipse**

Navigate to the https://www.eclipse.org/downloads/ and download eclipse for Java EE developers.

**Installing a TestNG Plugin:**

  1.Inside Eclipse, click on the Help menu
  
   - Select Install New Software.
  
 2.Locating the Plugin:
 
   - Click the Add button
   
   - Enter http://dl.bintray.com/testng-team/testng-eclipse-release/ in the Location field
   
 3.Selecting the Plugin:
 
   - Ensure the TestNG checkbox is selected
   
   - Click the "Next" button to the right bottom
   
 4.Finishing up:
 
   - Accept the terms of the license agreement
   
   - Click on the Finish button
   
**Setting up Maven**
   
1.Install Maven from http://maven.apache.org/install.html

2.Verify Maven was correctly installed

  Command:
   
     $ mvn –version
     
Maven dependencies are crucial to running any Maven project.

Maven dependencies contains key references to libraries that a Maven project needs to execute. The pom.xml in the root of a Maven project file stores the dependencies for a project.

## Running the Test cases from Eclipse TestNG

  - Import this project into the Eclispe. 
  
  - Right click the project then select Run As then Maven install to add all the dependencies from pom.xml.
  
    ![ScreenShot](https://i.postimg.cc/ZRJWQwJ7/Maven-Install.png)
  
  - Right click the project then select Run As then TestNG Test.
  
     ![ScreenShot](https://i.postimg.cc/pXkMQkSV/RunTests.png)
     
## TestNG Report 

 - The TestNG will generate the default report.
 
 - When you execute testng.xml file, and refresh the project. You will get test-output folder in that folder.
 
 **Method-1: emailable-report.html**
 
 - Click on option "emailable-report.html"
 
 - Click on option web browser
   
   ![ScreenShot](https://i.postimg.cc/brLpm2P4/emailablereport.png)
 
The output report of testng will look like below if both the classes are passed:
   
   ![ScreenShot](https://i.postimg.cc/prmFvxdG/emailable1.png)
 
 **Method-2: index.html**
 
 - Right click on the index.html from the project directory.
 
 - Select option open with web browser option. It will display the result in the following order.
 
   ![ScreenShot](https://i.postimg.cc/sxxNRBSk/index.png)
 
 The result will look like this:
 
   ![ScreenShot](https://i.postimg.cc/zD4s1jtp/index1.png)
 
 
