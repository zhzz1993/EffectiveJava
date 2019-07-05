package com.java8.lambda;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019-07-05 21:42
 */
public class Test {
    public static void filter(List<String> names, Predicate<String> condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach(
            System.out::println
        );
    }

    public static void main(String[] args) {
         BigDecimal xx = new BigDecimal(100);
        BigDecimal AA = xx.multiply(BigDecimal.valueOf(0.9));
        AA = AA.add(xx);
        System.out.println(AA);
        List<String> languages = Arrays.asList("Scala", "C++", "Java", "Java", "Haskell", "Lisp");
        System.out.println(languages.stream().distinct().collect(Collectors.toList()));
        ;
        System.out.println("1");
        filter(languages, s -> s.startsWith("J"));
    }
}