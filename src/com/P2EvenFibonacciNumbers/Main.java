package com.P2EvenFibonacciNumbers;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Long> fibonacciNumber = new ArrayList<>();

        Long firstNumber = 1L;
        Long secondNumber = 2L;
        fibonacciNumber.add(firstNumber);
        fibonacciNumber.add(secondNumber);

        Long total = 0L;
        for (; ; ) {
            secondNumber = secondNumber + firstNumber;
            if (secondNumber >= 4000000L) {
                break;
            }
            if (secondNumber % 2 == 0) {
                total += secondNumber;
            }
            fibonacciNumber.add(secondNumber);
            firstNumber = secondNumber - firstNumber;
        }
        System.out.println(total);
    }
}
