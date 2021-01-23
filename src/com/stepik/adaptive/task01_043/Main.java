package com.stepik.adaptive.task01_043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfParts = scanner.nextInt(), currentDetect;
        int numberOfReadyParts = 0, numberOfPartsToBeFixed = 0, numberOfRejects = 0;
        for (int aPart = 0; aPart < numberOfParts; aPart++) {
            currentDetect = scanner.nextInt();
            if (currentDetect == 0) {
                numberOfReadyParts++;
            } else if (currentDetect > 0) {
                numberOfPartsToBeFixed++;
            } else {
                numberOfRejects++;
            }
        }
        System.out.println(numberOfReadyParts+" "+numberOfPartsToBeFixed+" "+numberOfRejects);
    }
}
