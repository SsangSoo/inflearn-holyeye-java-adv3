package functional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class CompositionMain2 {
    public static void main(String[] args) {
        // 1. String -> Integer
        Function<String, Integer> parseInt = Integer::parseInt;

        // 2. Integer -> Integer (여기서는 제곱)
        Function<Integer, Integer> square = x -> x * x;

        // 3. Integer -> String

        Function<Integer, String> toString = x -> "결과: " + x;

        // Compose 혹은 andThen으로 합성하기
        // parseInt -> square -> toString 순서로 하고 싶다면 andThen()을 사용
        Function<String, String> finalFunc = parseInt
                .andThen(square)
                .andThen(toString);

        String result1 = finalFunc.apply("5");
        System.out.println("result2 = " + result1);

        String result2 = finalFunc.apply("10");
        System.out.println("result2 = " + result2);

        // 또 다른 조합으로 사용 가능
        Function<String, Integer> stringToSquareFunc = parseInt.andThen(square);
        Integer result3 = stringToSquareFunc.apply("5");
        System.out.println("result3 = " + result3);

    }
}
