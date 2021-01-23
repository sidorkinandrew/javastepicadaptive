package com.stepik.adaptive.task01_010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_010 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int aNumber = Integer.parseInt(reader.readLine().trim());
            System.out.println(aNumber%100/10);
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}