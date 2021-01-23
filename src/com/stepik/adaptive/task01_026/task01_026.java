package com.stepik.adaptive.task01_026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_026 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String[] aLine = reader.readLine().trim().split(" ");
            int x1 = Integer.parseInt(aLine[0]);
            int y1 = Integer.parseInt(aLine[1]);
            int x2 = Integer.parseInt(aLine[2]);
            int y2 = Integer.parseInt(aLine[3]);
            System.out.println(((x1==x2)||(y1==y2)||(Math.abs(y2-y1)==Math.abs(x2-x1)))?"YES":"NO");
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}