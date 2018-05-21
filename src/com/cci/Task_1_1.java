package com.cci;


/**
 * Verify all unique characters
 * <p>
 * Example "characters" will return false,"camilo" will return true
 */
public class Task_1_1 {


    public static void main(String[] args) {

        String input1 = "Camilo";
        String input2 = "characters";
        Task_1_1 task_1_1 = new Task_1_1();
        System.out.println(task_1_1.allUniqueChars(input1));
        System.out.println(task_1_1.allUniqueChars(input2));
    }

    public boolean allUniqueChars(String input) {

        if (input.length() > 256) {
            return false;
        }
        boolean[] array = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            int charVal = input.charAt(i);
            if (array[charVal]) {
                return false;
            }
            array[charVal] = true;
        }

        return true;
    }
}