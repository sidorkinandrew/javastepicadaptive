package com.stepik.adaptive.task01_022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_022_2 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String[] a = {"square", "circle", "triangle", "rhombus"};
            System.out.println("You have chosen a " + a[Integer.parseInt(reader.readLine().trim()) - 1]);
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("There is no such shape!");
        }
    }
}