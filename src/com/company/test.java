package com.company;

public class test {
    public static void main(String[] args) {
        String password = "aaaAa";
        System.out.println(!password.equals(password.toLowerCase()));
        System.out.println(!password.equals(password.toUpperCase()));
        System.out.println(!password.matches("\\d+"));
    }
}
