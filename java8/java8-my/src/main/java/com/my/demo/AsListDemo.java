package com.my.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 源码jdk1.8 Arrays 类 asList方法实现.
 */
public class AsListDemo {
    @SafeVarargs
    public static <T> List<T> asListByCuimiao(T... a) {
        //源码jdk1.8 Arrays.java 3800行，asList方法可以new ArrayList<>(a)
        //因为ArrayList的构造方法是私有内部类的构造方法。
        //return new ArrayList<>(a);

        //旧方法实现
        ArrayList<T> arrayList = new ArrayList<>();
        for(T t : a){
            arrayList.add(t);
        }

        //java8 实现 暂时不会。。。
        //ArrayList<T> arrayList = Arrays.stream(a).collect(Collectors.toList());
        return  arrayList;
    }
    public static void main(String[] args) {
        List<String> list = AsListDemo.asListByCuimiao(
                new String("cuimiao"),new String("wuhao")
        );
        for(String s : list){
            System.out.println(s);
        }
        //list.stream().map(String :: toString);
    }
}
