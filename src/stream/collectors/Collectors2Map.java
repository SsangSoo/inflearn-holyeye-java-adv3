package stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {

    public static void main(String[] args) {
        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));
        System.out.println("map1 = " + map1);


        // 키 중복 예외: java.lang.IllegalStateException: Duplicate key
/*
        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length()
                ));
        System.out.println("map2 = " + map2);
*/


        // 키 중복 대안 (병합)
        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,   // keyMapper
                        name -> name.length(), // valueMapper
                        (oldVal, newVal) -> oldVal + newVal // 중복될 경우 기존 값 + 새 값
                ));
        System.out.println("map3 = " + map3);

        // Map의 타입 지정
        Map<String, Integer> map4 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,   // keyMapper
                        name -> name.length(), // valueMapper
                        (oldVal, newVal) -> oldVal + newVal, // 중복될 경우 기존 값 + 새 값
                        LinkedHashMap::new
                ));
        System.out.println("map4 = " + map4.getClass());

    }
}
