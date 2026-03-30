package com.java.oop.java8.functional;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {
//        Greeting greeting = new Greeting() {
//            @Override
//            public void greet() {
//                System.out.println("Hello, How are you!");
//            }
//        };
//        greeting.greet();
        //lambda expression
        Greeting greeting = (name, msg) -> {
            System.out.println("Hello, " + name);
            System.out.println(msg);
        };
        greeting.greet("Madhu", "Hello, How are you!");

        //Predicate<T>
        //test(T) -> boolean
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(5));

        //Consumer<T>
        //Performs some action on the input
        //accept(T) -> void
        Consumer<Integer> consumer = number -> System.out.println(number);
        consumer.accept(5);

        //Supplier<T>
        //Returns some value
        //get() -> T

        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

        //Function<T,R>
        //T -> R
        // Transform the input to the output
        //apply(T) -> R
        Function<String, Integer> strLength = str -> str.length();
        System.out.println(strLength.apply("Madhu"));

    }
}
