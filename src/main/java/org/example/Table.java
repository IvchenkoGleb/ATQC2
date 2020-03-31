package org.example;


/*
        Задача 6
        Вывести на экран таблицу умножения на 7.
        Пример вывода на экран:
        7 * 1 = 7
        7 * 2 = 14


 */


public class Table {
    public static void main(String[] args){
        int i = 7;
        {
            for (int j = 1; j < 11; j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
    }
}
