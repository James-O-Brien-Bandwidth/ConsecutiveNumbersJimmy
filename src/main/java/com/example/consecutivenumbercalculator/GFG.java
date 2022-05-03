package com.example.consecutivenumbercalculator;// Java program to find longest
// contiguous subsequence

import java.util.ArrayList;

class GFG {

    public static void main(String[] args) throws Exception {
        int[] orderedArrayFromDb = {1, 2, 3, 4, 9, 10, 20,
                22, 23, 24, 25, 26, 27, 28,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                100, 101, 102};

        int sizeRequestedByCustomer = 8;

        System.out.println(findLongestConsecutiveSubset(orderedArrayFromDb, sizeRequestedByCustomer));
    }

    static ArrayList<Integer> findLongestConsecutiveSubset(int[] queryReturnedFromArray, int sizeRequestedByCustomer) throws Exception {

        int consecutiveNumberSize = 0, count = 0;
        int recordSize = queryReturnedFromArray.length;

        for (int positionInArray = 0; positionInArray < recordSize; positionInArray++) {
            if (positionInArray > 0 && queryReturnedFromArray[positionInArray] == queryReturnedFromArray[positionInArray - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            consecutiveNumberSize = Math.max(consecutiveNumberSize, count);

            if (consecutiveNumberSize == sizeRequestedByCustomer) {
                ArrayList<Integer> consecutiveList = new ArrayList<>();
                for (int j = 1; j < sizeRequestedByCustomer + 1; j++) {
                    consecutiveList.add(queryReturnedFromArray[positionInArray - sizeRequestedByCustomer + j]);
                    System.out.println(queryReturnedFromArray[positionInArray - sizeRequestedByCustomer + j]);
                }
                return consecutiveList;
            }

        }
        //If no selection is available, return error
        throw new Exception();
    }

}


