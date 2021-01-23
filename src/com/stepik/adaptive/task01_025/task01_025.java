package com.stepik.adaptive.task01_025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_025 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            double aNumber = Double.parseDouble(reader.readLine().trim());
            System.out.println(aNumber>0?"YES":"NO");
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}