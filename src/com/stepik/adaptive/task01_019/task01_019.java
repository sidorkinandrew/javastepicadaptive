package com.stepik.adaptive.task01_019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_019 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int aNumber = Integer.parseInt(reader.readLine().trim()); // (−15,12]∪(14,17)∪[19,+∞)
            System.out.print((aNumber>-15&&aNumber<=12)||(aNumber>14&&aNumber<17)||(aNumber>=19)? "True":"False");
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}