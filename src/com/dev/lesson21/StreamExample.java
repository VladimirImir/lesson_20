package com.dev.lesson21;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream.
 */

public class StreamExample {

    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");

        /** Вариант написания c Stream. */
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                //.skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
                //.mapToObj(Integer::valueOf)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

        /*List<String> collect = Stream.of("88", "11", "22", "33", "44", "55", "66")
                .peek(System.out::println)
                .collect(Collectors.toList());*/

        /*IntStream.range(1, 10)
                .forEach(System.out::println);*/
        IntStream.iterate(0, operand -> operand + 3)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);


        /** Вариант написания без Stream. */
        /*for (String string : strings) {
            String value = string + string;
            Integer intValue = Integer.valueOf(value);
            if (intValue % 2 == 0) {
                System.out.println(intValue);
            }
        }*/

        /** Три класса Stream для примитивных типов. 1) IntStream, 2) DoubleStream, 3) LongStream. */
    }
}
