package com.startjava.lesson_1.unicode;

public class Unicode {
    public static void main(String[] args) {
        for (char i = 33; i <= 126; i++) {
            System.out.println(String.format("symbUnicode = %c", i));
        }
    }
}