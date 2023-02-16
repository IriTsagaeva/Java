//Задача1. Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Seminar1;

import java.util.Scanner;

public class Task1 {
    public static int getTriangularNumber(int number) {

        if (number == 0) {
            return 0;
        } else {
            return number + getTriangularNumber(number - 1);
        }
    }

    public static int getFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите число N:");
        Scanner iScanner = new Scanner(System.in);
        boolean isNumber = iScanner.hasNextInt();
        if (isNumber) {
            int myNumber = iScanner.nextInt();
            if (myNumber < 0) {
                System.out.println("Пожалуйста, введите неотрицательный параметр!");
            } else {
                int triangularNumber = getTriangularNumber(myNumber);
                int factorial = getFactorial(myNumber);
                System.out.println(String.format("Треугольное число %d равно %d", myNumber, triangularNumber));
                System.out.println(String.format("Факториал числа %d равен %d", myNumber, factorial));
            }
        }
        else{
            System.out.println("ОШИБКА!!! Пожалуйста, введите неотрицательное целое число N в числовом формате!");
        }         
        iScanner.close();
    }
}
