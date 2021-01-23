package com.stepik.adaptive.task03_014;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Symmetrical difference
https://en.wikipedia.org/wiki/Symmetric_difference
1.Find Symmetrical difference of sets on symDifference(Set<T> set1, Set<T> set2) and return it.
* For example sets:{1 2 3 4} {3 4 5 6} --> Symmetrical difference = {1 2 5 6}
Sample Input:
3 14 16 5 13 2 20 10 6 9;2 4 6 8 10 12 14 16 18 20
Sample Output:
3
4
5
8
9
12
13
18
 */
class Main {
    public static void main(String[] args) throws IOException {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(3, 14, 16, 5, 13, 2, 20, 10, 6, 9));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20));
        symDifference(set1, set2).stream().sorted().forEach(System.out::println);
    }

    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2){
        return Stream.concat(set1.stream(), set2.stream())
                .filter(n -> !(set1.contains(n) && set2.contains(n)))
                .collect(Collectors.toSet());
    }
}