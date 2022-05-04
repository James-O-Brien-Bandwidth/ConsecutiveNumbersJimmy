package com.example.consecutivenumbercalculator;// Java program to find longest
// contiguous subsequence

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Set;

class GFG {

    public static void main(String[] args) throws Exception {
        int[] orderedArrayFromDb = {1, 2, 3, 4, 9, 10, 20,
                22, 23, 24, 25, 26, 27, 28,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                100, 101, 102};

        int sizeRequestedByCustomer = 8;

        LocalDateTime start = LocalDateTime.now();
        System.out.println(findLongestConsecutiveSubset(orderedArrayFromDb, sizeRequestedByCustomer));
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Time taken: " + (end.getNano() - start.getNano()));

        LocalDateTime start2 = LocalDateTime.now();
        System.out.println(findLongestConsecutiveSubset2(orderedArrayFromDb, sizeRequestedByCustomer));
        LocalDateTime end2 = LocalDateTime.now();
        System.out.println("Time taken: " + (end2.getNano() - start2.getNano()));
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
        //If no selection is available, return empty list
        return new ArrayList<>();
    }

    static ArrayList<Integer> findLongestConsecutiveSubset2(int[] queryReturnedFromArray, int sizeRequestedByCustomer) throws Exception {

        int recordSize = queryReturnedFromArray.length;

        ArrayList<Integer> consecutiveList = new ArrayList<>();
        consecutiveList.add(queryReturnedFromArray[0]);
        for (int positionInArray = 1; positionInArray < recordSize; positionInArray++) {
            if (queryReturnedFromArray[positionInArray] == queryReturnedFromArray[positionInArray - 1] + 1) {
                consecutiveList.add(queryReturnedFromArray[positionInArray]);
            } else {
                consecutiveList.clear();
                consecutiveList.add(queryReturnedFromArray[positionInArray]);
            }

            if (consecutiveList.size() == sizeRequestedByCustomer) {
                return consecutiveList;
            }
        }
        return new ArrayList<>();
    }

    private static int[] getRandomSortedArray(int size) {
        Set<Integer> randomArray = new java.util.HashSet<>();
        for (int i = 0; i < size; i++) {
            randomArray.add((int) (Math.random() * size));
        }
        return randomArray.stream().sorted().mapToInt(i -> i).toArray();
    }

    private static int[] getSortedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
}


