/*
Java 7
https://www.hackerrank.com/challenges/java-loops-i/problem
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        int i = 1;
        for(i = 1; i <=10; i++)
        {
            System.out.println(N + " x " + i +" = " + N*i );
        }
    }
}
