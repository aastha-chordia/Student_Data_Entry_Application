// Student.java
public class Student {
    private String name;
    private int age;
    private String prn;

    public Student(String name, int age, String prn) {
        this.name = name;
        this.age = age;
        this.prn = prn;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public String getPrn() { return prn; }
    public void setPrn(String prn) { this.prn = prn; }
    
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", PRN: " + prn;
    }
}
