package com.stepik.adaptive.task01_039;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_039 {
    public static void main(String[] args)  throws IOException, NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(reader.lines()
                    //.limit(Integer.parseInt(reader.readLine().trim()))
                    .skip(1)
                    .mapToInt(Integer::parseInt)
                    .filter(g->g%6==0)
                    .sum());
        }
    }
}