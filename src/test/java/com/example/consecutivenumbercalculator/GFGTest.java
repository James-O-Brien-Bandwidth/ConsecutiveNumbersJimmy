package com.example.consecutivenumbercalculator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.example.consecutivenumbercalculator.GFG.findLongestConsecutiveSubset;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GFGTest {

    @Test
    void findLongestConsecutiveSubsetTest_8() throws Exception {
        int[] arr = {1, 2, 3, 4, 9, 10, 20,
                22, 23, 24, 25, 26, 27, 28,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53,
                100, 101, 102};
        int n = arr.length;

        int requestedSize = 8;

        ArrayList<Integer> actualList = findLongestConsecutiveSubset(arr, requestedSize);

        assertEquals(actualList.get(0), 39);
        assertEquals(actualList.get(1), 40);
        assertEquals(actualList.get(2), 41);
        assertEquals(actualList.get(3), 42);
        assertEquals(actualList.get(4), 43);
        assertEquals(actualList.get(5), 44);
        assertEquals(actualList.get(6), 45);
        assertEquals(actualList.get(7), 46);

        assertEquals(8, actualList.size());
    }

    @Test
    void findLongestConsecutiveSubsetTest_6() throws Exception {
        int[] arr = {1, 2, 3, 4, 9, 10, 20,
                22, 23, 24, 25, 26, 27, 28,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                100, 101, 102};
        int n = arr.length;

        int requestedSize = 6;

        ArrayList<Integer> actualList = findLongestConsecutiveSubset(arr, requestedSize);

        assertEquals(actualList.get(0), 22);
        assertEquals(actualList.get(1), 23);
        assertEquals(actualList.get(2), 24);
        assertEquals(actualList.get(3), 25);
        assertEquals(actualList.get(4), 26);
        assertEquals(actualList.get(5), 27);
        assertEquals(6, actualList.size());
    }

    @Test
    void findLongestConsecutiveSubsetTest_4() throws Exception {
        int[] arr = {1, 2, 3, 4, 9, 10, 20,
                22, 23, 24, 25, 26, 27, 28,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                100, 101, 102};
        int n = arr.length;

        int requestedSize = 4;

        ArrayList<Integer> actualList = findLongestConsecutiveSubset(arr, requestedSize);

        assertEquals(actualList.get(0), 1);
        assertEquals(actualList.get(1), 2);
        assertEquals(actualList.get(2), 3);
        assertEquals(actualList.get(3), 4);
        assertEquals(4, actualList.size());
    }

    @Test
    void findLongestConsecutiveSubsetTest_invalidAmount() throws Exception {
        int[] arr = {1, 2, 3, 4, 9, 10, 20,
                22, 23, 24, 25, 26, 27, 28,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                100, 101, 102};
        int n = arr.length;

        int requestedSize = 15;

        ArrayList<Integer> actualList = findLongestConsecutiveSubset(arr, requestedSize);

        assertEquals(15, actualList.size());
    }

}