package com.kodilla.stream.rozmowa;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static long getCountEmptyStringUsingJava8(List<String> newList) {
        return newList.stream()
                .filter(n -> n.isEmpty())
                .count();
    }

    public static long getCountLength3UsingJava8(List<String> strings) {
        return strings.stream()
                .filter(n -> n.length() == 3)
                .count();
    }


    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {
        return strings.stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.toList());
    }

    public static String getMergedStringUsingJava8(List<String> strings, String s) {
        return strings.stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.joining(s));
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .map(n -> n*n)
                .collect(Collectors.toList());
    }

    public static Integer getMaxJava8(List<Integer> numbers) {
        OptionalInt newInt = numbers.stream()
                .mapToInt(n -> n)
                .max();
        if(newInt.isPresent()) {
            return newInt.getAsInt();
        } else {
            return null;
        }
    }

    public static Integer getMinJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n)
                .min()
                .getAsInt();
    }

    public static Integer getSumJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n)
                .sum();

       /* return IntStream.range(0, numbers.size())
                .map(n -> numbers.get(n))
                .sum(); */
    }

    public static Integer getAverageJava8(List<Integer> numbers) {
        return (int) numbers.stream()
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
    }
}
