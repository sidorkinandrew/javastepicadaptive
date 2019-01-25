package com.stepik.adaptive.task01_008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_008 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println((Integer.parseInt(reader.readLine().trim())+2)/2*2);
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}