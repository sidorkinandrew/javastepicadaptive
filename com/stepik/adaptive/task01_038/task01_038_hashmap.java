package com.stepik.adaptive.task01_038;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class task01_038_hashmap {
    public static void main(String[] args)  throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int nGrades = Integer.parseInt(reader.readLine().trim());
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(2, 0);
            map.put(3, 0);
            map.put(4, 0);
            map.put(5, 0);
            for(int key, i=0; i<nGrades; ++i) {
                key = Integer.parseInt(reader.readLine().trim());
                map.put(key, map.get(key) + 1);
            }
            for(Integer v:map.values()) {
                System.out.print(v + " ");
            }
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException| ArithmeticException e) {
            System.out.println("error!");
        }
    }
}
