/*
Java 7
https://www.hackerrank.com/challenges/java-stdin-stdout/problem?h_r=next-challenge&h_v=zen
*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.               
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine(); 

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
