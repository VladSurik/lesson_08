package com.company;

//Вывести в 1 строку через пробел все числа от 1 до 99 со следующими изменениями:
//        - если число кратно 3 то вывести вместо него Hello
//        - если число кратно 5 то вывести вместо него World
//        - если число кратно и 3 и 5 то вывести вместо него HelloWorld

public class task_02 {
    public static void main(String[] args) {
        int start = 1;
        int end = 99;
        String hello = "Hello";
        String world = "World";

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(hello + world);
            } else if (i % 3 == 0) {
                System.out.println(hello);
            } else if (i % 5 == 0) {
                System.out.println(world);
            }
        }
    }
}
