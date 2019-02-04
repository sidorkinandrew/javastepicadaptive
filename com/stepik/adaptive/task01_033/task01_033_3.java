package com.stepik.adaptive.task01_033;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class task01_033_3 {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            float a = Float.parseFloat(reader.readLine().trim());
            float b = Float.parseFloat(reader.readLine().trim());
            System.out.println(IntStream.rangeClosed((int)a, (int)b).filter(value -> value % 3 == 0).average().getAsDouble());
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}