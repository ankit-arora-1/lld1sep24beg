package accessmodifier;

public class Client {
    public void doSomething() {
        Student student = new Student();

        student.name = "Deepank";
        // student.age = 20; -> Wont work as it is private
        student.batch = "sep24";
        student.phone = "1234";

    }
}
