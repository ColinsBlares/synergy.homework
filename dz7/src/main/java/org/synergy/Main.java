package org.synergy;

public class Main{

    public static int calculatePower(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return number * calculatePower(number, power - 1);
    }



    public static void main(String[] args) {

        int number = 2; // число, которое будем возводить в степень
        int power = 3; // степень
        int result = calculatePower(number, power);
        System.out.println("Результат: " + result);

    }

}