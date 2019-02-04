package com.stepik.adaptive.task01_029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

class task01_029 {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            BigDecimal aPercent = new BigDecimal(1.0+Double.parseDouble(reader.readLine().trim())/100.0).setScale(2, RoundingMode.FLOOR);
            String anIntegerPart = reader.readLine().trim();
            String aFractionalPart = reader.readLine().trim();
            BigDecimal aBigNumber = new BigDecimal(anIntegerPart+"."+aFractionalPart);
            aBigNumber = aBigNumber.multiply(aPercent);//.setScale(2, RoundingMode.FLOOR);
            for (String retval: aBigNumber.toString().split("\\.")) {
                System.out.println(retval);
            }
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}