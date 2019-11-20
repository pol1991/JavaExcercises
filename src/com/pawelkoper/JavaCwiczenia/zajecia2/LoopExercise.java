package com.pawelkoper.JavaCwiczenia.zajecia2;

import java.util.Scanner;

public class LoopExercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj początek zakresu: ");
        int s = in.nextInt();
        System.out.println("Podaj koniec zakresu:");
        int n = in.nextInt();
     if(s<n) {

         for (int i=s;i<=n;i++) {
            System.out.println(i);
         }
     }
     else
         {
             System.out.println("Początek zakresu nie moze  być większy od końca");
         }


     }
    }

