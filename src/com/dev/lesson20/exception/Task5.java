package com.dev.lesson20.exception;

/**
 * 5. Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 */

public class Task5 {

    public static void main(String[] args) {
        try {
            catchCustomException();
        } catch (DevException e) {
            System.out.println("Catched in main.");
            e.printStackTrace();
        }
    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException e) {
            System.out.println("Catch int catchCustomException method.");
            throw new DevException(e);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("Ooops");
    }
}
