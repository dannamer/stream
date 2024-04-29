package org.example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean XO(String str) {

        long countX = str.chars()
                .filter(c -> c == 'x' || c == 'X')
                .count();

        long countO = str.chars()
                .filter(c -> c == 'o' || c == 'O')
                .count();

        return countX == countO;
    }

    public static long squareDigitsConcatenate(long number) {
        return Long.parseLong(
                String.valueOf(number)
                .chars()
                .map(num -> Character.getNumericValue(num))
                .map(num -> num * num)
                .mapToObj(num -> String.valueOf(num))
                .collect(Collectors.joining())
        );
    }


}
