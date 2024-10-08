package generics;

public class Pair<T, S> {
    private T first;
    private S second;
    private String name;

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public String getName() {
        return name;
    }

    // Generics at method level
    // V is only accessible inside this method.
    // V does not make sense anywhere outside this method
    public static <V> V doSomething(V name) {
        System.out.println(name);
        return name;
    }
}
