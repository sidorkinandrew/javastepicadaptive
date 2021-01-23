package com.stepik.adaptive.task01_038;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_038_naive {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int nStudents = Integer.parseInt(reader.readLine().trim());
            int countD=0,countC=0,countB=0,countA=0;
            for (int i = 0; i < nStudents; i++) {
                switch (Integer.parseInt(reader.readLine().trim())) {
                    case 5:
                        countA++;
                        break;
                    case 4:
                        countB++;
                        break;
                    case 3:
                        countC++;
                        break;
                    case 2:
                        countD++;
                        break;
                }
            }
            System.out.println(countD + " " + countC + " " + countB + " " + countA);
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}