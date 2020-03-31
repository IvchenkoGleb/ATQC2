package org.example;
import java.util.Scanner;


public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
    int number1 = getInt();
    int number2 = getInt();
    char operation = getOperation();
    int result = calc(number1, number2, operation);
    System.out.println("Operations result: " + result);
    }
    public static int getInt(){
        System.out.println("Enter a number");
        int number;
        if (scanner.hasNextInt()) {
             number = scanner.nextInt();
        }
        else {
            System.out.println("You have entered not a number");
            scanner.next();
            number = getInt();
        }
        return number;
    }
    public static char getOperation(){
        System.out.println("Enter an operation, for example (+, - , *, /)");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        }
        else{
            System.out.println("You have entered not a number");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int number1, int number2, char operation){
        int result;
        switch (operation){
            case '+':
                result = number1+number2;
                break;
            case '-':
                result = number1-number2;
                break;
            case '*':
                result = number1*number2;
                break;
            case '/' :
                result = number1/number2;
             break;
            default:
                System.out.println("Unknown issue, try again");
                result = calc(number1, number1, getOperation());
        }
        return result;
    }
    }


