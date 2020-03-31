package org.example;
 /*
    Задача 7
            Напишите программу, которая выводит на экран сумму всех чисел массива.
*/


 public class ArrSum {
    public static void main (String [] args) {
        int [] array1 = { 1, 2, 3, 1111, 333, 333, 11212, 347878742, 1211121};
        int summOfArr = 0;
        for (int element : array1) {
            summOfArr += element;
        }
        System.out.println(summOfArr);
    }
}