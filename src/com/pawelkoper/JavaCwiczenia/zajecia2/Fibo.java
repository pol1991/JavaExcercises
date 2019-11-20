package com.pawelkoper.JavaCwiczenia.zajecia2;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj do którego wyrazy Ciągu który chcesz wyświetlać: ");
        int n=in.nextInt();
        //System.out.println(fibonacci(n));
        for (int i=0;i<n;i++)
        {
           System.out.printf("%s , ",fibonacci(i));
        }


    }
    public static int fibonacci(int n)
    {
        if(n==0) {return 0;}
        if (n==1) {return 1;}
        else {return fibonacci(n-1)+fibonacci(n-2); }
    }
}
