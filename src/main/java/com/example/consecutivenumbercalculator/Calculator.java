package com.example.consecutivenumbercalculator;

import java.util.ArrayList;
import java.util.Iterator;

public class Calculator {

    public static void main(String[] args) {
        ArrayList<Integer> arraySample = new ArrayList<>();
        arraySample.add(1);
        arraySample.add(2);
        arraySample.add(3);
        arraySample.add(4);
        arraySample.add(9);
        arraySample.add(10);
        arraySample.add(20);
        arraySample.add(22);
        arraySample.add(23);
        arraySample.add(24);
        arraySample.add(25);
        arraySample.add(26);
        arraySample.add(27);
        arraySample.add(28);
        arraySample.add(39);
        arraySample.add(100);
        arraySample.add(101);
        arraySample.add(102);

        isConsecutive(arraySample);

        System.out.println("Jimmy output is: ");
    }

    public static boolean isConsecutive(ArrayList<Integer> list) {
        Iterator<Integer> it = list.iterator();
        if (!it.hasNext()) {
            return true;
        }

        int prev = it.next();
        while (it.hasNext()) {
            int curr = it.next();
            if (prev + 1 != curr /* mismatch */ || prev + 1 < prev /* overflow */) {
                return false;
            }
            prev = curr;
        }
        return true;
    }

}
