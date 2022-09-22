package dev.andrylat.calc;

import java.util.concurrent.ArrayBlockingQueue;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Supoer");
    }
    public Integer sum(Integer a, Integer b) {
        a = a;
        boolean q = false;
        if (q) {
            System.out.println("fdsfdf");
            System.out.println("something!");
        }

        if (a == null) {
            throw new IllegalArgumentException("a can't be nul");
        }

        if (b == null) {
            throw new IllegalArgumentException("b can't be null");
        }

        return a + b;
    }
}
