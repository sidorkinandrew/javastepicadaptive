package com.stepik.adaptive.task01_001;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class task01_001 {
    public static void main(String[] args)  throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int nInt = Integer.parseInt(bufferedReader.readLine());
        int kInt = Integer.parseInt(bufferedReader.readLine());
        System.out.println(kInt/nInt);
    }
}

//    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
//            int n = Integer.parseInt(reader.readLine());
//            System.out.println(Integer.parseInt(reader.readLine()) / n);
//        } catch (IOException | NumberFormatException | ArithmeticException e) {
//            // never reached by conditions
//        }
//  }