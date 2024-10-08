package generics;

import java.util.List;

public class Test {
    public void doSomething(List<Animal> list) {
        System.out.println(list);
    }

    public <T extends Animal> void doSomething2(List<T> animals) {
        for(T a: animals) {
            System.out.println(a);
        }
        System.out.println(animals);
    }

    public void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    public void printAnimals2(List<?> animals) {
        System.out.println(animals);
    }
}
