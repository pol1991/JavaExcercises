package com.pawelkoper.JavaCwiczenia.zajecia2;

import java.util.Scanner;
import java.io.*;
public class PoleKola {

    public static double poleKola(double r)
    {
        return Math.PI*Math.pow(r,2.0);
    }

    public static void main(String[] args)throws IOException {
        System.out.println("Podaj promien Kola: ");
        //Scanner in = new Scanner(System.in);
       // String nextString=in.nextLine();
        //double liczba = in.nextInt();
        double liczba;
        BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
        liczba= (int) Double.parseDouble(odczyt.readLine());
        double pole = poleKola(liczba);

        System.out.println("Pole Koła = "+pole);
    }
}
