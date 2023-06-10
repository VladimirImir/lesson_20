package com.dev.lesson21;

import java.util.stream.Stream;

/**
 * [1_000_000] -> age -> max
 * <p>
 * [1_000_000] -> age -> max  -> max
 * <p>
 * [1_000_000] -> age -> max
 */

public class MapReduceExample {

    public static void main(String[] args) {
        Stream.of(
                        new Student(18, "Ivan"),
                        new Student(23, "Petr"),
                        new Student(34, "Vasya"),
                        new Student(45, "Vova"),
                        new Student(20, "Sveta"),
                        new Student(68, "Katya"),
                        new Student(101, "Kira")
                )
                .sequential()
                .map(Student::getAge)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
