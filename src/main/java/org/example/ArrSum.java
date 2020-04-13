package org.example;
 /*
    Задача 7
            Напишите программу, которая выводит на экран сумму всех чисел массива.
            попробовать с циклом for arr.length

public class ArrSum {
    public static void main (String [] args) {
      int[] a = {1, 2, 3, 1111, 333, 333, 11212, 347878742, 1211121};
      int sum =  calculateSum(a);
      System.out.print(sum);
    }
    static public int calculateSum(int []a) {
        int sumOfArr = 0;
        for (int element : a) {
            sumOfArr += element;
        }
        return sumOfArr;
    }
}

*/
public class ArrSum {
    public static void main (String [] args) {
      int[] array = {1, 2, 3, 1111, 333, 333, 11212, 347878742, 1211121};
      int sum =  calculateSum(array);
      System.out.print(sum);
    }
    static public int calculateSum(int []a) {
        int sumOfArr = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sumOfArr +=a[i];
        }
        return sumOfArr;
    }
}
