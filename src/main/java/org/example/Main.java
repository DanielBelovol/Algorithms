package org.example;

public class Main {
    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        System.out.println(fibonacciNumbers.fibonacciNumIteration(6));
        System.out.println(fibonacciNumbers.fibonacciNumRecursion(6));
        System.out.println(fibonacciNumbers.fibonacciNumDynamic(6));
    }
}