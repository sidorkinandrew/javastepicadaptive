package com.stepik.adaptive.task01_020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_020 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int a = Integer.parseInt(reader.readLine().trim());
            int b = Integer.parseInt(reader.readLine().trim());
            int h = Integer.parseInt(reader.readLine().trim());
            System.out.print(h>=a&&h<=b? "Normal":h<a?"Deficiency":"Excess");
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}