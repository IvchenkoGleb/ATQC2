package org.example;

/*
Вывести на экран числа от 5 до 1.
попробовать сделать с циклом вайл и ду вайл
public class From {
    public  static void main(String[] args){
        for (int i = 5; i > 0; i--)
            System.out.println(i);
    }
}

public class From {
    public static void countFrom(){
        int i = 5;
        do {
           System.out.println(i);
           i-=1;
        }
            while (i > 0);
    }
    public static void main(String[] args){
        countFrom();
    }
}
 */

public class From {
    public static void main(String[] args){
        untilZero();
    }
    public static void untilZero(){
        int i = 5;
        while (i > 0){
            System.out.println(i);
                i--;
        }
    }

}