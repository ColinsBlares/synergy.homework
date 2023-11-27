package org.synergy;

public class Main {
    public static void main(String[] args) {

        int squareSide = 5;
        int rectangleLength = 4;
        int rectangleWidth = 6;
        int squareArea = rectArea(squareSide);
        int rectangleArea = rectArea(rectangleLength, rectangleWidth);

        System.out.println("Площадь квадрата: " + squareArea);
        System.out.println("Площадь прямоугольника: " + rectangleArea);
    }

    public static int rectArea(int side) {
        return side * side;
    }

    public static int rectArea(int length, int width) {
        return length * width;
    }
}