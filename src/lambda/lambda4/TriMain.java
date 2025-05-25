package lambda.lambda4;

public class TriMain {

    @FunctionalInterface
    interface TriFunction<A, B, C, R> {
        R apply(A a, B b, C c);
    }

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> triFunction =
                (a, b, c) -> a + b + c;

        System.out.println(triFunction.apply(1, 2, 3));
    }
}
