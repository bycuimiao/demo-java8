package com.cuimiao.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );
        //java7
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for(Dish dish : menu){
            if(dish.getCalories() < 400){
                lowCaloricDishes.add(dish);
            }
        }
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(),o2.getCalories());
            }
        });
        List<String> lowCaloricDishesName = new ArrayList<>();
        for(Dish dish : lowCaloricDishes){
            lowCaloricDishesName.add(dish.getName());
        }
        //java8
        List<String> lowCaloricDishesNameJava8 =
                menu.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(Comparator.comparing(Dish :: getCalories))
                .map(Dish :: getName)
                .collect(Collectors.toList());

        List<String> threeHighCaloricDishNames =
                menu.stream()
                    .filter(d -> d.getCalories() > 300)
                    .map(Dish :: getName)
                    .limit(3)
                    .collect(Collectors.toList());

        List<String> title = Arrays.asList("java8","in","action");
        Stream<String> s = title.stream();
        s.forEach(System.out :: println);
        //s.forEach(System.out :: println); //java.lang.IllegalStateException: stream has already been operated upon or closed

        List<Dish> vegetarianMenu = menu.stream().filter(Dish :: isVegetarian).collect(Collectors.toList());

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

        numbers = numbers.stream().filter(n -> n % 2 == 0).distinct().collect(Collectors.toList());
        numbers.stream().forEach(System.out :: println);

        List<Integer> nameLenList = menu.stream().map(Dish :: getName).map(String :: length).collect(Collectors.toList());

        List<String> words = Arrays.asList("Hello" , "World");
        List<String> wordAlpha = words.stream().map(w -> w.split("")).flatMap(Arrays :: stream).distinct().collect(Collectors.toList());
        wordAlpha.stream().forEach(System.out :: println);


    }
}
