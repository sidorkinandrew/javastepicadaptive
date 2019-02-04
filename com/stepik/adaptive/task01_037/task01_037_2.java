package com.stepik.adaptive.task01_037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_037_2 {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int a = Integer.parseInt(reader.readLine().trim());
            int b = Integer.parseInt(reader.readLine().trim());
            System.out.println((a+b)*(b-a+1)/2);
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}