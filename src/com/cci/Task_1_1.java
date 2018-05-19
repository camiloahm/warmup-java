package com.cci;

public class Task_1_1 {


    public static void main(String[] args) {

        String input = "Camilo";
        Task_1_1 task_1_1 = new Task_1_1();
        System.out.println(task_1_1.allUniqueChars(input));
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