package com.cci;


/**
 * Compress String
 * example "ccaaabb" -> "2c3a2b"
 */
public class Task_1_5 {


    public static void main(String args[]) {
        Task_1_5 task_1_5 = new Task_1_5();
        String input1 = "ccaaabb";
        System.out.println(task_1_5.compressString(input1));
    }


    public String compressString(String str) {

        char[] charArray = str.toCharArray();
        int[] count = new int[256];
        int length = 0;

        for (char c : charArray) {
            int pos = c;
            count[c]++;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < charArray.length; ) {
            int pos = charArray[i];
            stringBuilder.append(count[pos]);
            stringBuilder.append(Character.toChars(pos));
            i = i + count[pos];
        }

        return stringBuilder.toString();
    }


}
