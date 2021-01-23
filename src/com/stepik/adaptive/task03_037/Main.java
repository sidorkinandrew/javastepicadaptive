package com.stepik.adaptive.task03_037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
/*
Write a lambda expression that accepts seven (!) string arguments and
returns a string in upper case concatenated from all of them (in the order of arguments).
Note. The correct solution may not work in your local environment because
you don't have suitable functional interface. The testing system has the interface and can test your solution.
Solution format. Submit your lambda expression with seven arguments in any valid format with ; on the end.
Examples (only with two args): (x, y)  -> x + y; (x, y) -> { return x + y; };

Sample Input:
The lambda has too many string arguments.
Sample Output:
THELAMBDAHASTOOMANYSTRINGARGUMENTS.
 */
class Main {
    public static void main(String[] args) throws IOException {
        // (x1, x2, x3, x4, x5, x6, x7)  -> { return (x1+x2+x3+x4+x5+x6+x7).toUpperCase(); };
        // (a, b, c, d, e, r, t) -> Stream.of(a, b, c, d, e, r, t).reduce("", String::concat).toUpperCase();
    }
}