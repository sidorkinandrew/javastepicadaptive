package com.stepik.adaptive.task03_013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/*
Additional code,son!
1.Given a string as "1 2 3 4 5 6 ..." . String[] strings contains of element from given string ("1","2",..).
Add all elements from String[] strings to Set<Integer> set.
2.Add all the elements from helpList to set .
3.Using Iterator remove/filter(Stream API)/"method-of-all-collections" all elements greater than 10(>) from set and return modified set.
Sample Input:
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
Sample Output:
1
2
3
4
5
6
7
8
9
10
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split(" ");
        List<Integer> helpList = getList(strings);
        Set<Integer> set = new HashSet<>();
        set = Arrays.stream(strings).map(Integer::parseInt).collect(Collectors.toSet());
        set.addAll(helpList);
        set = removeAllNumbersMoreThan10(set);
        set.forEach(System.out::println);
        //System.out.println(Collections.max(set));
    }
    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set){
        return set.stream().filter(x -> x<=10).collect(Collectors.toSet());
    }
    public static List<Integer> getList(String[] strings){
        return Arrays.stream(strings).map(Integer::parseInt).collect(Collectors.toList());
    }
}