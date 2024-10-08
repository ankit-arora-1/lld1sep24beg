package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>();
        Pair<String, String> p2 = new Pair<>();

        p.setFirst("abc");
        p.setSecond(123);

        // Integer i = p.getFirst();
        String s = p.getFirst();
        // p.second = "abc"; -> compile time check

        // You cannot use primitive type inside your generics
        // You can only use objects
        // Pair<String, int> p = new Pair<String, int>();

        List<Integer> list = new ArrayList<>();

        Pair.<String>doSomething("123");
        String s1 = Pair.doSomething("abc");
        // String i2 = Pair.doSomething(1);


        //---------------
        ShapeCommand<Shape> shapeCommand = new ShapeCommand<>();
        ShapeCommand<Circle> shapeCommand2 = new ShapeCommand<>();
        ShapeCommand<Sqaure> shapeCommand3 = new ShapeCommand<>();

        ShapeCommand.printShapeName2(new Sqaure());
        // ShapeCommand.printShapeName2(new String()); --> Won't work because it is bounded to shape

        // ----------------------
        Test test = new Test();
        List<Animal> animalList = new ArrayList<>();
        test.doSomething(animalList);

        List<Dog> dogList = new ArrayList<>();
        // test.doSomething(dogList); --> Not allowed

        test.doSomething2(dogList);

        List<Cat> catList = new ArrayList<>();
        test.doSomething2(catList);

        test.printAnimals(animalList);
        test.printAnimals(dogList);
        test.printAnimals(catList);

        List<String> stringList = new ArrayList<>();
        // test.printAnimals(stringList); --> Not going to work

        // -------------
         List list2 = new ArrayList();
         Pair p3 = new Pair();

    }
}
