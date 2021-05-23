package com.P3largestPrimeFactor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Long> primeNumbers = new ArrayList<>();
        primeNumbers.add(2L);
        primeNumbers.add(3L);
        List<Long> primeFactorNumber = new ArrayList<>();
        Long number = 600851475143L;
        Long sqrtNumber = Math.round(Math.sqrt(number));
        for (int i = 3; i <= sqrtNumber + 1; i = i + 2) {
            if (isPrime(i)) {
                primeNumbers.add(Long.valueOf(i));
            }
        }
        for (Long item : primeNumbers) {
            if (number % item == 0) {
                primeFactorNumber.add(item);
            }
        }
        for (Long item : primeFactorNumber) {
            System.out.println(item);
        }
        System.out.println(primeFactorNumber);
    }
    public static boolean isPrime(int n) {
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
