package com.stepik.adaptive.task01_036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task01_035 {
    public static int GCD(int a, int b) { return b==0 ? a : GCD(b, a%b);}
    public static void main (String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int bio_team = Integer.parseInt(reader.readLine().trim());
            int cs_team = Integer.parseInt(reader.readLine().trim());
            System.out.println(bio_team*cs_team/GCD(bio_team,cs_team));
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}


