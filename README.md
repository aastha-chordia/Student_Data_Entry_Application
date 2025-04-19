Student Data Entry Application

Name :- Aastha Chordia
PRN :- 23070126003
AIML A1

This Java application is a Student Management System that allows users to perform CRUD (Create, Read, Update, Delete) operations on student records. 
The system maintains student information including name, PRN (Permanent Registration Number), branch, batch, and CGPA.

Features
Add new students with all required details
Display all students in the system
Search students by:
  PRN (unique identifier)
  Name
  Position in the list
Update student details (name, branch, batch, CGPA)
Delete students from the system
Input validation for all fields
Error handling for various exceptional cases

Class Structure
Student.java - Contains student data model with getters/setters
StudentOperations.java - Handles all business logic and data operations
Main.java - Contains the user interface and menu system
Exception Classes:
  StudentNotFoundException.java
  InvalidPositionException.java
  InvalidCGPAException.java
  DuplicatePRNException.java
