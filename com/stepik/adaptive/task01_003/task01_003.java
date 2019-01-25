package com.stepik.adaptive.task01_003;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_003 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int h = Integer.parseInt(reader.readLine());
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            System.out.println(((1 + (h - b - 1) / (a - b))));
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            // never reached by conditions
            System.out.println("Error happened!");
        }
    }
}