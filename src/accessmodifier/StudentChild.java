package accessmodifier;

public class StudentChild extends Student {

    public void doSomething() {
        name = "Dheeraj";
        // age = 20; -> private so won't work
        batch = "spe24";
        phone = "1234";
    }
}
