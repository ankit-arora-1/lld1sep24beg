package lambdas;

public class Client2 {
    public static void main(String[] args) {
//        MathOperation addOperation = new AddOperation();
//        doOperation(1, 2, addOperation);

        MathOperation addOperation = (a, b) -> {
            return a + b;
        };

        doOperation(1, 2, addOperation);

        doOperation(2, 3, (a, b) -> a - b);
    }

    public static void doOperation(int a, int b, MathOperation mathOperation) {
        System.out.println(mathOperation.calculate(a, b));
    }

    // Break for 5 minutes: 8:03 -> 8:08 AM
}
