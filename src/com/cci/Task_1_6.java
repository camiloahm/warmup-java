package com.cci;

/**
 * Rotate matrix 90 degrees
 */
public class Task_1_6 {

    public static void main(String[] args) {

        String[][] matrix =
                {{"1", "2", "3"}
                        , {"8", "0", "4"}
                        , {"7", "6", "5"}};

        Task_1_6 task_1_6 = new Task_1_6();
        printMatrix(task_1_6.rotate(matrix, 3));

    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public String[][] rotate(String[][] matrix, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            }
        }


        return matrix;

    }

}
