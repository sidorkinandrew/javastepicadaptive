package com.stepik.adaptive.task0107;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task0107 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int group_01 = Integer.parseInt(reader.readLine().trim());
            int group_02 = Integer.parseInt(reader.readLine().trim());
            int group_03 = Integer.parseInt(reader.readLine().trim());
            System.out.format("%.0f",Math.ceil(group_01/2.0)+Math.ceil(group_02/2.0)+Math.ceil(group_03/2.0));
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            System.out.println("Error happened!");
        }
    }
}
