package com.epam.training.student_veronika_tarasova.transpose_matrix.src.main.java.com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        //Put your code here
        int columns = matrix.length;
        int rows = matrix[1].length;
        int[][] changedMatrix = new int[rows][columns];

        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < columns; j++){
                changedMatrix[i][j] = matrix[j][i];

            }        }

        return changedMatrix;

    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
