package com.example.consecutivenumbercalculator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StackoverflowSolution1 {

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 9, 12, 15, 16, 17, 18, 20, 22, 23, 24, 27};
        Map<Integer, Integer> list = new HashMap<>();
        System.out.println(getConsecutive(array));
    }

    private static Map<Integer, Integer> getConsecutive(final int[] array) {
        final Map<Integer, Integer> list = new TreeMap<Integer, Integer>();
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] + 1 == array[i])
                endIndex = i;
            else {
                if (endIndex > startIndex)
                    list.put(startIndex, endIndex);
                startIndex = endIndex = i;
            }
        }
        if (endIndex > startIndex)
            list.put(startIndex, endIndex);
        return list;
    }
}
