package com.stepik.adaptive.task01_014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_014 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(reader.readLine().trim());
            int m = Integer.parseInt(reader.readLine().trim());
            int k = Integer.parseInt(reader.readLine().trim());
            System.out.print((k < n * m && ((k % n == 0) || (k % m == 0))) ? "YES" : "NO");
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}