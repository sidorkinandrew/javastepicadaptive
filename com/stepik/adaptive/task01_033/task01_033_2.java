package com.stepik.adaptive.task01_033;

import java.util.Scanner;
import java.util.stream.IntStream;

class Task01_033_class_stream{

    private int a;
    private int b;

    public static void main(String[] args) {
        Task01_033_class_stream app = new Task01_033_class_stream();
        app.run();
    }

    private void run() {
        readInput();
        System.out.println(calculateAverage());
    }

    private void readInput() {
        try (Scanner in = new Scanner(System.in)) {
            this.a = in.nextInt();
            this.b = in.nextInt();
        }
    }

    private double calculateAverage() {
        return IntStream.rangeClosed(this.a, this.b)
                .filter(x -> x % 3 == 0).average().getAsDouble();
    }
}