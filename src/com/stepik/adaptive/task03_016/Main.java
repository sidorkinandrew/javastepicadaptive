package com.stepik.adaptive.task03_016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Additional code,Soldier!
Given one input string as "1 2 3 4 5;6 7 8 9 10;11 12 13 14 15"(it's 3 lists)
1.String[] sets consists of these lists. Add all elements from each list to correct set(see the comments in the code) sets[0] = {"1 2 3 4 5"} - its string and so on
*use split(" ") to separate elements from string
2.On unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3):
     1)In each Set find the maximum element
     2)create TreeSet, add the resulting elements to TreeSet
     3)return this TreeSet with elements sorted in descending order:
          *you can use special method from class TreeSet or rather NavigableSet interface to change the order of storage on the reverse
3.Using System.out.println() print elements of resultTreeSet
Sample Input:
6 11 9 18 10;12 13 19 8 16;3 4 5 15 20
Sample Output:
20
19
18
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sets = reader.readLine().split(";");

        Set<Integer> set1 = Arrays.stream(sets[0].split(" ")).map(Integer::parseInt).collect(Collectors.toSet());

        Set<Integer> set2 = Arrays.stream(sets[1].split(" ")).map(Integer::parseInt).collect(Collectors.toSet());

        Set<Integer> set3 = Arrays.stream(sets[2].split(" ")).map(Integer::parseInt).collect(Collectors.toSet());

        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1, set2, set3);

        resultTreeSet.forEach(System.out::println);

/*        new BufferedReader(new InputStreamReader(System.in)).lines()
                .map(string -> string.split(";"))
                .flatMap(Arrays::stream)
                .map(string -> string.split(" "))
                .map(Arrays::asList)
                .map(x -> x.stream().map(Integer::parseInt).collect(Collectors.toList()))
                .map(Collections::max)
                .collect(Collectors.toCollection(() -> new TreeSet<>(Collections.reverseOrder())))
                .forEach(System.out::println);*/

    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        TreeSet<Integer> resultSet = new TreeSet<>(Comparator.reverseOrder());
        resultSet.add(Collections.max(set1));
        resultSet.add(Collections.max(set2));
        resultSet.add(Collections.max(set3));
        return resultSet;
    }
}