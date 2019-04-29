package com.leet;

public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(new DivideTwoIntegers().divide(-7, 3));
        System.out.println(new DivideTwoIntegers().divide(-1, 1));
        System.out.println(new DivideTwoIntegers().divide(0, 3));
        System.out.println(new DivideTwoIntegers().divide(-2147483648, -1));
    }

    public int divide(int dividend, int divisor) {

        boolean isNegative = false;
        long originalDividend = dividend;
        long originalDivisor = divisor;
        long tempDividend = dividend;
        long tempDivisor = divisor;
        boolean divisorOne = false;
        int result = 0;

        if (tempDividend == 0 || tempDivisor == 0) {
            return 0;
        }

        if (tempDividend < 0) {
            tempDividend *= -1;
            isNegative = true;
        }

        if (tempDivisor < 0) {
            tempDivisor *= -1;
            isNegative = true;
        }

        if (originalDividend < 0 && originalDivisor < 0) {
            isNegative = false;
        }

        if (tempDividend == tempDivisor) {
            if (isNegative) {
                return -1;
            } else {
                return 1;
            }
        }

        if (tempDivisor == 1) {
            if (isNegative && !(originalDividend < 0)) {
                return (int) (originalDividend * -1L);
            }

            if (!isNegative && !(originalDividend > 0)) {
                long r = originalDividend * -1L;
                if (r > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                return (int) (r);
            }

            return (int) originalDividend;
        }

        while (tempDividend - tempDivisor >= 0 && !divisorOne) {
            tempDividend -= tempDivisor;
            result++;
        }

        if (isNegative) {
            result *= -1;
        }

        return result;
    }

}
