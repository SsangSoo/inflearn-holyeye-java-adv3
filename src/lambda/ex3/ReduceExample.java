package lambda.ex3;

import lambda.ex2.MyReducer;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

public class ReduceExample {
    // 함수를 인자로 받아, 리스트 요소를 하나로 축약(reduce)하는 고차 함수
    public static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> reducer) {
        int result = initial;
        for (Integer integer : list) {
            result = reducer.apply(result, integer);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);

        // 1. 합 구하기 (초깃값 0, 덧셈 로직)
        int sum = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("합(누적 +): " + sum);

        // 2. 곱 구하기 (초깃값 1, 곱셈 로직)
        int product = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("곱(누적 *): " + product);
    }
}
