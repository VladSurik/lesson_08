package com.company;

import java.util.Random;

/*
Создать генератор паролей, который будет генерировать случайные пароли по следующим правилам:
        Пароль состоит из 8 символов
        В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания
        Пароль обязательно должен содержать Большие, маленькие буквы и цифры
*/
public class Task_04 {
    private static final int lengthPassword = 8;
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz";
    private static final Random random = new Random();

    public static void main(String[] args) {
        String newPassword = createPassword();
        System.out.println(newPassword);
    }

    private static String createPassword() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < Task_04.lengthPassword / 2; j++) {
            stringBuilder.append(random.nextInt(9));
            stringBuilder.append(Task_04.alphabet.charAt(random.nextInt(Task_04.alphabet.length())));
        }
        boolean resultChek = chekPassword(stringBuilder.toString());
        if (!resultChek) {
            createPassword();
        }
        return stringBuilder.toString();
    }

    private static boolean chekPassword(String password) {
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasLowerCase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d+.*");
        return hasUpperCase && hasLowerCase && hasDigit;
    }
}
