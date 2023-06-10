package com.dev.lesson21;

import java.util.Comparator;

/**
 * Lambda - выражения.
 */

public class LambdaExample {

    public static void main(String[] args) {
        // Comparator<Integer> comparator = new IntegerComparator();

        /** Lambda */
        // Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);

        /** Method reference */
        Comparator<Integer> comparator = Integer::compare;

        System.out.println(comparator.compare(25, 100));
        System.out.println(comparator.compare(100, 100));
        System.out.println(comparator.compare(100, 25));
    }

    /*private static class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }
    }*/
}
