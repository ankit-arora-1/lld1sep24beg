package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;


///// Break for 5 minutes: 8:17 -> 8:22 AM

public class Student {
    public int doSomething() {
        int a = 1;
        int b = 0;

        return a / b;
    }

    public void doSomething2() {
        String s = getStringFromAPI();
        System.out.println(s.length());
    }

    public String getStringFromAPI() {
        return null;
    }

    public void readFile(String fileName) {
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);

            System.out.println("Printing after exception inside try");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found. Please check the filename");
        }

        System.out.println("Printing after exception from readFile");

    }

    public void readFile2(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
    }

    public void doSomething3() {
        try {
            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);
        } catch (Exception ex) {
            System.out.println("Prnting from doSomething3");
        }

    }

    /*
    * Java allows us to have multiple catch blocks.
    * if the exceptions are unrelated (they are not part of the same hierarchy)
    * then ordering in multiple catch blocks does not matter
    *
    * if they are related, the more specific exception class needs to come
    * first and then the more generic class
    * */
    public void doSomething4() {
        try {
            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);


            if(true) {
                throw new SQLException();
            }

            if(true) {
                throw new IOException();
            }
        } catch (SQLException ex) {
            System.out.println("Retry");
        } catch (FileNotFoundException ex) {
            System.out.println("Please try again by inputting correct filenam");
        } catch (IOException ex) {
            System.out.println("Something went wrong");
        } catch (Exception ex) {
            System.out.println("");
        }

        System.out.println("Executing  normally from now on");
    }

    /*
    * Good practice: Always catch specific exceptions
    * */
    public void doSomething5() {
        try {
            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);

            if(true) {
                throw new SQLException();
            }

            if(true) {
                throw new IOException();
            }
        } catch (Exception ex) {
            System.out.println("");
        }
    }

    public void doSomething6() {

        try {
            if(false) {
                throw new SQLException();
            }

            return;

        } catch (SQLException ex) {
            System.out.println("Exception thrown");
        } finally {
            // This block will get executed no matter what
            // Including if there is a return
            // Finally block is used to clean up resources
            // End the connection
            // Close the file, etc
            System.out.println("Printed no matter what");
        }

        // What is the difference between final, finally and finalize
        // final -> declare a variable as constant. Can also be attached at a class level
        // which means the class cannot be extended
        // finally -> block that is used with try-catch
        // finalize -> a method called right before an object is destroyed

    }

    public Student findStudentById(int id) throws StudentNotFoundException {
        if(true) {
            throw new StudentNotFoundException("Student with id not found");
        }

        return null;
    }

//    public Student findStudentById2(int id){
//        if(true) {
//            throw new StudentNotFoundException("Student with id not found");
//        }
//
//        return null;
//    }

    public void test() {
        test();
    }
}
