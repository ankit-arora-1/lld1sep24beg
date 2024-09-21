package accessmodifier;

public class Student {
    public String name;
    private int age;
    protected String batch;
    String phone; // default

    public void doSomething() {
        name = "Nimish";
        age = 20;
        batch = "Sep24";
        phone = "1234";
    }
}
