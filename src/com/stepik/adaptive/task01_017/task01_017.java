package com.stepik.adaptive.task01_017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_017 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(reader.readLine().trim());
            int m = Integer.parseInt(reader.readLine().trim());
            int x = Integer.parseInt(reader.readLine().trim());
            int y = Integer.parseInt(reader.readLine().trim());
            if (n>m) {n += (m - (m = n));}
            System.out.print(Math.min(Math.min(x,n-x),Math.min(y,m-y)));
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}