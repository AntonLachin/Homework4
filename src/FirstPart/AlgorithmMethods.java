package FirstPart;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AlgorithmMethods {
    /**
     * 4.1 Вывод нечётных
     */
    public static void odd() {
        int i = 0;
        do {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
            } else {
            }
        } while (i < 100);
    }

    /**
     * 4.2 Вывод делящихся на 3,5
     */
    public static void threeOrFive() {
        int j = 0;
        do {
            j++;
            if ((j % 3) == 0 && (j % 5 == 0)) {
                System.out.println("Делится на 3 и на 5: " + j);
            } else if (j % 3 == 0) {
                System.out.println("Делится на 3: " + j);
            } else if (j % 5 == 0) {
                System.out.println("Делится на 5: " + j);
            }
        } while (j < 100);
    }

    /**
     * 4.3 Проверка равенства суммы двух третьему
     */
    public static void isSummSuit() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();
        System.out.println("Введите третье число:");
        int c = in.nextInt();

        if (a + b == c) {
            System.out.println("true");
        } else {
            System.out.println("Сумма первых двух не равна третьему!");
        }
    }

    /**
     * 4.4 Сравнение значений чисел между собой
     */
    public static void ifFirstSmallest() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = in.nextInt();
        System.out.println("Введите второе число:");
        int b = in.nextInt();
        System.out.println("Введите третье число:");
        int c = in.nextInt();

        if (b > a && c > b) {
            System.out.println("true");
        } else {
            System.out.println("Число " + a + " не наименьшее");
        }
    }

    /**
     * 4.5 Проверка первого и последнего элемента массива на равенство 3.
     */
    public static void ifThereAreThirds() {
        int i = 10;
        int[] arrayTwo = {3, 10, 24, 22, 11, 7};
        int[] arrayThree = {10, 14, 42, 45, 34, 81, 3};

        Random rd = new Random();
        int[] randomArray = new int[i];
        for (int j = 0; j < i; j++) {
            randomArray[j] = rd.nextInt();
            System.out.println(randomArray[j]);
        }

        if (randomArray[0] == 3 | randomArray[i - 1] == 3) System.out.println("true");
        else System.out.println("Ни в начале массива ни в конце цифры 3 нет!");

        if (arrayTwo[0] == 3 | arrayTwo[arrayTwo.length - 1] == 3) System.out.println("true");
        else System.out.println("Ни в начале массива ни в конце цифры 3 нет!");

        if (arrayThree[0] == 3 | arrayThree[arrayThree.length - 1] == 3) System.out.println("true");
        else System.out.println("Ни в начале массива ни в конце цифры 3 нет!");
    }

    /**
     * 4.6 Поиск 1 либо 3 в составе массива
     */
    public static void areThereSomeNumbers() {
        int[] arrayOne = {1, 17, 7, 0, 51, 6, 3, 37, 14, 9, 45};
        int[] arrayTwo = {24, 22, 7, 0, 51, 6, 1, 37};
        int[] arrayThree = {24, 17, 7, 458, 51, 6, 102, 34, 14, 9, 22, 34, 58, 67};
        int i = 0;
        int j = 0;
        int k = 0;

        while (arrayOne.length - i != 0) {
            i++;
            if (arrayOne[arrayOne.length - i] == 3) {
                System.out.println("В этом массиве есть число 3! \n");
                break;
            } else if (arrayOne[arrayOne.length - i] == 1) {
                System.out.println("В этом массиве есть число 1! \n");
                break;
            } else if (arrayOne.length - i == 0) {
                System.out.println("В массиве нет ни 3 ни 1! \n");
            }
        }
        while (arrayTwo.length - j != 0) {
            j++;
            if (arrayTwo[arrayTwo.length - j] == 3) {
                System.out.println("В этом массиве есть число 3! \n");
                break;
            } else if (arrayTwo[arrayTwo.length - j] == 1) {
                System.out.println("В этом массиве есть число 1! \n");
                break;
            } else if (arrayTwo.length - j == 0) {
                System.out.println("В массиве нет ни 3 ни 1! \n");
            }
        }
        while (arrayThree.length - k != 0) {
            k++;
            if (arrayThree[arrayThree.length - k] == 3) {
                System.out.println("В этом массиве есть число 3! \n");
                break;
            } else if (arrayThree[arrayThree.length - k] == 1) {
                System.out.println("В этом массиве есть число 1! \n");
                break;
            } else if (arrayThree.length - k == 0) {
                System.out.println("В массиве нет ни 3 ни 1! \n");
            }
        }
    }
}
