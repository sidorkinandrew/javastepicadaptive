package com.stepik.adaptive.task01_035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_035 {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            double a = Double.parseDouble(reader.readLine().trim());
            double b = Double.parseDouble(reader.readLine().trim());
            double c = Double.parseDouble(reader.readLine().trim());
            double d = Double.parseDouble(reader.readLine().trim());
            for (int i = 0; i < 1001 ; i++) {
                if (a*i*i*i+b*i*i+c*i+d==0){
                    System.out.println(i);
                }
            }
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}