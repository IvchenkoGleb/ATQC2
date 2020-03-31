package org.example;

/*
Задача 2
 Написать программу, которая выводит на экран разницу двух чисел.
 */
public class Difference {
    public static void diff(int a, int b){
        int c = b - a;
        System.out.println(c);
    }
    public  static void main(String[] args){
        diff(10, 20);
    }
}


