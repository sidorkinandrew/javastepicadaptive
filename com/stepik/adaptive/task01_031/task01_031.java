package com.stepik.adaptive.task01_031;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_031 {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            double a = Double.parseDouble(reader.readLine().trim());
            double b = Double.parseDouble(reader.readLine().trim());
            double c = Double.parseDouble(reader.readLine().trim());
            double d = b*b-4*a*c;
            if (d==0.0){
                System.out.println(-b/2.0/a);
            }
            else if (d>0.0){
                double x1 = (-b+Math.sqrt(d))/2.0/a;
                double x2 = (-b-Math.sqrt(d))/2.0/a;
                System.out.println(x1<x2?x1+" "+x2:x2+" "+x1);
            }
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}