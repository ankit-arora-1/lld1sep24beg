package polymorphism;

public class Mentor extends User {
    public void doSomething() {
        System.out.println("Calling doSomething from Mentor");
    }

    public void changeUsername() {
        System.out.println("Calling changeusername from Mentor");
    }
}
