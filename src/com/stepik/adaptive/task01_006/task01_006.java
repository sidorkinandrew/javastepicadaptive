package com.stepik.adaptive.task01_006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_006 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            long h1 = Long.parseLong(reader.readLine().trim())%86400*1000;
            System.out.println(h1);
//            System.out.format("%tT", h1);
            System.out.format("%tk:%tM:%tS", h1, h1, h1);
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            // never reached by conditions
            System.out.println("Error happened!");
        }
    }
}
