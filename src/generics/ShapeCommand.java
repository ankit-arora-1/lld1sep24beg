package generics;

public class ShapeCommand<T extends Shape> { // -> Can pass shape or child
                                            // children of shape
    public void printShapeName(T shape) {
        System.out.println(shape.shapeName);
    }

    public static <V extends Shape> void printShapeName2(V shape) {
        System.out.println(shape);
    }
}
