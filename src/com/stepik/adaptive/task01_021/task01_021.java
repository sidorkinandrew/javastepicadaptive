package com.stepik.adaptive.task01_021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_021 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String mode = reader.readLine().trim();
            double PI = 3.14;
            switch(mode) {
                case "triangle":
                    double a = Double.parseDouble(reader.readLine().trim());
                    double b = Double.parseDouble(reader.readLine().trim());
                    double c = Double.parseDouble(reader.readLine().trim());
                    double p = (a+b+c)/2.0;
                    System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
                    break;
                case "rectangle":
                    double k = Double.parseDouble(reader.readLine().trim());
                    double m = Double.parseDouble(reader.readLine().trim());
                    System.out.println(k*m);
                    break;
                case "circle":
                    double r = Double.parseDouble(reader.readLine().trim());
                    System.out.println(PI*r*r);
                    break;
            }
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}