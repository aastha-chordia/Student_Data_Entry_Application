/*
Aastha Chordia
23070126003
AIML A1
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        
        System.out.println("Student Data Entry System");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            try {
                switch (choice) {
                   case 1:
                        addStudent(scanner, manager);
                        break;
                    case 2:
                        viewAllStudents(manager);
                        break;
                    case 3:
                        searchStudent(scanner, manager);
                        break;
                    case 4:
                        updateStudent(scanner, manager);
                        break;
                    case 5:
                        deleteStudent(scanner, manager);
                        break;
                    case 6:
                        System.out.println("Exit!!");
                        return;
                    default:
                        System.out.println("Invalid choice! Please enter 1-6.");
               
