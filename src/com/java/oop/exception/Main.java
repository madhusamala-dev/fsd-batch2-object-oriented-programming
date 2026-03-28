package com.java.oop.exception;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number 1");
                int num1 = sc.nextInt();
                System.out.println("Enter number 2");
                int num2 = sc.nextInt();
                int result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("num2 cannot be zero");
                input();
            }
            try {
                int[] ids = new int[-5];
                ids[4] = 100;
            }  catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Some issue in array");
                System.out.println(e.getMessage());
                input();
            }

            String role = getRole();
            if(role.equals("admin"))
                System.out.println("Welcome admin");
            else
                System.out.println("Welcome user");
        } catch (NullPointerException e) {
            System.out.println("Role cannot be null");
        }
    }

    private static String getRole() {
        return null;
    }

    private static void input() {
        System.out.println("input continues");
    }
}
