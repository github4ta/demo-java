package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ":" + new User((char) i).ch);
        }
    }
}