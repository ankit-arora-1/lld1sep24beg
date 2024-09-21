package accessmodifiertest;

import accessmodifier.Student;

public class Client2 {
    public void doSomething() {
        Student student = new Student();
        student.name = "Ajay";
        // student.age = 20; ->Wont work because private
        // student.batch = "sep24"; -> Wont work
        // student.phone = "1234"; -> Wont work
    }
}
