package com.cci;


import java.util.Arrays;

/**
 * Replace all the spaces in a String with %20
 */
public class Task_1_4 {

    public static void main(String[] args) {
        Task_1_4 task_1_4 = new Task_1_4();
        System.out.println(task_1_4.replaceSpaces("Camilo Andres Hernández Marin"));
    }

    public String replaceSpaces(String str) {

        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int spacesCount = 0;

        for (int i = 0; i < length; i++) {
            if (charArray[i] == ' ') {
                spacesCount++;
            }
        }

        int newLength = length + spacesCount * 2;
        char[] result = new char[newLength * 2];
        System.arraycopy(charArray, 0, result, 0, charArray.length);

        result[newLength] = '\0';

        for (int i = length - 1; i >= 0; i--) {
            if (result[i] == ' ') {
                result[newLength - 1] = '0';
                result[newLength - 2] = '2';
                result[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                result[newLength - 1] = charArray[i];
                newLength = newLength - 1;
            }

        }

        return new String(result, 0, result.length);

    }
}
