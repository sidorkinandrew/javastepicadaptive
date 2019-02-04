package com.stepik.adaptive.task01_034;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_034 {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            byte a = Byte.parseByte(reader.readLine().trim());
            byte b = Byte.parseByte(reader.readLine().trim());
            byte c = Byte.parseByte(reader.readLine().trim());
            byte d = Byte.parseByte(reader.readLine().trim());
            for (int i = c; i <=d ; i++) {
                System.out.print("\t"+i);
            }
            System.out.println();
            for (int j = a; j <=b ; j++) {
                System.out.print(j);
                for (int i = c; i <=d ; i++) {
                    System.out.print("\t"+j*i);
                }
                System.out.println();
            }
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}