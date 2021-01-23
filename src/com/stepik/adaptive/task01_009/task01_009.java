package com.stepik.adaptive.task01_009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_009 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int a3DigitNumber = Integer.parseInt(reader.readLine().trim());
            System.out.println(a3DigitNumber/100+a3DigitNumber%100/10+a3DigitNumber%10);
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}