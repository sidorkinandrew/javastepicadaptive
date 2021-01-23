package com.stepik.adaptive.task01_037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class task01_037_stream {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int a = Integer.parseInt(reader.readLine().trim());
            int b = Integer.parseInt(reader.readLine().trim());
            System.out.println(IntStream.rangeClosed(a, b).sum());
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}