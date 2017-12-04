package com.my.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @auther cuimiao
 * @date 2017/12/4/004  22:06
 * @deprecated
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,7,8,9,10);
        list = list.stream().filter( (a) -> a>3 ).distinct().map(a -> a*a).limit(5).skip(1).collect(Collectors.toList());
        //list.forEach((a) -> System.out.print(a+","));
        //list.forEach(System.out::print);
        List<String> strList = Arrays.asList("hello","world");
        List<String> l = strList.stream().map((a)->a.split("")).flatMap((a) -> Arrays.stream(a)).collect(Collectors.toList());
        l.forEach(System.out::print);
    }
}
