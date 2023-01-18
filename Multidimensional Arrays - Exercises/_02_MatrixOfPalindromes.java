package _02_02_MultidimensionalArraysExercises;

import java.util.Scanner;

public class _02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] size = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        String[][] matrix = new String[rows][cols];

        char startLetter = 'a';
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols ; col++) {
                String palindrome = "" + startLetter + (char)(startLetter + col) + startLetter;
                matrix[row][col] = palindrome;
            }
            startLetter = (char)(startLetter + 1);
        }

            printMatrix(matrix,rows,cols);
        }

    public static void printMatrix(String [][] matrix,int rows,int cols){

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }

            System.out.println();
        }
    }
}