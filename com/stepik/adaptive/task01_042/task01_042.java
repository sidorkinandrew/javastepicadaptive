package com.stepik.adaptive.task01_042;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

class task01_042 {
//    private static String fizzBuzz(int aNumber) {
//        if(aNumber%3==0 && aNumber%5==0) return "FizzBuzz";
//        else if (aNumber%3==0 || aNumber%5==0) return aNumber%3==0?"Fizz":"Buzz";
//        else return String.valueOf(aNumber);
//    }

    public static void main(String[] args)  throws IOException, NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String[] aLine = reader.readLine().trim().split(" ");
            IntStream.rangeClosed(Integer.parseInt(aLine[0]), Integer.parseInt(aLine[1]))
                    .mapToObj(anInteger -> (anInteger % 3 == 0 ? anInteger % 5 == 0 ? "FizzBuzz" : "Fizz" : anInteger % 5 == 0 ? "Buzz" : String.valueOf(anInteger)))
//                    .mapToObj(task01_042::fizzBuzz)
                    .forEach(System.out::println);
        }
    }
}