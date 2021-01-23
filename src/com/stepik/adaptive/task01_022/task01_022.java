package com.stepik.adaptive.task01_022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_022 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String mode = reader.readLine().trim();
            switch(mode) {
                case "1":
                    mode = "You have chosen a square";
                    break;
                case "2":
                    mode = "You have chosen a circle";
                    break;
                case "3":
                    mode = "You have chosen a triangle";
                    break;
                case "4":
                    mode = "You have chosen a rhombus";
                    break;
                default:
                    mode = "There is no such shape!";
            }
            System.out.println(mode);
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}