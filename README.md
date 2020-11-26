# Employees Data Migration Project

## Requirements
- Create an application that can perform Data migration from CSV file to a SQL database
- Read data from a CSV file
- Filter out any duplicates from the CSV file
- Persist the data to a SQL database
- Report the performance of persisting the data
- Improve on the performance of data persistence

## What I've accomplished
To accomplish this, the data from the CSV file was first read using a FileReader and stored in a collection. At this point, the data was filtered to ensure any duplicates were removed before importing the data into the SQL database. The performance of loading the data into the collection and subsequent import to the database are reported. 

## Motivation
This project provided an opportunity to implement the skills I have gained recently to read a file, manipulate and populate a collection, implement new design patterns (DAO and DTO)
and use threads. Most interestingly, I have learnt how to connect a SQL database and write and execute SQL queries through Java. I believe this will be a really useful skill in allowing me to write full stack web applications.
I was also able to further build on skills I had already gained in the use of loggers, handling exceptions and unit testing.

## Functionalities 
This project allows for the data migration from a CSV file to an SQL database. Included in this project 
are the Java Core functionalities such as logging, handling of exceptions, concurrency (through threading)
and unit and performance testing. 

## Technologies
- IntelliJ
- Java (JDK 11)
- Maven
- Log4j2
- J-Unit 5
- MySQL

## Launch
To launch this project you require IntelliJ (community or ultimate) and then need to clone this github repo and open this project from IntelliJ.
To use this program, Add your employee records CSV file to the resources directory, ensuring the column headings are the same as those in the EmployeeDTO class.
After completing this, change the variable ReadFile.inputFile to the path of your new file. Then run the program.

## Future Work
- Adding additional Crud functionalities - updating, deleting employee records
- Adding a front end
