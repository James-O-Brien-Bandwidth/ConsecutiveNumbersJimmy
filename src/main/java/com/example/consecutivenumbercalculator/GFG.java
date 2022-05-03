package com.example.consecutivenumbercalculator;// Java program to find longest
// contiguous subsequence

import java.util.ArrayList;

class GFG {

    static ArrayList<Integer> findLongestConseqSubseq(int[] arr,
                                                      int n) {

        int ans = 0, count = 0;
        int requestedSize = 8;

        ArrayList<Integer> v = new ArrayList<>();

        // Insert repeated elements
        // only once in the vector
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1])
                v.add(arr[i]);
        }

        // Find the maximum length
        // by traversing the array
        for (int i = 0; i < v.size(); i++) {

            // Check if the current element is
            // equal to previous element +1
            if (i > 0 && v.get(i) == v.get(i - 1) + 1) {
                count++;
            } else {
                count = 1;
            }

            // Update the maximum
            ans = Math.max(ans, count);

            if (ans >= requestedSize) {
                ArrayList<Integer> consecutiveList = new ArrayList<>();
                for (int j = 1; j < requestedSize + 1; j++) {
                    consecutiveList.add(v.get(i - requestedSize + j));
//                    System.out.println(v.get(i - requestedSize + j));
                }
                return consecutiveList;
            }

        }
        return new ArrayList<>();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 9, 10, 20,
                22, 23, 24, 25, 26, 27, 28,
                39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                100, 101, 102};
        int n = arr.length;

        System.out.println(findLongestConseqSubseq(arr, n));
    }
}


