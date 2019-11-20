package com.pawelkoper.JavaCwiczenia.zajecia2;

public class SprawdzPodzielnoscPetlA {

    public static void main(String[] args) {

        for (int i=0;i<=100;i++){

             if (i%3==0 && i%5 ==0)
            {
                if (i==0)
                {
                    continue;
                }
                System.out.println(i+" jest podzielne przez 3 i 5");
            }

            else if (i%3==0)
            {
                if (i==0)
                {
                    continue;
                }
                System.out.println(i+" jest podzielne przez 3");
            }

            else if (i%5==0)
            {
                System.out.println(i+" jest podzielne przez 5");
            }



        }
    }

}
