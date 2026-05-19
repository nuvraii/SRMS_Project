# SRMS Project
Student Record Management System

## Course
IT214 - Object Oriented Programming

## Project Description
The Student Management System is a Java-based console application designed to help users manage student records easily.  
The system allows users to add, update, remove, search, display, save, and load student information using object-oriented programming concepts and multithreading.

---

## Features
- Add new student records
- Search for students by name
- Update student information
- Remove students from the database
- Display all students
- Save student records into a file
- Load student records from a file
- Generate student reports:
  - Average GPA
  - Count students
  - Show students by department
  - Show top student

---

## Classes Used

### 1. main
Controls the program execution and displays the menu for the user.

### 2. User
Parent class that stores common user information:
- ID
- Name
- Email Address
- Phone Number

### 3. StudentData
Child class inherited from User.
Stores additional student information:
- Academic Year
- GPA
- Department

### 4. StudentDatabase
Manages all student records using ArrayList<StudentData>.

### 5. StudentReportGenerator
Generates reports such as:
- Average GPA
- Top student
- Student count
- Students by department

### 6. FileManager
Handles saving and loading student data using file handling.

### 7. SaveThread
Extends Thread class to save student data using multithreading.

---

## Programming Concepts Used
- Object-Oriented Programming (OOP)
- Inheritance
- Encapsulation
- ArrayList
- File Handling
- Exception Handling
- Multithreading
- Method Overriding

---

## How to Run the Program
1. Open the project in your Java IDE.
2. Run the main class.
3. Choose a service from the menu.
4. Enter the required information.

---

## File Used
The system stores student records in:
students_records.txt

---

## Team Members
- Fajer Alhenaki
- Noor Alharbi
- Shahad Alharbi

---

## Notes
- The project uses serialization to save objects into files.
- Multithreading is used to improve performance while saving data.# SRMS_Project
IT214 Project : Student Record Management System
