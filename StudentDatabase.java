// StudentDatabase.java
import java.util.*;

public class StudentDatabase {
    private List<Student> studentList = new ArrayList<>();
    
    public void addStudent(Student student) throws DuplicatePRNException {
        for (Student s : studentList) {
            if (s.getPrn().equals(student.getPrn())) {
                 throw new DuplicatePRNException("Student with PRN already exists.");
            }
            studentList.add(student);
        }
        public List<Student> getAllStudents() {
        return studentList;
    }
