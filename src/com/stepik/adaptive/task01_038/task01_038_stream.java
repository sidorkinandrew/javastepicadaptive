package com.stepik.adaptive.task01_038;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

class task01_038_stream {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int[] hist = new int[4];
            reader.lines()
                    .limit(Integer.parseInt(reader.readLine().trim()))
                    .mapToInt(Integer::parseInt)
                    .forEach(g -> hist[g - 2]++);

            System.out.println(Arrays.stream(hist)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" ")));
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}
