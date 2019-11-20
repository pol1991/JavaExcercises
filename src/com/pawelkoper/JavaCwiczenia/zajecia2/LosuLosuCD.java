package com.pawelkoper.JavaCwiczenia.zajecia2;

import java.util.Random;
import java.util.Scanner;

public class LosuLosuCD
{
    public static void main(String[] args) {
        Random rnd = new Random();
        int numberToGuess = rnd.nextInt(10);
        int numberOfTries=0;
        Scanner in= new Scanner(System.in);
        int guess;
        boolean winGame=false;

        while (winGame==false)
        {
            System.out.println("Zgadnij liczbę od 1 do 10: ");
            guess=in.nextInt();
            numberOfTries++;

        if(guess == numberToGuess)
            winGame = true;
        else {
            System.out.println("Nie zgadleś");
        }
        }

        System.out.println("Wygrales!");
        System.out.println("Liczba to: " +numberToGuess);
        System.out.println("Zajęło Ci to " +numberOfTries+ " prób");
    }
}