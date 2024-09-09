//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.*;


public class Q1 {
    public static void main(String[] args) {

        System.out.print("Enter A Number=");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        if (num%2==0)
        {
            System.out.print("Even");
        }else {
            System.out.print("Odd");
        }


    }
}
