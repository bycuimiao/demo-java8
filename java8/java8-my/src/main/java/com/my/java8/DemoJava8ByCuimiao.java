package com.my.java8;

import java.util.function.*;

/**
 * @auther cuimiao
 * @date 2017/11/30/030  0:15
 * @deprecated 对java8 java.util.function包下各种接口的使用.
 */
public class DemoJava8ByCuimiao {
    public static void main(String[] args) {
        System.out.println("-------------by:cuimiao------------------------------");

        //Consumer -- void accept(T t);
        System.out.println("Consumer<String> consumer = (str) -> System.out.println(str);");
        Consumer<String> consumer = (str) -> System.out.println(str);
        Consumer<String> consumer2 = System.out::print;//方法引用
        //BiConsumer -- void accept(T t, U u);
        BiConsumer biConsumer = (str1, str2) -> {System.out.print(str1);System.out.println(str2);};
        System.out.println("BiConsumer biConsumer = (str1, str2) -> {System.out.print(str1);System.out.print(str2);};");
        biConsumer.accept("hello,","world");
        //intConsumer -- void accept(int value);
        System.out.println("IntConsumer intConsumer = (a) -> System.out.println(a);");
        IntConsumer intConsumer = (a) -> System.out.println(a);

        //Function -- R apply(T t);
        Function<Integer,Integer> function = (num) -> (num*3);
        System.out.println("Function<Integer,Integer> function = (num) -> (num*3);");
        System.out.println(function.apply(5));
        //BiFunction -- R apply(T t, U u);
        BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> (a*b);
        System.out.println("BiFunction<Integer,Integer,Integer> biFunction = (a,b) -> (a*b);");
        System.out.println(biFunction.apply(5,3));

        //Predicate -- boolean test(T t);
        Predicate<Integer> predicate = (a) -> a == 1;

        //Supplier -- T get();
        Supplier<Integer> supplier = () -> 5;
    }
}
