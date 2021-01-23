package com.stepik.adaptive.task01_005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_005 {
    public static void main(String[] args)  throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int h1 = Integer.parseInt(reader.readLine());
            int m1 = Integer.parseInt(reader.readLine());
            int s1 = Integer.parseInt(reader.readLine());
            int h2 = Integer.parseInt(reader.readLine());
            int m2 = Integer.parseInt(reader.readLine());
            int s2 = Integer.parseInt(reader.readLine());
            System.out.println(task01_005.getSeconds(h2,m2,s2)-task01_005.getSeconds(h1,m1,s1));
        } catch (IOException | NumberFormatException | ArithmeticException e) {
            // never reached by conditions
            System.out.println("Error happened!");
        }
    }
    private static int getSeconds(int hours, int minutes, int seconds){
        return hours*3600+minutes*60+seconds;
    }
}
