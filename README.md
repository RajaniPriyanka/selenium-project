# selenium-example
Prerequisites
There are a few things we need before running the tests. These are:

1.Java Installation / Update

2.Setting up Eclipse

  Installing TestNG
  
  Setting up Maven
  
3.Running the Project

  From Eclipse
  
  From Terminal
  
4.Drivers 

Java Installation / Update

Check your system to see if you have the latest Java version installed.

Command:

$ java -version

If you do not have the latest Java installed, find out how to install Java here.
Ensure your JAVA_HOME environment to the location of the installed JDK. Find out how to do that here.

Setting up Eclipse

Navigate to the Eclipse download page and download eclipse for Java EE developers.

1.Installing a Plugin:

  Inside Eclipse, click on the Help menu
  
  Select Install New Software.
  
 2.Locating the Plugin:
 
   Click the Add button
   
   Enter http://dl.bintray.com/testng-team/testng-eclipse-release/ in the Location field
   
 3.Selecting the Plugin:
 
   Ensure the TestNG checkbox is selected
   
   Click the "Next" button to the right bottom
   
 4.Finishing up:
 
   Accept the terms of the license agreement
   
   Click on the Finish button
   
 Setting up Maven
   
 1.Download Maven here.
 
 2.Unzip the distribution archive to the directory you wish to install Maven. I extracted maven to my Documents folder.
 
 3.Add Maven to the PATH. More information can be found in the README.txt in the zip folder.
 
   Here's an example of how I added Maven to my PATH on MacOS. I added the folowing to the ~/.bash_profile.
   
     $ export PATH=/Users/admin/Documents/Software/apache-maven-3.5.0/bin:$PATH
     
   Then sourced (execute) the content of the ~/.bash_profile
   
     $ source ~/.bash_profile
     
 4.Verify Maven was correctly installed
 
   Command:
   
     $ mvn –version
     
Maven dependencies are crucial to running any Maven project.

Maven dependencies contains key references to libraries that a Maven project needs to execute. The pom.xml in the root of a Maven project file stores the dependencies for a project.

Running the Project

1.From Eclipse

  Import this project into Eclispe
  
  Right click the project then select Run As then Maven Tests

