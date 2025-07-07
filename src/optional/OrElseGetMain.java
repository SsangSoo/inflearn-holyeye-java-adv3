package optional;

import java.util.Optional;

public class OrElseGetMain {

    public static void main(String[] args) {
        Optional<Integer> optValue = Optional.of(100);
        Optional<Integer> optEmpty = Optional.empty();

        System.out.println("단순 계산");
        Integer i1 = optValue.orElse(10 + 20); // 10 + 20 계산 후 버림
        Integer i2 = optEmpty.orElse(10 + 20); // 10 + 20 계산 후 사용
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        // 값이 있으면 그 값, 없으면 지정된 기본값 아요
        System.out.println("=== orElse ===");
        System.out.println("값이 있는 경우");


    }
    static int createData() {
        System.out.println("데이터를 생성합니다...");
        Thread.sleep(3000);

    }
}