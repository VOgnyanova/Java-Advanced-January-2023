package _02_02_MultidimensionalArraysExercises;

import java.util.Scanner;

public class _04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] size = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);
        int[][] table = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] dataColumn = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                table[row][col] = Integer.parseInt(dataColumn[col]);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = table[row][col] + table[row][col + 1] + table[row][col + 2]
                        + table[row + 1][col] + table[row + 1][col + 1] + table[row + 1][col + 2]
                        + table[row + 2][col] + table[row + 2][col + 1] + table[row + 2][col + 2];

                if (sum > maxSum) {
                    maxSum = sum;
                    startRow = row;
                    startCol = col;
                }
            }

        }
        System.out.println("Sum = " + maxSum);
        for (int row = startRow; row <= startRow + 2; row++) {
            for (int col = startCol; col <= startCol + 2; col++) {

                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }

    }
}
