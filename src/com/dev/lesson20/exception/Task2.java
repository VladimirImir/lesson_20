package com.dev.lesson20.exception;

/**
 * 2. Написать код, который создаст, а затем отловит
 * ArrayIndexOutOfBoundsException.
 */

public class Task2 {

    public static void main(String[] args) {
        //              0  1  2  3  4  5
        int[] values = {1, 3, 5, 6, 8, 9};
        //System.out.println(values[6]);
        try {
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Catch.");
            e.printStackTrace();
        }
        System.err.println("End.");
    }
}
