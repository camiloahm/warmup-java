package com.uva;

import java.util.Scanner;

public class Uva_000272 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean open = true;

        while (in.hasNext()) {
            String line = in.nextLine();
            char chars[] = line.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                // EOF Character
                if (line.charAt(i) == '\u001a') {
                    break;
                }
                if (chars[i] == '\"') {
                    if (open) {
                        System.out.print("``");
                        open = false;
                        continue;
                    } else {
                        System.out.print("''");
                        open = true;
                        continue;
                    }
                }
                System.out.print(chars[i]);
            }
            System.out.print("\n");
        }

    }

}
