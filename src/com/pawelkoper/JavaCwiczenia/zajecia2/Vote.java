package com.pawelkoper.JavaCwiczenia.zajecia2;

import java.util.Scanner;

public class Vote {

    public static void age(int wiek)
    {
        if (wiek<18)
        {
            System.out.println("nie może głosować");
        }
        else if (wiek>=18 && wiek<35)
        {
            System.out.println("może głosować ale nie może zostać prezydentem");
        }
        else
        {
            System.out.println("Może kandydować na prezydenta państwa");
        }
    }

    public static void main(String[] args) {
        System.out.printf("%s %n","Podaj wiek: ");
        Scanner in = new Scanner(System.in);
        int wiek=in.nextInt();
        age(wiek);
    }
}
