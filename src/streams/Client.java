package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        /*
        * 1. Intermediate methods: These do not end the stream. You can chain these methods
        * 2. Terminal methods: These end the stream. You cannot chain these methods
        * */

        example10();
    }

    // Print the list of integers using streams
    public static void example1() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

//        for(int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        list
                .stream()
                .forEach((ele) -> {
                    System.out.println(ele);
                });
    }

    // Print square of numbers
    public static void example2() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        list
                .stream()
                .forEach((ele) -> {
                    System.out.println(ele * ele);
                });
    }

    // Print square of numbers but do not do the squaring logic inside
    // for each. Only use for each for printing
    public static void example3() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        list
                .stream()
                .map((ele) -> {
                    return ele * ele;
                })
                .forEach((ele) -> {
                    System.out.println(ele);
                });
    }

    // Print the square of only even numbers in a list.
    // Ignore odd numbers
    public static void example4() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        list
                .stream()
                .filter((ele) -> {
                    if(ele % 2 == 0) {
                        return true;
                    }

                    return false;
                })
                .map(ele -> ele * ele)
                .forEach((ele) -> {
                    System.out.println(ele);
                });

    }

    public static void example5() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        Stream<Integer> stream = list.stream();

        stream
                .filter((ele) -> {
                    if(ele % 2 == 0) {
                        return true;
                    }

                    return false;
                })
                .map(ele -> ele * ele)
                .forEach((ele) -> {
                    System.out.println(ele);
                });

        // When we call a terminal method, the stream ends.
        // Meaning, we cannot do any further operation on the stream
        // (Unless we create a new stream)

//        stream.forEach((ele) -> {
//            System.out.println(ele);
//        });

        // Stream does not affect the original data
        System.out.println(list);
    }

    // Find the sum of all the integers in the list
    public static void example6() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        int sum = 0;
        list
                .stream()
                .forEach((ele) -> {
                    // Cannot modify variables from outside,
                    // inside lambda expressions
                    // sum = sum + ele;

                });

        System.out.println(sum);

    }

    // Find the sum of all the integers in the list
    public static void example7() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        Integer finalSum = list
                .stream()
                .reduce(0, (sum, ele) -> {
                    return sum + ele;
                }); // Takes in a bunch of data and reduces them to a single data

        System.out.println(finalSum);

    }

    public static void example8() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        List<Integer> sortedList = list
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }

    public static void example9() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        // Lazy evaluation
        Optional<Integer> optionalInteger = list
                .stream()
                .map((ele) -> {
                    System.out.println(ele);
                    return ele * ele;
                })
                .findFirst();

        System.out.println(optionalInteger.get());
    }

    public static void example10() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(4);

        list.parallelStream().forEach((ele) -> {
            System.out.println(ele + " thread name = "
                    + Thread.currentThread().getName());
        });
    }
}
