package com.stepik.adaptive.task03_008;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(new Integer[]{847, 271, 663, 473, 376, 133, 693, 13, 382, 879});
        System.out.println(maxElem(integerList));

        List<String> list = Arrays.asList("hi hello goodmorning ass".split("\\s"));
        changeList(list).stream().forEach(System.out::println);
    }

    public static Integer maxElem(List<Integer> list) {
        return Collections.max(list, null);
    }

    static List<String> changeList(List<String> list) {
        //Collections.fill(list, Collections.max(list, Comparator.comparingInt(String::length)));
        String maxLengthItem = Collections.max(list, Comparator.comparingInt(String::length));
        return list.stream().map(element -> maxLengthItem).collect(Collectors.toList());
    }
}


