package com.stepik.adaptive.task01_044;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int i = sc.nextInt();
            if (i==0){break;}
            sum += i;
        }
        System.out.println(sum);
    }
}
