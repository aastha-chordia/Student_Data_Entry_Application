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
