package com.dev.lesson20.exception;

/**
 * 4. Повторить предыдущее упражнение, но наследуя свой класс от класса
 * RuntimeException.
 * Добавить в конструктор своего класса возможность указания
 * сообщения.
 */

public class Task4 {

    public static void main(String[] args) {
        unsafe();

        /*try {
            unsafe();
        } catch (DevException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }*/
    }

    public static void unsafe() {
        throw new DevException(new RuntimeException("Runtime exception!"));
    }
}
