package com.stepik.adaptive.task01_035;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class task01_035_stream {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            double a = Double.parseDouble(reader.readLine().trim());
            double b = Double.parseDouble(reader.readLine().trim());
            double c = Double.parseDouble(reader.readLine().trim());
            double d = Double.parseDouble(reader.readLine().trim());
            IntStream.rangeClosed(0, 1000).filter(x -> a*x*x*x + b*x*x + c*x + d == 0).forEach(System.out::println);
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}