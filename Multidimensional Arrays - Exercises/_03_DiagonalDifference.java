package _02_02_MultidimensionalArraysExercises;

import java.util.Scanner;

public class _03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            String[] rowInput = scanner.nextLine().split(" ");
            for (int cols = 0; cols < size; cols++) {
                matrix[row][cols] = Integer.parseInt(rowInput[cols]);
            }
        }
        int diagonal = 0;
        for (int index = 0; index < size; index++) {
            diagonal = diagonal + matrix[index][index];

        }
        int secondDiagonal = 0;
        for (int row = 0; row < size; row++) {
            secondDiagonal = secondDiagonal + matrix[row][size - row - 1];

        }
        System.out.println(Math.abs(diagonal - secondDiagonal));
    }
}

