package com.cuimiao.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterApple {
    public static List<Apple> findGreenApple(List<Apple> apples){
        List<Apple> list = new ArrayList<>();
        for(Apple apple : apples){
            if("green".equals(apple.getColor())){
                list.add(apple);
            }
        }
        return list;
    }

    public static List<Apple> findColorApple(List<Apple> apples,String color){
        List<Apple> list = new ArrayList<>();
        for(Apple apple : apples){
            if(color.equals(apple.getColor())){
                list.add(apple);
            }
        }
        return list;
    }

    public static List<Apple> findApple(List<Apple> apples,String color,long weight){
        List<Apple> list = new ArrayList<>();
        for(Apple apple : apples){
            if(color.equals(apple.getColor()) && weight > 150){
                list.add(apple);
            }
        }
        return list;
    }

    //策略模式解决问题
    @FunctionalInterface
    public interface AppleFilter {
        boolean filter(Apple apple);
    }

    public static List<Apple> findApple(List<Apple> apples , AppleFilter appleFilter){
        List<Apple> list = new ArrayList<>();
        for(Apple apple :apples){
            if(appleFilter.filter(apple)){
                list.add(apple);
            }
        }
        return list;
    }

    public static class GreenAnd150WeightFilter implements AppleFilter{

        @Override
        public boolean filter(Apple apple) {
            return (apple.getColor().equals("green") && apple.getWeight()<=150);
        }
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green",150),
                new Apple("red",140));
       /* List<Apple> greenApples = findGreenApple(list);
        assert greenApples.size() == 2;
        System.out.println(greenApples);

        List<Apple> redApples = findColorApple(list,"red");
        System.out.println(redApples);*/

        /*List<Apple> apples = findApple(list,new GreenAnd150WeightFilter());
        System.out.println(apples);*/

        //匿名内部类方式
        List<Apple> greenList = findApple(list, new AppleFilter() {
            @Override
            public boolean filter(Apple apple) {
                return (apple.getColor().equals("green") && apple.getWeight()<=150);
            }
        });

        //lambda表达式
        List<Apple> yellowList = findApple(list,apple -> {
            return apple.getColor().equals("yellow");
        });

    }
}
