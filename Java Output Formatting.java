/*
Java 7
https://www.hackerrank.com/challenges/java-output-formatting/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                
                System.out.println(String.format("%-15s%0"+3+"d",s1,x));
            }
            System.out.println("================================");

    }
}
