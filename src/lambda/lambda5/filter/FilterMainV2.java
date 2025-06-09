package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수만 거르기
        Predicate<Integer> evenPredicate = (n) -> n % 2 == 0;
        List<Integer> evenNumbers = filter(numbers, evenPredicate);
        System.out.println("evenNumbers = " + evenNumbers);

        // 홀수만 거르기
        Predicate<Integer> oddPredicate = (n) -> n % 2 == 1;
        List<Integer> oddNumbers = filter(numbers, oddPredicate);
        System.out.println("oddNumbers = " + oddNumbers);

    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        ArrayList<Integer> filtered = new ArrayList<>();
        for(Integer number : numbers) {
            boolean testResult = predicate.test(number);
            if(testResult) {
                filtered.add(number);
            }
        }
        return filtered;
    }

}
