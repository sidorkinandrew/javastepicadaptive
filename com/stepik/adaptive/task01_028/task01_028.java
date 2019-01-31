package com.stepik.adaptive.task01_028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_028 {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String a = reader.readLine().trim();
            System.out.println(a.indexOf(".")<0?"0.0":"0"+a.substring(a.indexOf(".")));
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}