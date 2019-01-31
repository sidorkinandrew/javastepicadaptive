package com.stepik.adaptive.task01_027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_027 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            double a = Double.parseDouble(reader.readLine().trim());
            double b = Double.parseDouble(reader.readLine().trim());
            double c = Double.parseDouble(reader.readLine().trim());
            double p = (a+b+c)/2.0;
            System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}