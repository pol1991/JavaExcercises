package com.pawelkoper.JavaCwiczenia.zajecia2;

import java.util.Scanner;

public class triangle {


    public static void main(String[] args) {

        int large = 0;
        Scanner in=new Scanner(System.in);

        int liczba1=in.nextInt();
        int liczba2=in.nextInt();
        int liczba3=in.nextInt();
        isTriangleValid(liczba1,liczba2,liczba3);
}

    private static void isTriangleValid(int liczba1, int liczba2, int liczba3)
    {
        if((liczba1+liczba2)>liczba3 && (liczba1+liczba3)>liczba2 && (liczba2+liczba3)>liczba1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }

}
