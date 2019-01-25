package com.stepik.adaptive.task01_012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_012 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
//            int aNumber = Integer.parseInt(reader.readLine().trim());
//            System.out.print(aNumber%10);
//            System.out.print(aNumber%100/10);
//            System.out.print(aNumber/100);
            String aString = reader.readLine().trim();
            System.out.print(new StringBuilder(aString).reverse());
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}