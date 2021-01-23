package com.stepik.adaptive.task01_002;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_002 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(reader.readLine());
            System.out.println(Integer.parseInt(reader.readLine()) % n);
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            // never reached by conditions
            System.out.println("Error happened!");
        }
    }
}


