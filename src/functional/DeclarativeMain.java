package functional;

import java.util.ArrayList;
import java.util.List;

// 짝수면 값을 제곱해라
public class DeclarativeMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 명령형: for문과 조건 검사로 처리
        List<Integer> result1 = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) { // 짝수인지 확인
                result1.add(number * number); // 제곱한 값을 추가
            }
        }
        System.out.println("Imperative Result: " + result1);


        // 선언형: 스트림 API처리
        List<Integer> result2 = numbers.stream()
                .filter(number -> number % 2 == 0) // 짝수 필터링
                .map(number -> number * number) // 제곱
                .toList();
        System.out.println("Declarative Result: " + result2);
    }
}
