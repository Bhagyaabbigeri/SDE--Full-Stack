// Q- Write a function in java to calculate the sum of integers. The function should take two numbers as input and return their sum.

import java.util.Scanner;

public class SumCalculation {
    public static int getSum(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number1 =" + " ");
        int number1 = scanner.nextInt();

        System.out.print("number2 =" + " ");
        int number2 = scanner.nextInt();

        System.out.print(getSum(number1, number2));

    }
}