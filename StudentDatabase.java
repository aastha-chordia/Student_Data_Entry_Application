// StudentDatabase.java
import java.util.*;

public class StudentDatabase {
    private List<Student> studentList = new ArrayList<>();
    
    public void addStudent(Student student) throws DuplicatePRNException {
        for (Student s : studentList) {
            
