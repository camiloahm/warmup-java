package com.leet;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[] {9, 1, 9})));
    }

    public int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] + 1 < 10) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }

        int carry = 0;
        int addOne = 1;

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] + addOne + carry == 10) {
                digits[i] = 0;
                carry = 1;
                addOne = 0;

                if (i == 0) {
                    int[] temp = new int[digits.length + 1];
                    System.arraycopy(digits, 0, temp, 1, digits.length);
                    temp[0] = 1;
                    return temp;
                }
            } else {
                digits[i] = digits[i] + addOne + carry;
                carry = 0;
                addOne = 0;
            }

        }

        return digits;
    }

    public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] updated = new int[digits.length + 1];
        updated[0] = 1;
        return updated;
    }

}
