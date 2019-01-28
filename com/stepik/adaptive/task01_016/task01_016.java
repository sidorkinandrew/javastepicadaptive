package com.stepik.adaptive.task01_016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_016 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            double firstNumber = Double.parseDouble(reader.readLine().trim());
            double secondNumber = Double.parseDouble(reader.readLine().trim());
            String operation = reader.readLine().trim();
            switch (operation){
                case "+":
                    System.out.println(firstNumber+secondNumber);
                    break;
                case "-":
                    System.out.println(firstNumber-secondNumber);
                    break;
                case "*":
                    System.out.println(firstNumber*secondNumber);
                    break;
                case "pow":
                    System.out.println(Math.pow(firstNumber,secondNumber));
                    break;
                case "div":
                    if (secondNumber==0.0) {
                        System.out.println("Division by 0!");
                    }
                    else{
                        System.out.println(Math.floorDiv((long)firstNumber , (long)secondNumber));
                    }
                    break;
                case "mod":
                    if (secondNumber==0.0) {
                        System.out.println("Division by 0!");
                    }
                    else{
                        System.out.println(Math.floorMod((long)firstNumber , (long)secondNumber));
                    }
                    break;
                case "/":
                    if (secondNumber==0.0) {
                        System.out.println("Division by 0!");
                    }
                    else{
                        System.out.println(firstNumber / secondNumber);
                    }
            }
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}

