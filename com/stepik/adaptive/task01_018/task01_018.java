package com.stepik.adaptive.task01_018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_018 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int a = Integer.parseInt(reader.readLine().trim());
            int b = Integer.parseInt(reader.readLine().trim());
            int c = Integer.parseInt(reader.readLine().trim());
            System.out.print((a+b>c)&&(a+c>b)&&(b+c>a)? "YES":"NO");
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}