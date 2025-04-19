// StudentDatabase.java
import java.util.*;

import exceptions.DuplicatePRNException;
import exceptions.InvalidCGPAException;
import exceptions.InvalidPositionException;
import exceptions.StudentNotFoundException;

class StudentOperations {
    ArrayList<Student> students; // array list of data type Student (object) which is a combination of String and int
   public StudentOperations() {
        this.students = new ArrayList<>();
    }
    public void addStudents(Student student)
            throws DuplicatePRNException, InvalidCGPAException {
        try {
            if (searchByPRN(student.getPRN()) != null) {
                throw new DuplicatePRNException("PRN already exists!");
            }
        catch (StudentNotFoundException e) {
            // Student does not exist – this is expected. Do nothing.
        }
        if (student.getCGPA() < 0.0 || student.getCGPA() > 10.0) {
            throw new InvalidCGPAException("Invalid CGPA entered! Must be between 0.0 and 10.0.");
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }
    
    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }

     public Student searchByPRN(long prn) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                return student;
            }
        }
         throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
