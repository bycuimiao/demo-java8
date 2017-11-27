package com.cuimiao.java8;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpression {
    public static void main(String[] args) {
        Comparator<Apple> byColor = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        };
        List<Apple> list = Collections.emptyList();
        list.sort(byColor);

        //lambda
        Comparator<Apple> byColor2 = (o1, o2) -> o1.getColor().compareTo(o2.getColor());

        Function<String, Integer> flamdba = s -> s.length();

        Predicate<Apple> plambda = p -> p.getColor().equals("green");

        Runnable r = () -> {};

        Function<Apple,Boolean> fab = a -> a.getColor().equals("green");

        Supplier<Apple> sa = Apple :: new;


        /*(int x,int y) -> {
            System.out.print("hello");
        };

        () -> 42;*/
    }
}
