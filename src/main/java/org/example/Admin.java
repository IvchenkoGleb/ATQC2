package org.example;


/*

 Задача 1
 Объявите две переменные типа String: admin и name.
 Запишите строку "John" в переменную name.
 Скопируйте значение из переменной name в admin.

*/
public class Admin {
    public static void userName() {
         String name = "John";
         String admin = name;
        System.out.println(admin);
    }

    public static void main(String[] args) {
        userName();
    }
}

