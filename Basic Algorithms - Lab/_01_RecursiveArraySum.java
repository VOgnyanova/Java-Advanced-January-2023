package _09_BasicAlgorithmsLab;

import java.util.Arrays;
import java.util.Scanner;

public class _01_RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(n -> Integer.parseInt(n))
                .toArray();

        System.out.println(sum(input, 0));
    }

    private static int sum(int[] arr, int fromIndex) {
        if (fromIndex == arr.length - 1) {
            return arr[fromIndex];
        }

        return arr[fromIndex] + sum(arr, fromIndex + 1);
    }
}
