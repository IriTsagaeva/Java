//Задача3. Реализовать простой калькулятор.

package Seminar1;

import java.util.Scanner;

public class Task3 {
    public static double getSum(double x, double y) {
        return x + y;
    }

    public static double getProduct(double x, double y) {
        return x * y;
    }

    public static double getDifference(double x, double y) {
        return x - y;
    }

    public static double getQuotient(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите первое число: ");
        Scanner myScanner = new Scanner(System.in);
        boolean isNumberDouble = myScanner.hasNextDouble();
        if (isNumberDouble) {
            double firstNumber = myScanner.nextDouble();
            System.out.println(
                    "Пожалуйста, введите идентификатор операции.\n + - сложение,\n - - вычитание, \n * - умножение, \n / - деление");
            String operation = myScanner.next();
            operation = operation.replaceAll(" ", "");
            if (operation.equals("+") ||
                    operation.equals("*") ||
                    operation.equals("/") ||
                    operation.equals("-")) {
                isNumberDouble = myScanner.hasNextDouble();
                if (isNumberDouble) {
                    double secondNumber = myScanner.nextDouble();
                    switch (operation) {
                        case "+":
                            System.out.println(getSum(firstNumber, secondNumber));
                            break;
                        case "-":
                            System.out.println(getDifference(firstNumber, secondNumber));
                            break;
                        case "*":
                            System.out.println(getProduct(firstNumber, secondNumber));
                            break;
                        default:
                            if (secondNumber == 0) {
                                System.out.println("Делить на 0 нельзя!!!");
                            }else {
                                System.out.println(getQuotient(firstNumber, secondNumber));
                            }
                            break;
                    }
                } else {
                    System.out.println("Пожалуйста, введите параметр в числовом формате!!!");
                }
            } else {
                System.out.println("Введен некорректный оператор! Пожалуйста, попробуйте еще раз!");
            }
        } else {
            System.out.println("Пожалуйста, введите параметр в числовом формате!!!");
        }
    }
}
