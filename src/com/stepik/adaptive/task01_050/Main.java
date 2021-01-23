package com.stepik.adaptive.task01_050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(smallestNaturalDivisor(number));
    }

    private static int smallestNaturalDivisor(int number) {
        if (number % 2 == 0) {
            return 2;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0)
                return i;
        }
        return number;
    }
}