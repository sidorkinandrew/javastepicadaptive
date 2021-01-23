package com.stepik.adaptive.task01_032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_032 {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            double a = Double.parseDouble(reader.readLine().trim());
            double b = Double.parseDouble(reader.readLine().trim());
            System.out.println(a/b);
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}