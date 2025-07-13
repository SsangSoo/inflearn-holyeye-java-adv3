package functional;

import java.util.function.Function;

public class PureFuctionMain1 {
    public static void main(String[] args) {
        Function<Integer, Integer> func = x -> x * 2;
        System.out.println("result1 = " + func.apply(10));
        System.out.println("result2 = " + func.apply(10));
    }
}
