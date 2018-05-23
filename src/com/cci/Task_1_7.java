package com.cci;


/*
 *If an element of the matrix is 0 the entire row and column should be set to 0
 */
public class Task_1_7 {

    public static void main(String[] args) {

        int[][] matrix =
                {{0, 2, 3}
                        , {8, 1, 4}
                        , {7, 6, 5}};

        Task_1_7 task_1_7 = new Task_1_7();
        printMatrix(task_1_7.setZeros(matrix));

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public int[][] setZeros(int[][] matrix) {

        boolean[] rows = new boolean[matrix.length];
        boolean[] colums = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    colums[j] = true;
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows[i] || colums[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

}
