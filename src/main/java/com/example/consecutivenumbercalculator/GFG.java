package com.example.consecutivenumbercalculator;// Java program to find longest
// contiguous subsequence

import java.util.ArrayList;

class GFG {

    public static void main(String[] args) throws Exception {
        int[] orderedArray = {1, 2, 3, 4, 9, 10, 20,
                22, 23, 24, 25, 26, 27, 28,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                100, 101, 102};

        int requestedSize = 8;

        System.out.println(findLongestConsecutiveSubset(orderedArray, requestedSize));
    }

    static ArrayList<Integer> findLongestConsecutiveSubset(int[] queryReturnedFromArray, int sizeRequestedByCustomer) throws Exception {

        int ans = 0, count = 0;

        for (int i = 0; i < queryReturnedFromArray.length; i++) {
            if (i > 0 && queryReturnedFromArray[i] == queryReturnedFromArray[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            ans = Math.max(ans, count);

            if (ans >= sizeRequestedByCustomer) {
                ArrayList<Integer> consecutiveList = new ArrayList<>();
                for (int j = 1; j < sizeRequestedByCustomer + 1; j++) {
                    consecutiveList.add(queryReturnedFromArray[i - sizeRequestedByCustomer + j]);
                    System.out.println(queryReturnedFromArray[i - sizeRequestedByCustomer + j]);
                }
                return consecutiveList;
            }

        }
        //If no selection is available
        throw new Exception();
    }

}


