package com.usha;
import java.util.Scanner;
public class fact2{
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        fact = factorial(num);
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}