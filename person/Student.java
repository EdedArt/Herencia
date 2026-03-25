package person;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void display() {
        System.out.println("Student -> Name: " + name + ", Age: " + age + ", Student ID: " + studentId);
    }
}
