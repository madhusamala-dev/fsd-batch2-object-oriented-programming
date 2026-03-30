package com.java.oop.java8.anonymous;

public class Main {
    public static void main(String[] args) {
       /* Greeting greeting = new GreetingImpl();
        greeting.greet();
        greeting.greet("Hello");*/

        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, How are you!");
            }

            @Override
            public void greet(String msg) {
                System.out.println(msg);
            }
        };

        greeting.greet();
        greeting.greet("Hello");
    }
}
