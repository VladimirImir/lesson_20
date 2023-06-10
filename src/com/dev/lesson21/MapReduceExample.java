package com.dev.lesson21;

import java.util.Optional;
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
        /** Optional - он опционален, может быть , а может и не быть. */
        Optional<Student> maybeStudent = Stream.of(
                        new Student(18, "Ivan"),
                        new Student(23, "Petr"),
                        new Student(34, "Vasya"),
                        new Student(45, "Vova"),
                        new Student(20, "Sveta"),
                        new Student(68, "Katya"),
                        new Student(101, "Kira")
                )
                .sequential()
                .flatMap(student -> student.getMarks().stream())
                //.map()
                //.map(Student::getAge)
                //.filter(student -> student.getAge() < 18)
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);

        //maybeStudent.ifPresent(System.out::println);

        maybeStudent.map(Student::getAge)
                // .filter(age -> age > 25)
                .flatMap(age -> null)
                .get();
    }
}
