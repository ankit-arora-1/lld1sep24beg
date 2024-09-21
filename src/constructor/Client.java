package constructor;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("praveen", 10);
        System.out.println(student.name);
        System.out.println(student.age);
    }
}
