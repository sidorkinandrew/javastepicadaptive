package com.stepik.adaptive.task01_041;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_041 {
    public static void main(String[] args)  throws IOException, NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(reader.lines()
                    //.skip(1)
                    .limit(Integer.parseInt(reader.readLine().trim()))
                    .filter(g->g.endsWith("4"))
                    .mapToInt(Integer::parseInt)
                    .sum());
        }
    }
}