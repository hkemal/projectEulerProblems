package com.P4largestPalindromeProduct;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> palindrome = new ArrayList<>();

        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= i; j++) {
                int number = i * j;
                String numberString = String.valueOf(number);
                if (numberString.equals(reverseString(numberString))) {
                    palindrome.add(Integer.parseInt(numberString));
                }
            }
        }

        palindrome.sort(Comparator.reverseOrder());
        System.out.println(palindrome.get(0));
    }

    public static String reverseString(String givenString) {
        StringBuffer str = new StringBuffer(givenString);
        str.reverse();
        return str.toString();
    }
}
