package polymorphism;

public class Client {
    public static void main(String[] args) {
//        User user = new User();
//        user.changeUsername();

        Mentor mentor = new Mentor();
        mentor.changeUsername();

        User user2 = new Mentor();
        user2.changeUsername();

        Animal a = new Dog();
        a.eat();
    }
}
