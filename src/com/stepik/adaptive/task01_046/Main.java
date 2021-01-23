package com.stepik.adaptive.task01_046;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        IntStream.rangeClosed(1, (int) (Math.sqrt(n)))
                .map(g -> g * g)
                .forEach(System.out::println);
    }
}
