
package org.example;
/*
 Задача 3
 Написать программу, которая находит и выводит на экран максимальное из трех чисел.
попробовать написать метод нахождения макс числа через иф елсе
public class Int {
    public static void getMax(int a, int b, int c){
        int d = Math.max(Math.max(a,b),c);
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        getMax(180, 12, 30);
    }
}
}
 */
public class Int {
    public static void maxNumeric(int a, int b, int c){
        if (a > b && a > c){
            System.out.print(a);
       }
        else if(c > a && c > b){
            System.out.print(c);
        }
        else {
            System.out.print(b);
        }
    }
    public static void main(String[] args){
        maxNumeric(10, 11, 55);
    }
}

