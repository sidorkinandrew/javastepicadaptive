package com.stepik.adaptive.task01_040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_039 {
    public static void main(String[] args)  throws IOException, NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(reader.lines()
                    //.skip(1)
                    .limit(Integer.parseInt(reader.readLine().trim()))
                    .mapToInt(Integer::parseInt)
                    .filter(g->g%4==0)
                    .max()
                    .getAsInt());
        }
    }
}