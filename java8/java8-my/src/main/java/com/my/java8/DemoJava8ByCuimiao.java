package com.my.java8;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * @auther cuimiao
 * @date 2017/11/30/030  0:15
 * @deprecated
 */
public class DemoJava8ByCuimiao {
    public static void main(String[] args) {
        //
        System.out.println("-------------by:cuimiao------------------------------");
        BiConsumer biConsumer = (str1, str2) -> {System.out.print(str1);System.out.println(str2);};
        System.out.println("BiConsumer biConsumer = (str1, str2) -> {System.out.print(str1);System.out.print(str2);};");
        biConsumer.accept("hello,","world");
        //BiFunction biFunction = (str1,str2) -> {System.out.print(str1);System.out.print(str2);return };
        Function<Integer,Integer> function = (num) -> (num*3);
        System.out.println("Function<Integer,Integer> function = (num) -> (num*3);");
        System.out.println(function.apply(5));
    }
}
