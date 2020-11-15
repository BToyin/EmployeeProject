# Employees Data Migration Project
## Introduction
In this project I was required to perform a data migration from a CSV file to a SQL database.
To accomplish this, the data from the CSV file was first read using a FileReader and stored in a collection.
At this point, the data was filtered to ensure any duplicates were removed before
importing the data into the SQL database. The performance of loading the data into the collection
and subsequent import to the database are reported. 

## Motivation
This project provided an opportunity to implement the skills I have gained recently 
to read a file, manipulate and populate a collection, implement new design patterns (DAO and DTO)
and use threads. Most interestingly, I have learnt how to connect a SQL database and write and execute SQL queries through Java. I believe this will be a really useful skill in allowing me to write full stack web applications.
 I was also able to further build on skills I had already gained in the use of loggers, handling exceptions and unit testing.

## Functionalities 
This project allows for the data migration from a CSV file to an SQL database. Included in this project 
are the Java Core functionalities such as logging, handling of exceptions, concurrency (through threading)
and unit and performance testing. 

## Technologies
This Project was written in Java (JDK 11) and built using IntelliJ and Maven dependencies. J-unit was used for testing purposes and log42j for logging.

## Launch
To launch this project you require IntelliJ (community or ultimate) and 
then need to clone this github repo and open this project from IntelliJ.
To use this program, Add your employee records CSV file to the resources directory, ensuring the column headings are the same as those in the EmployeeDTO class.
After completing this, change the variable ReadFile.inputFile to the path of your new file. Then run the program.