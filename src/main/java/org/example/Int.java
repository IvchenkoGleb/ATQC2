
package org.example;
/*
 Задача 3
 Написать программу, которая находит и выводит на экран максимальное из трех чисел.




 */
public class Int {
    static int max;
    public static void getMax(int a, int b, int c){
        int d = Math.max(Math.max(a,b),c);
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        getMax(180, 12, 30);
    }
}