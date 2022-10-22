package Assignment8212022Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayPracticeTest {
    ArrayPractice arrayPractice;

    @BeforeEach
    public void setUp() {
        arrayPractice = new ArrayPractice();
    }

    @Test
    public void largestNumberInAnArrayTest() {
        int[] arr = {3, 7, 4, 1, 2};
        assertEquals(7, arrayPractice.largestNumberInAnArray(arr));
    }

    @Test
    public void reverseArrayTest() {
        int[] arr = {3, 7, 4, 1, 2};
        int[] arr2 = arrayPractice.reverseArray(arr);
        assertEquals(2, arr2[0]);
        assertEquals(1, arr2[1]);
        assertEquals(4, arr2[2]);
        assertEquals(7, arr2[3]);
        assertEquals(3, arr2[4]);
    }

    @Test
    public void checkElementInArrayTest() {
        int[] arr = {3, 7, 4, 1, 2};
        boolean result = arrayPractice.checkIfElementIsInArray(arr, 7);
        assertTrue(result);
    }

    @Test
    public void oddPositionElementTest() {
        int[] arr = {3, 7, 4, 1, 2};
        arrayPractice.getOddPositionElements(arr);
    }

    @Test
    public void evenPositionElementTest() {
        int[] arr = {3, 7, 4, 1, 2};
        arrayPractice.getEvenPositionElements(arr);
    }

    @Test
    public void runningTotalTest() {
        int[] arr = {3, 7, 4, 1, 2};
        arrayPractice.getRunningTotalOfAnArray(arr);
    }

    @Test
    public void stringIsPalindromeTest(){
        String name = "java";
        String word = "gogog";

        assertTrue(arrayPractice.isPalindrome(word));
        assertFalse(arrayPractice.isPalindrome(name));
    }
    @Test
    public void sumOfArrayItemWithForLoopTest() {
        int[] arr = {3, 7, 4, 1, 2};
        int sumOfArrayItems = arrayPractice.sumOfArrayItemsWithForLoop(arr);
        assertEquals(17, sumOfArrayItems);
    }

    @Test
    public void sumOfArrayItemWithWhileLoopTest() {
        int[] arr = {3, 7, 4, 1, 2};
        int sumOfArrayItems = arrayPractice.sumOfArrayItemsWithWhileLoop(arr);
        assertEquals(17, sumOfArrayItems);
    }

    @Test
    public void sumOfArrayItemWithDoWhileLoopTest() {
        int[] arr = {3, 7, 4, 1, 2};
        int sumOfArrayItems = arrayPractice.sumOfArrayItemsWithDoWhileLoop(arr);
        assertEquals(17, sumOfArrayItems);
    }

    @Test
    public void arrayConcatenationTest() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        assertArrayEquals(arr3, arrayPractice.arrayConcatenation(arr1, arr2));
    }
    @Test
    public void arrayAlternativeombinationTest(){
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr3 = arrayPractice.combineTwoArraysAlternatively(arr1, arr2);
        assertArrayEquals(arr3, arr4);
    }
    @Test
    public void listOfDigitsTest(){
        int number = 1234;
        int[] arr = {1, 2, 3, 4};
        assertArrayEquals(arr, arrayPractice.listOfDigits(number));
    }
}