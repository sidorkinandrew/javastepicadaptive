package com.stepik.adaptive.task01_004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_004 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int v = Integer.parseInt(reader.readLine());
            int t = Integer.parseInt(reader.readLine());
            int d = -(v * t) % 109;
            System.out.println((109-d)%109);
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            // never reached by conditions
            System.out.println("Error happened!");
        }
    }
}