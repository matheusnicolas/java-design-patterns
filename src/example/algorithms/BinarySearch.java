package example.algorithms;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = new int[1024];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int start = 0;
        int end = numbers.length - 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find: [0, 1, 16, 30, 56, 79, 89]");
        int target = Integer.parseInt(input.nextLine());
        binarySearch(numbers, start, end, target);
    }

    public static void binarySearch(int[] arr, int start, int end, int target) {
        int[] slicedArray = Arrays.copyOfRange(arr, start, end);
        System.out.println(Arrays.toString(slicedArray));
        if (start > end) return;
        int midIndex = (start + end) / 2;
        if (arr[midIndex] == target) {
            System.out.println("Value found on index: " + midIndex);
            return;
        }
        if (arr[midIndex] > target) binarySearch(arr, start, midIndex -1, target);
        else binarySearch(arr, midIndex +1, end, target);
    }

}
