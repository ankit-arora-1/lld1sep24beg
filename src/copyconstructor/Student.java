package copyconstructor;

public class Student {
    public String name;
    public int age;
    public String batch;

    public Student() {

    }

    // Copy constructor
    public Student(Student student) {
        name = student.name;
        age = student.age;
        batch = student.batch;
    }
}
