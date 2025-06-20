package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        // Collectors는 뒤에서 더 자세히(복잡한 수집이 필요할 때 사용)
        System.out.println("1. collect - List 수집");
        List<Integer> evenNumbers1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("짝수 리스트: " + evenNumbers1);
        System.out.println();

        System.out.println("2. toList() - (Java 16+)");
        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("짝수 리스트: " + evenNumbers2);
        System.out.println();

        System.out.println("3. toArray - 배열로 변환");
        Integer[] arr = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println("짝수 배열 : " + Arrays.toString(arr));
        System.out.println();

        System.out.println("4. forEach - 각 요소 처리");
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("5. count - 요소 개수");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("5보다 큰 숫자 개수: " + count);
        System.out.println("\n");

        System.out.println("6. reduce - 요소들의 합");
        System.out.println("초기값이 없는 reduce");
        Optional<Integer> sum1 = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("합계(초기값 없음): " + sum1.get());

        System.out.println("초기값이 있는 reduce");
        Integer sum2 = numbers.stream()
                .reduce(100, (a, b) -> a + b);
        System.out.println("합계(초기값100): " + sum2);


        System.out.println("7. min - 최솟값");
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("최솟값: " + min.get());
        System.out.println();

        System.out.println("8. max - 최댓값");
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("최댓값: " + max.get());
        System.out.println();


        System.out.println("9. findFirst - 첫 번째 요소");
        Integer first = numbers.stream()
                .filter(n -> n > 5)
                .findFirst().get();
        System.out.println("5보다 큰 첫 번째 숫자: " + first);
        System.out.println();

        System.out.println("10. findAny - 아무 요소나 하나 찾기");
        Integer any = numbers.stream()
                .filter(n -> n > 5)
                .findAny().get();
        System.out.println("5보다 큰 첫 번째 숫자: " + any);
        System.out.println();


        System.out.println("11. anyMatch - 조건을 만족하는 요소 존재 여부");
        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("짝수가 있나? " + hasEven);
        System.out.println();


        System.out.println("12. allMatch - 모든 요소가 조건을 만족하는지");
        boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("모든 숫자가 양수인가? " + allPositive);
        System.out.println();


        System.out.println("13. noneMatch - 조건을 만족하는 요소가 없는지");
        boolean noNegative = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("음수가 없나? " + noNegative);
        System.out.println();

    }
}
