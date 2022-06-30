package FirstPart;

import java.util.Random;
import java.util.Scanner;

public class AlgorithmMethods {
    /**
     * 4.1.1 Вывод нечётных
     */
    public static void odd() {
        int i = 0;
        do {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
            }
        } while (i < 100);
    }

    /**
     * 4.1.2 Вывод делящихся на 3,5
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
     * 4.1.3 Проверка равенства суммы двух третьему
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
     * 4.1.4 Сравнение значений чисел между собой
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
     * 4.1.5 Проверка первого и последнего элемента массива на равенство 3.
     */
    public static int[] ifThereAreThirds(int[] array) {
        if (array[0] == 3 | array[array.length - 1] == 3) System.out.println("true");
        else System.out.println("В начале массива или в конце цифры 3 нет!");
        return array;
    }
    /**
     * 4.1.6 Поиск 1 либо 3 в составе массива
     */
    public static int[] areThereSomeNumbers(int[] array) {
        
        int i = 0;
        int j = 0;
        int k = 0;

        while (array.length - i != 0) {
            i++;
            if (array[array.length - i] == 3) {
                System.out.println("В этом массиве есть число 3! \n");
                break;
            } else if (array[array.length - i] == 1) {
                System.out.println("В этом массиве есть число 1! \n");
                break;
            } else if (array.length - i == 0) {
                System.out.println("В массиве нет ни 3 ни 1! \n");
            }
        }
        return array;
    }
}

