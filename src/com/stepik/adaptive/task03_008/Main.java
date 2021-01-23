package com.stepik.adaptive.task03_008;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi hello goodmorning ass".split("\\s"));
        changeList(list).stream().forEach(System.out::println);
    }
    static List<String> changeList(List<String> list) {
        String maxLengthItem = Collections.max(list, Comparator.comparingInt(String::length));
        return list.stream().map(element -> maxLengthItem).collect(Collectors.toList());
    }
}
