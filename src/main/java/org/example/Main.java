package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] words = {"hey", "aeo", "artro", "mu", "ooo"};
        System.out.println(vowelStrings(words, 1, 4));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        String vowel = "aeiou";

        int count = 0;

        for (int i = left; i <= right; i++) {
            if (vowel.contains(String.valueOf(words[i].charAt(0))) && vowel.contains(String.valueOf(words[i].charAt(words[i].length() - 1))))
                count++;
        }

        return count;
    }

}