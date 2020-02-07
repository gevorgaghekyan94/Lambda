package com.company;

public class Main {

    public static void main(String[] args) {

        int num = 15;
        MyTest inRange = () -> (num >= 10) && (num <= 20);
        System.out.println(inRange.testing());

        NumericFunc factorial1 = (a) -> {
            for (int i = a - 1; i > 0; i--) {
                a *= i;
            }
            return a;
        };
        System.out.println(factorial1.func(7));

        MyFunc<Integer> factorial2 = (b) -> {
            for (int i = b - 1; i > 0; i--) {
                b *= i;
            }
            return b;
        };
        System.out.println(factorial2.func(7));

        String testString = "This is testing string";
        String stringAfter;

        stringAfter = LambdaArgument.changeString((str) -> str.replace(" ", ""), testString);
        System.out.println(stringAfter);

    }
}
