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
            System.out.println("Число "+ a+" не наименьшее");
        }
    }
    /**
     * 4.5 Проверка первого и последнего элемента массива на равенство 3.
     */
    public static void ifThereAreThirds (){
        int i =10;
        int[] array2 = {3,10,24,22,11,7};
        int[] array3 = {10,14,42,45,34,81,3};

        Random rd = new Random();
        int[] randomArray = new int[i];
        for (int j = 0; j < i; j++) {
            randomArray[j] = rd.nextInt();
            System.out.println(randomArray[j]);
        }

        if (randomArray[0] == 3 | randomArray[i-1] == 3) System.out.println("true");
        else System.out.println("Ни в начале массива ни в конце цифры 3 нет!");

        if (array2[0] == 3 | array2[array2.length-1] == 3) System.out.println("true");
        else System.out.println("Ни в начале массива ни в конце цифры 3 нет!");

        if (array3[0] == 3 | array3[array3.length-1] == 3) System.out.println("true");
        else System.out.println("Ни в начале массива ни в конце цифры 3 нет!");
    }


}
