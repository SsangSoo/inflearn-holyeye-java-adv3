package lambda.lambda4;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Function<String, Integer> function1 = new Function<>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Function<String, Integer> function2 = s -> s.length();

        System.out.println("function1 = " + function1.apply("hello"));
        System.out.println("function2 = " + function2.apply("hello"));

    }
}
