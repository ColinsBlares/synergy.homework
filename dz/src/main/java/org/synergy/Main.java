package org.synergy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите переменную типа String: ");
        String st = in.nextLine();

        System.out.print("Введите переменную типа byteVar: ");
        byte byteVar = in.nextByte();

        System.out.print("Введите переменную типа shortVar: ");
        short shortVar = in.nextShort();

        System.out.print("Введите переменную типа longVar: ");
        long longVar = in.nextLong();

        System.out.print("Введите переменную типа Int: ");
        int intVar = in.nextInt();

        System.out.print("Введите переменную типа Float: ");
        float floatvar = in.nextFloat();

        System.out.print("Введите переменную типа Double: ");
        double doubleVar = in.nextDouble();

        System.out.print("Введите переменную типа boolean: ");
        boolean booleanVar = in.nextBoolean();

        System.out.printf("Ваши данные: \n " +
                        "String: %s, " +
                        "byteVar:%d, " +
                        "shortVar: %x, " +
                        "longVar: %x, " +
                        "Int: %d, " +
                        "Float: %f.2f, " +
                        "Double: %s " +
                        "boolean: %s " +
                "\n", st, byteVar, shortVar, longVar, intVar, floatvar, doubleVar, booleanVar);
        in.close();
    }
}