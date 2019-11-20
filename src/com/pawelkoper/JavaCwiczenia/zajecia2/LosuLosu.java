package com.pawelkoper.JavaCwiczenia.zajecia2;
import java.util.Random;
import java.util.Scanner;
//Losowanie:
//Wylosuj liczbę z podanego zakresu i wyświetl ją (zakres min i max wpisuje użytkownik).
public class LosuLosu {

    public static int RandomRange(int min, int max)
    {
        if(min>=max) {
            System.out.println("Zły zakres");
        }
        Random random = new Random();
        return random.nextInt((((max - min)+1)+min));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Podaj poczatek zakresu: ");
        int min = in.nextInt();
        System.out.printf("Podaj koniec zakresu: ");
        int max = in.nextInt();
        System.out.printf("Wylosowane liczby to: ");
        for (int i =min;i<max;i++)
                System.out.printf("%s ",RandomRange(min,max));

    }
}


