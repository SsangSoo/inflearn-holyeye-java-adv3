package functional;

import java.util.function.Function;

public class CompositionMain1 {

    public static void main(String[] args) {
        // 1. x를 입력받아 x * x 하는 함수
        Function<Integer, Integer> squre = x -> x * x;
        // 2. x를 입력받아 x + 1 하는 함수
        Function<Integer, Integer> add = x -> x + 1;

        // 함수 합성
        // 1. compos()를 사용한 새로운 함수 생성
        // 먼저 add 적용 후 square 적용하는 새로운 함수 newFunc1 생성
        // square(add(2)) -> square(3) -> 9
        Function<Integer, Integer> newFunc1 = squre.compose(add);
        System.out.println("newFunc1 결과: " + newFunc1.apply(2));

        // 2. andThen()을 사용한 새로운 함수 생성
        // 먼저 square 적용 후 add 적용하는 새로운 함수 newFunc2 생성
        // add(square(2)) -> add(4) -> 5
        Function<Integer, Integer> newFunc2 = squre.andThen(add);
        System.out.println("newFunc2 결과: " + newFunc2.apply(2));
    }
}
