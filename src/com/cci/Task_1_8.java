package com.cci;

public class Task_1_8 {

    public static void main(String args[]) {

        Task_1_8 task_1_8 = new Task_1_8();
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        String s3 = "waterbottle";
        String s4 = "ersottlewat";


        System.out.println(task_1_8.isRotation(s1, s2));
        System.out.println(task_1_8.isRotation(s3, s4));

    }

    public boolean isRotation(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        String s1s1 = s1 + s1;

        return s1s1.indexOf(s2) > 0;
    }

}
