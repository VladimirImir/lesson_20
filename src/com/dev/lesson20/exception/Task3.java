package com.dev.lesson20.exception;

/**
 * 3. Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace в
 * консоль.
 */

public class Task3 {

    public static void main(String[] args) {
        try {
            unsafe();
        } catch (DevException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws DevException {
        throw new DevException(new RuntimeException("Runtime exception!"));
    }
}
