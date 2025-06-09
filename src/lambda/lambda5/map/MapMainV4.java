package lambda.lambda5.map;

import java.util.List;

public class MapMainV4 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> numbers = StringToIntegerMapper.map(list, s1 -> Integer.valueOf(s1));
        System.out.println("numbers = " + numbers);

        // 문자열의 길이
        List<Integer> lengths = StringToIntegerMapper.map(list, s -> s.length());
        System.out.println("lengths = " + lengths);
    }

}
