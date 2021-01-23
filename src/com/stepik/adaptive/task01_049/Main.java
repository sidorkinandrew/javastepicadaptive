package com.stepik.adaptive.task01_049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(), count = 1;
        StringBuilder result = new StringBuilder("1");
        for (int i = 2; count <= length; i++)
            for (int j = 0; (j < i) && (count++ < length); j++)
                result.append(" ").append(i);
        System.out.println(result);
    }
}