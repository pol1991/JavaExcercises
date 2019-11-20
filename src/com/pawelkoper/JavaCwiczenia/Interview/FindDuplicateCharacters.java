package com.pawelkoper.JavaCwiczenia.Interview;

import java.util.*;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Write word to analize %n");
        String word = in.nextLine();
        printDuplicates(word);
    }

    public static void printDuplicates(String word)
    {
        char[] characters = word.toCharArray();
        Map<Character,Integer> characterMap = new HashMap<>();
        for (Character ch: characters) {
            if (characterMap.containsKey(ch))
                characterMap.put(ch, characterMap.get(ch) + 1);
            else characterMap.put(ch,1);
        }

        Set<Map.Entry<Character,Integer>> entrySet = characterMap.entrySet();
        System.out.printf("Duplicate words in word '%s' %n",word);
        for (Map.Entry<Character,Integer> entry: entrySet ) {
            if (entry.getValue()>1)
                System.out.printf("%s: %d %n",entry.getKey(),entry.getValue());
        }
     }

}
