package com.java.oop.exception;

import java.util.Scanner;



public class ExceptionTest {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number 1");
            int num1 = sc.nextInt();
            System.out.println("Enter number 2");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);
            int[] ids = new int[5];
            ids[4] = 100;
            String role = getRole();
            if(role.equals("admin"))
                System.out.println("Welcome admin");
            else
                System.out.println("Welcome user");
        } catch(Exception e) {
            System.out.println("Some internal error : " + e.getMessage());
            input();
        } finally {
            System.out.println("finally block");
        }
    }

    private static void input() {
        System.out.println("input continues");
    }

    private static String getRole() {
        return "admin";
    }
}
