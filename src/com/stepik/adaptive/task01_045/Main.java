package com.stepik.adaptive.task01_045;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
/*        long limitOfTwo = new Scanner(System.in).nextInt(), powerOfTwo = 1;
        while (powerOfTwo<=limitOfTwo){
            System.out.println(powerOfTwo);
            powerOfTwo*=2; }*/
            int n = new Scanner(System.in).nextInt();
            IntStream.iterate(1, x -> x * 2)
                    .limit((int) (Math.log(n) / Math.log(2)) + 1)
                    .forEachOrdered(System.out::println);
    }
}
