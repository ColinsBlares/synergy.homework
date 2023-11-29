package org.synergy;

import java.util.Scanner;



public class Main {

    private static final char[][] field = {

            {' ', ' ', ' '},

            {' ', ' ', ' '},

            {' ', ' ', ' '}

    };

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLACK = "\u001B[30m";

    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    private static char currentPlayerSymbol = 'X';



    public static void main(String[] args) {

        System.out.println("Начинаем новую игру!");



        Scanner scanner = new Scanner(System.in);



        while (true) {

            printField();

            System.out.print("Ходит игрок " + currentPlayerSymbol + ". Введите координаты клетки (например, a2):");

            String userInput = scanner.next();

            if (!isValidInput(userInput)) {

                System.out.println(ANSI_RED + "Некорректный ввод. Попробуйте еще раз."+ANSI_RESET);

                continue;

            }


            int row = userInput.charAt(1) - '0' - 1;

            int col = userInput.charAt(0) - 'a';

            if (!isCellFree(row, col)) {

                System.out.println(ANSI_RED + "Выбранная клетка занята. Попробуйте еще раз."+ANSI_RESET);

                continue;

            }

            field[row][col] = currentPlayerSymbol;


            if (isWinner(currentPlayerSymbol)) {

                System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "Игрок " +currentPlayerSymbol + " победил!" + ANSI_RESET);

                break;

            }

            if (isFieldFull()) {

                System.out.println("Ничья!");

                break;

            }

            currentPlayerSymbol = (currentPlayerSymbol == 'X') ? 'O' : 'X';

        }

    }


    private static void printField() {

        System.out.println("  a b c");



        for (int row = 0; row < 3; row++) {

            System.out.print(row + 1 + " ");

            for (int col = 0; col < 3; col++) {

                System.out.print(field[row][col] + " ");
            }
            System.out.println();

        }

    }

    private static boolean isValidInput(String userInput) {

        if (userInput.length() != 2) {

            return false;

        }

        char colChar = userInput.charAt(0);

        char rowChar = userInput.charAt(1);

        if (colChar < 'a' || colChar > 'c') {

            return false;

        }
        return rowChar >= '1' && rowChar <= '3';
    }
    private static boolean isCellFree(int row, int col) {

        return field[row][col] == ' ';

    }



    private static boolean isFieldFull() {

        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                if (field[row][col] == ' ') {

                    return false; // Найдена свободная клетка

                }

            }

        }
        return true; // Все клетки поля заняты
    }



    private static boolean isWinner(char playerSymbol) {


        for (int row = 0; row < 3; row++) {

            if (field[row][0] == playerSymbol && field[row][1] == playerSymbol && field[row][2] == playerSymbol) {

                return true; // Победа по горизонтали

            }

        }
        for (int col = 0; col < 3; col++) {

            if (field[0][col] == playerSymbol && field[1][col] == playerSymbol && field[2][col] == playerSymbol) {

                return true; // Победа по вертикали

            }

        }



        if (field[0][0] == playerSymbol && field[1][1] == playerSymbol && field[2][2] == playerSymbol) {

            return true; // Победа по главной диагонали

        }


        return field[0][2] == playerSymbol && field[1][1] == playerSymbol && field[2][0] == playerSymbol; // Победа по побочной диагонали

    }

}
