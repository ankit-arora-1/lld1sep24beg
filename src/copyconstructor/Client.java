package copyconstructor;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Praveen";
        st1.age = 20;
        st1.batch = "Sep24";

        Student st2 = new Student(st1);

        System.out.println(st2.name);
        System.out.println(st2.age);
    }
}
