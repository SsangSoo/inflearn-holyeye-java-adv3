package lambda.ex1;

import lambda.MyFunction;
import lambda.Procedure;

import java.util.Arrays;

public class M5Return {

    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add(1, 2) = " + add.apply(1,2));

        MyFunction sub = getOperation("sub");
        System.out.println("sub(1, 2) = " + sub.apply(1,2));

        MyFunction xxx = getOperation("xxx");
        System.out.println("xxx(1, 2) = " + xxx.apply(1,2));
    }

    static MyFunction getOperation(String operator) {
        switch (operator) {
            case "add":
                return (a, b) -> a + b;
            case "sub":
                return (a, b) -> a - b;
            default:
                return (a, b) -> 0; // 잘못된 연산자일 경우 0 반환
        }
    }

}
