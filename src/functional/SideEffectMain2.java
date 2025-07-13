package functional;

import java.util.function.Function;

public class SideEffectMain2 {

    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> {
            int result = x * 2;
            // 부수 효과(Side Effet)
            System.out.println("x = " + x + ", result = " + (x * 2));
            return result;
        };

        func.apply(10);
        func.apply(10);
    }
}
