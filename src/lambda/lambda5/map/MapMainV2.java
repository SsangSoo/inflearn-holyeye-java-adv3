package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        Function<String, Integer> toNumber = s -> Integer.valueOf(s);
        List<Integer> numbers = map(list, toNumber);
        System.out.println("numbers = " + numbers);

        // 문자열의 길이
        Function<String, Integer> toLength = s -> s.length();
        List<Integer> lengths = map(list, toLength);
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> numbers = new ArrayList<>();
        for(String s : list) {
            Integer value = mapper.apply(s);
            numbers.add(value);
        }
        return numbers;
    }
}
