package com.stepik.adaptive.task01_013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class task01_013 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int a = Integer.parseInt(reader.readLine().trim());
            int b = Integer.parseInt(reader.readLine().trim());
            BigDecimal bigA = new BigDecimal(a);
            System.out.print(bigA.pow(b));
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}