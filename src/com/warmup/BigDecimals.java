package com.warmup;

import java.math.BigDecimal;

public class BigDecimals {

    public static void main(String[] args) {

        BigDecimal cent = new BigDecimal(100);
        BigDecimal balance = new BigDecimal(121312);
        BigDecimal total = balance.multiply(cent);
        int totalRounded = total.intValueExact();
        System.out.printf(totalRounded + "   " + total.toString());
    }
}
