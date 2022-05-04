package com.example.consecutivenumbercalculator;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.RepeatedTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static com.example.consecutivenumbercalculator.GFG.findLongestConsecutiveSubset;
import static com.example.consecutivenumbercalculator.GFG.findLongestConsecutiveSubset2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GFGTest {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @RepeatedTest(value = 300)
    void findLongestConsecutiveSubsetTest_8() throws Exception {
        int[] numberArray = readFromFile("src/main/resources/PhoneNumberList.json");

        int requestedSize = 8;

        LocalDateTime start = LocalDateTime.now();
        ArrayList<Integer> actualList = findLongestConsecutiveSubset(numberArray, requestedSize);
        LocalDateTime end = LocalDateTime.now();

        int timeTakenInMilliSecond = (end.getNano() - start.getNano()) / 1000000;

        System.out.println("Actual Time taken in milliseconds:" + timeTakenInMilliSecond);
        assertTrue(timeTakenInMilliSecond < 15);

        assertEquals(actualList.get(0), 944);
        assertEquals(actualList.get(1), 945);
        assertEquals(actualList.get(2), 946);
        assertEquals(actualList.get(3), 947);
        assertEquals(actualList.get(4), 948);
        assertEquals(actualList.get(5), 949);
        assertEquals(actualList.get(6), 950);
        assertEquals(actualList.get(7), 951);

        assertEquals(8, actualList.size());
    }

    @RepeatedTest(value = 300)
    void findLongestConsecutiveSubsetTest_6() throws Exception {
        int[] numberArray = readFromFile("src/main/resources/PhoneNumberList.json");

        int requestedSize = 6;

        LocalDateTime start = LocalDateTime.now();
        ArrayList<Integer> actualList = findLongestConsecutiveSubset(numberArray, requestedSize);
        LocalDateTime end = LocalDateTime.now();

        int timeTakenInMilliSecond = (end.getNano() - start.getNano()) / 1000000;

        System.out.println("Actual Time taken in milliseconds:" + timeTakenInMilliSecond);
        assertTrue(timeTakenInMilliSecond < 15);

        assertEquals(actualList.get(0), 555);
        assertEquals(actualList.get(1), 556);
        assertEquals(actualList.get(2), 557);
        assertEquals(actualList.get(3), 558);
        assertEquals(actualList.get(4), 559);
        assertEquals(actualList.get(5), 560);
        assertEquals(6, actualList.size());
    }

    @RepeatedTest(value = 300)
    void findLongestConsecutiveSubsetTest_4() throws Exception {
        int[] numberArray = readFromFile("src/main/resources/PhoneNumberList.json");

        int requestedSize = 4;

        LocalDateTime start = LocalDateTime.now();
        ArrayList<Integer> actualList = findLongestConsecutiveSubset(numberArray, requestedSize);
        LocalDateTime end = LocalDateTime.now();

        int timeTakenInMilliSecond = (end.getNano() - start.getNano()) / 1000000;

        System.out.println("Actual Time taken in milliseconds:" + timeTakenInMilliSecond);
        assertTrue(timeTakenInMilliSecond < 15);

        assertEquals(actualList.get(0), 300);
        assertEquals(actualList.get(1), 301);
        assertEquals(actualList.get(2), 302);
        assertEquals(actualList.get(3), 303);
        assertEquals(4, actualList.size());
    }

    @RepeatedTest(value = 300)
    void findLongestConsecutiveSubsetTest_whereConsecutiveSizeIsNotPresent_ThenReturnEmptyArray() throws Exception {
        int[] numberArray = readFromFile("src/main/resources/PhoneNumberList.json");

        int requestedSize = 30;

        LocalDateTime start = LocalDateTime.now();
        ArrayList<Integer> actualList = findLongestConsecutiveSubset(numberArray, requestedSize);
        LocalDateTime end = LocalDateTime.now();

        int timeTakenInMilliSecond = (end.getNano() - start.getNano()) / 1000000;

        System.out.println("Actual Time taken in milliseconds:" + timeTakenInMilliSecond);
        assertTrue(timeTakenInMilliSecond < 15);

        assertEquals(0, actualList.size());
    }

    @RepeatedTest(value = 300)
    void findLongestConsecutiveSubsetTest2_8() throws Exception {
        int[] numberArray = readFromFile("src/main/resources/PhoneNumberList.json");

        int requestedSize = 8;

        LocalDateTime start = LocalDateTime.now();
        ArrayList<Integer> actualList = findLongestConsecutiveSubset2(numberArray, requestedSize);
        LocalDateTime end = LocalDateTime.now();

        int timeTakenInMilliSecond = (end.getNano() - start.getNano()) / 1000000;

        System.out.println("Actual Time taken in milliseconds:" + timeTakenInMilliSecond);
        assertTrue(timeTakenInMilliSecond < 15);

        assertEquals(actualList.get(0), 944);
        assertEquals(actualList.get(1), 945);
        assertEquals(actualList.get(2), 946);
        assertEquals(actualList.get(3), 947);
        assertEquals(actualList.get(4), 948);
        assertEquals(actualList.get(5), 949);
        assertEquals(actualList.get(6), 950);
        assertEquals(actualList.get(7), 951);

        assertEquals(8, actualList.size());
    }

    public static int[] readFromFile(String filePath) throws IOException {
        String fileToJson = new String(Files.readAllBytes(Paths.get(filePath)));
        return objectMapper.readValue(fileToJson, int[].class);
    }

    @RepeatedTest(value = 300)
    void findLongestConsecutiveSubsetTest2_6() throws Exception {
        int[] numberArray = readFromFile("src/main/resources/PhoneNumberList.json");

        int requestedSize = 6;

        LocalDateTime start = LocalDateTime.now();
        ArrayList<Integer> actualList = findLongestConsecutiveSubset2(numberArray, requestedSize);
        LocalDateTime end = LocalDateTime.now();

        int timeTakenInMilliSecond = (end.getNano() - start.getNano()) / 1000000;

        System.out.println("Actual Time taken in milliseconds:" + timeTakenInMilliSecond);
        assertTrue(timeTakenInMilliSecond < 15);

        assertEquals(actualList.get(0), 555);
        assertEquals(actualList.get(1), 556);
        assertEquals(actualList.get(2), 557);
        assertEquals(actualList.get(3), 558);
        assertEquals(actualList.get(4), 559);
        assertEquals(actualList.get(5), 560);
        assertEquals(6, actualList.size());
    }

    @RepeatedTest(value = 300)
    void findLongestConsecutiveSubsetTest2_4() throws Exception {
        int[] numberArray = readFromFile("src/main/resources/PhoneNumberList.json");

        int requestedSize = 4;

        LocalDateTime start = LocalDateTime.now();
        ArrayList<Integer> actualList = findLongestConsecutiveSubset2(numberArray, requestedSize);
        LocalDateTime end = LocalDateTime.now();

        int timeTakenInMilliSecond = (end.getNano() - start.getNano()) / 1000000;

        System.out.println("Actual Time taken in milliseconds: " + timeTakenInMilliSecond);
        assertTrue(timeTakenInMilliSecond < 15);

        assertEquals(actualList.get(0), 300);
        assertEquals(actualList.get(1), 301);
        assertEquals(actualList.get(2), 302);
        assertEquals(actualList.get(3), 303);
        assertEquals(4, actualList.size());
    }

    @RepeatedTest(value = 300)
    void findLongestConsecutiveSubsetTest2_whereConsecutiveSizeIsNotPresent_ThenReturnEmptyArray() throws Exception {
        int[] numberArray = readFromFile("src/main/resources/PhoneNumberList.json");

        int requestedSize = 30;

        LocalDateTime start = LocalDateTime.now();
        ArrayList<Integer> actualList = findLongestConsecutiveSubset2(numberArray, requestedSize);
        LocalDateTime end = LocalDateTime.now();

        int timeTakenInMilliSecond = (end.getNano() - start.getNano()) / 1000000;

        System.out.println("Actual Time taken in milliseconds:" + timeTakenInMilliSecond);
        assertTrue(timeTakenInMilliSecond < 15);

        assertEquals(0, actualList.size());
    }

}