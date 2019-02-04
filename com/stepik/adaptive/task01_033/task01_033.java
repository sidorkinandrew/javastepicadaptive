package com.stepik.adaptive.task01_033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_033 {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            double a = Double.parseDouble(reader.readLine().trim());
            double b = Double.parseDouble(reader.readLine().trim());
            double sum=0, count=0;
            for (long i = (long)a; i <= (long)b; i++) {
                if (i%3==0) {
                    sum+=i;
                    count+=1;
                }
            }
            System.out.println(sum/count); //NaN
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}