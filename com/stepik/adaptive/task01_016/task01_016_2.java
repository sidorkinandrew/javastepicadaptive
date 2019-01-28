package com.stepik.adaptive.task01_016;

import java.util.Scanner;

class task01_016_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double firstNumber = reader.nextDouble();
        double secondNumber = reader.nextDouble();
        String operator = reader.next();
        reader.close();
        try {
            double result = 0.0f;
            switch (operator) { // +, -, /, *, mod, pow, div
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if (secondNumber==0) throw new ArithmeticException();
                    result = firstNumber / secondNumber;
                    break;
                case "mod":
                    if (secondNumber==0) throw new ArithmeticException();
                    result = Math.floorMod ((long) firstNumber, (long) secondNumber);
                    break;
                case "pow":
                    result = Math.pow(firstNumber, secondNumber);
                    break;
                case "div":
                    if (secondNumber==0) throw new ArithmeticException();
                    result = Math.floorDiv ((long) firstNumber, (long) secondNumber);
                    break;
                default:
                    break;
            }
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("Division by 0!");
        }
    }
}