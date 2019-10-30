# Singtel-assessment
This project is developed based on the singtel assessment document provide. Technologies used in this project are:
- JDK1.8
- SpringBoot 2.2.0
- Gradle

This project is catered for 2 below implemetation 
1. Developed standalon program and JUnit to test the given requirement.
2. Developed REST service which consumes "animaltype" and produce "animaldetails" in json format.

Standalone Program Name: com.singtel.mak.SolutionCheck.java
Junit classes : JUnit can be accessible from /test folder.

For REST api, the service is developed using SpringBoot with embeded tomcat server using the port : 8888. Follow the below steps to verify the REST API call.

1. Access the .jar file from <project-folder>/build/libs folder.
2. Use the command to run and load the application using embedded tomcat server.
          $ java -jar singtel-assessment-0.0.1-SNAPSHOT.jar
3. Access the REST service call using the localhost URL in any web browser.
          http://localhost:8888/singtelassess/animaldetails?animaltype=cat
4. Upon accessing the above localhost URL on 8888 port, you will get the below response in JSON format.    
{"animalType":"cat",
  "animalSong":"This animal type(cat) is not able to sing.",
  "animalFly":"This animal type(cat) is not able to fly.",
  "animalSwim":"This animal type(cat) is not able to swim.",
  "animalWalk":"A Cat can walk."
}
