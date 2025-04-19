// StudentOperations.java
import java.util.ArrayList;

public class StudentOperations {
    ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    public void addStudents(Student student) throws DuplicatePRNException, InvalidCGPAException {
        try {
            if (searchByPRN(student.getPRN()) != null) {
                throw new DuplicatePRNException("PRN already exists!");
            }
        } catch (StudentNotFoundException e) {
            // Student does not exist - this is expected
        }

        if (student.getCGPA() < 0.0 || student.getCGPA() > 10.0) {
            throw new InvalidCGPAException("Invalid CGPA entered! Must be between 0.0 and 10.0.");
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void updateStudent(long prn, String name, String branch, String batch, double cgpa)
            throws StudentNotFoundException, InvalidCGPAException {
        Student student = searchByPRN(prn);
        if (cgpa < 0.0 || cgpa > 10.0) {
            throw new InvalidCGPAException("CGPA must be between 0.0 and 10.0.");
        }
        student.setName(name);
        student.setBranch(branch);
        student.setBatch(batch);
        student.setCGPA(cgpa);
        System.out.println("Student details updated.");
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
        return null;
    }

    public Student searchByPosition(int position) throws InvalidPositionException {
        if (position < 0 || position >= students.size()) {
            throw new InvalidPositionException("Position out of range.");
        }
        return students.get(position);
    }

    public boolean deleteStudent(long prn) throws StudentNotFoundException {
        Student student = searchByPRN(prn);
        students.remove(student);
        System.out.println("Student removed successfully.");
        return true;
    }
}
