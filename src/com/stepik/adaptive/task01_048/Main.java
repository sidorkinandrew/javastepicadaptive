package com.stepik.adaptive.task01_048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (true) {
            int next = sc.nextInt();
            if (next == 0) {
                break;
            }
            max = Math.max(max, next);
        }
        System.out.println(max);
    }
}