// Задача 2. Вывести все простые числа от 1 до 1000

package Seminar1;

import java.util.Scanner;

public class Task2 {
    private static void printSimpleNumbers(int maxNumber) {
        for (int i = 1; i <= maxNumber;) {
            if (i<3){
                System.out.printf(i + " ");
                i++;
            }  
            else{
                boolean isSimple = true;
                for (int j = 2; j < i; j++) {
                    if (i%j == 0){
                        isSimple = false;
                        break;
                    }                                  
                }
                if (isSimple) {
                    System.out.printf(i + " ");
                }
                i+=2;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите число, до которого нужно вывести последовательность простых чисел:");
        Scanner myScan = new Scanner(System.in);
        boolean isNumber = myScan.hasNextInt();
        if (isNumber) {
            int myNumber = myScan.nextInt();
            if (myNumber < 1) {
                System.out.println("Пожалуйста, введите натуральный параметр!");
            }
            else {
                printSimpleNumbers(myNumber);
            }
        }
        else{
            System.out.println("ОШИБКА!!! Пожалуйста, введите натуральное число N в числовом формате!");
        }         
        myScan.close();
    }
}
