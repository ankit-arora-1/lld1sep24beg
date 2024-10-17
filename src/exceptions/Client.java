package exceptions;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Student student = new Student();
        // student.doSomething2();

        // System.out.println("Printing from main");
//        student.readFile("abc.txt");
//
//        System.out.println("Printing after exception from main");
//
//        try {
//            student.readFile2("abc.txt");
//        } catch (FileNotFoundException ex) {
//            System.out.println("Printing from main after filenotfoundex");
//        }
//
//        student.readFile2("abc.txt");
//
//        System.out.println("Print me");

//        try {
//            student.findStudentById(1);
//        } catch (StudentNotFoundException ex) {
//            System.out.println("Student not found" + ex.getMessage());
//        }


        student.test();

    }
}
