package com.pawelkoper.JavaCwiczenia.zajecia2;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj parametry a,b,c funkcji: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        equationSolver(a,b,c);

    }
    public static void equationSolver(int a,int b,int c)
    {
       double x1;
       double x2;
         double delta=Math.pow(b,2.0)-(4*(a*c)) ;
        if (a!=0) {
            if (delta < 0) {
                System.out.println("Funkcja nie na pierwiastków rzeczywistych");
            }
            if (delta == 0) {
                 x1=(((-1.0)*(b))/(2.0*a));
                System.out.println("Delta: "+delta);
                System.out.println("Pierwiastek podwójny x1: "+x1);
            }
            else {
                x1=((((-1)*b)-Math.sqrt(delta))/(2*a));
                x2=((((-1)*b)+Math.sqrt(delta))/(2*a));
                System.out.println("Delta: "+delta);
                System.out.println("x1: "+x1);
                System.out.println("x2: "+x2);
            }
        }
        else {System.out.println("Współczynnik a nie jest różny od zero");}
    }
}
