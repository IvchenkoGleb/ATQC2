package org.example;

/*
 Задача 4
 Написать программу, которая проверяет, является ли число четным или нечетным.

 */

public class Number {
     static boolean isDividedByTwo(int a){
         return(a%2 == 0);
     }
    public static void main(String[] args){
        System.out.println(isDividedByTwo(9));
    }
}