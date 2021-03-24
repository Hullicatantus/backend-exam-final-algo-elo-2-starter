package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        Integer oddSum = 0;
        for (Integer number : numbers) {
            if (!(number % 2 == 0)) {
                oddSum += number;
            }
        }
        return oddSum;
    }
}