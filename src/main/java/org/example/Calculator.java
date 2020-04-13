package org.example;
import java.util.Scanner;
/*
сделать отдельные математические методы и вызывать их в свиче
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
public class Calculator {
        static Scanner scanner = new Scanner(System.in);
        public static void main (String[]args){
            int number1 = getInt();
            int number2 = getInt();
            char operation = getOperation();
            int result = performMath(number1, number2, operation);
            System.out.println("Operations result: " + result);
        }
        public static int getInt () {
            System.out.println("Enter a number");
            int number;
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("You have entered not a number");
                scanner.next();
                number = getInt();
            }
            return number;
        }
        public static char getOperation () {
            System.out.println("Enter an operation, for example (+, - , *, /)");
            char operation;
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("You have entered not a number");
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }
        //сделать отдельные математические методы и вызывать их в свиче
        public static int performMath(int number1, int number2, char operation) {
            int result = 0;
                    switch (operation) {
                case '+':
                    result = calcSum(number1, number2);
                    break;
                case '-':
                    result = calcMinus(number1, number2);
                    break;
                case '*':
                    result = calcMultiplication(number1, number2);
                    break;
                case '/':
                    result = calcDivision(number1, number2);
                    break;
                default:
                    System.out.println("Unknown issue, try again");
            }
            return result;
        }
        public static int calcSum (int number1, int number2){
            return number1 + number2;
            }
        public static int calcMinus(int number1, int number2){
            return number1 - number2;
        }
        public static int calcMultiplication(int number1, int number2){
            return number1 * number2;
        }
         public static int calcDivision(int number1, int number2){
        return number1 / number2;
    }
    }

