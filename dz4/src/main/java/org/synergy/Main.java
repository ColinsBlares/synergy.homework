package org.synergy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = IntStream.range(0, 10).map(i -> (int) (Math.random() * 900) + 100).toArray();

        int sum = Arrays.stream(array).sum();

        IntStream.range(0, array.length).mapToObj(i -> "Элемент " + (i + 1) + ": " + array[i]).forEach(System.out::println);

        System.out.print("Сумма элементов: " + sum);
    }
}