package org.synergy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++)
            sum += i;
        System.out.print("Сумма между = " + sum);
        scanner.close();
    }
}