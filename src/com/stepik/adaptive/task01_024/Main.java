package com.stepik.adaptive.task01_024;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String straightString = String.format("%04d", n);
        String reversedString = new StringBuilder(straightString).reverse().toString();
        if(straightString.equals(reversedString)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}