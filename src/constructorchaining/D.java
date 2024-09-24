package constructorchaining;

public class D extends C {
    public D() {
        // super(); // --> Has to be the first statement in the constructor
        System.out.println("Calling from D");
    }
}
