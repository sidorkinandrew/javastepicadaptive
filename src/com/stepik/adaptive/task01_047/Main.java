package com.stepik.adaptive.task01_047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            if (sc.nextInt() == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
