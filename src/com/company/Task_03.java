package com.company;
/*
 Написать метод.
   входящий параметр:
   Строка со словами разделенными пробелом которые состоят из больших и маленьких букв.
   Метод должен вернуть ту же строку в которой первая буква в каждом слове большая, а остальные маленькие
*/

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Task_03 {
    public static void main(String[] args) {
        String testStr = "Долго считалось, что \"Искусство войны\" является древнейшим и наиболее"
                + " глубоким военным трактатом Китая, а все остальные книги в лучшем случае второразрядными.";
        String testStr2 = "Традиционалисты приписывали книгу историческому персонажу Сунь У, активна деятельность которого в конце "
                + "VI в. до н.э., начина с 512г. до н.э., зафиксирована в \"Ши цзи\" и в \"Вёснах и Осенях У и Юэ\"."
                + " Согласно им, книга должна датироваться этим временем и содержать теории и военные концепции самого Сунь У.";

        System.out.println(buildStringCamelStyle(testStr));
        System.out.println(buildStringCamelStyle(testStr2));

    }

    private static String buildStringCamelStyle(String str) {
        String[] arrayStr = str.split("\\s");
        StringBuilder newString = new StringBuilder();
        for (String onlyWords : arrayStr) {
            int firstSymbol = chekFirstSymbolIsLetter(onlyWords);
            if (firstSymbol > -1) {
                newString.append(buildString(onlyWords, firstSymbol));
            }
        }
        return newString.toString();
    }

    private static int chekFirstSymbolIsLetter(@NotNull String str) {
        for (int j = 0; j < str.length(); j++) {
            char a = str.charAt(j);
            if (Character.isLetter(str.charAt(j))) {
                return j;
            }
        }
        return -1;
    }

    private static String buildString(String word, int indexSymbol) {
        StringBuilder newBuildStr = new StringBuilder();
        int lengthOnlyWords = word.length();
        String firstLetter = String.valueOf(word.charAt(indexSymbol));
        if (indexSymbol > 0) {
            for (int i = 0; i < indexSymbol; i++) {
                newBuildStr.append(word.charAt(i));
            }
        }
        if (lengthOnlyWords <= 1) {
            newBuildStr.append(firstLetter);
        } else {
            newBuildStr.append(firstLetter.toUpperCase());
            newBuildStr.append(word, indexSymbol + 1, lengthOnlyWords);
        }
        newBuildStr.append(" ");
        return newBuildStr.toString();
    }
}
