package com.stepik.adaptive.task01_015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_015 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int aYear = Integer.parseInt(reader.readLine().trim());
            System.out.print(((aYear % 4 == 0) && (aYear % 100 != 0) || (aYear % 400 == 0)) ? "Leap" : "Regular");
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}