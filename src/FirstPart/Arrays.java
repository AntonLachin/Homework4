package FirstPart;

import java.util.Scanner;

public class Arrays {
    /**
     * 4.2.1 Проверка сортировки массива
     */
    public static void ifArraySorted() {
        int[] arrayUnsorted = {25, 34, 37, 551, 64, 78, 92};
        int[] arraySorted = {1, 3, 5, 15, 22, 34, 51};
        int i = 0;
        int j = 1;

        while (arraySorted.length - 1 >= i + 1) {
            if (arraySorted[i] < arraySorted[i + 1]) {
                i++;
                j++;
                if (j == arraySorted.length) {
                    System.out.println("OK!\n");
                    i = 0;
                    j = 1;
                    break;
                }
            } else {
                System.out.println("Please, try again!\n");
                i = 0;
                j = 1;
                break;
            }
        }
        while (arrayUnsorted.length - 1 >= i + 1) {
            if (arrayUnsorted[i] < arrayUnsorted[i + 1]) {
                i++;
                j++;
                if (j == arrayUnsorted.length) System.out.println("OK!\n");
            } else {
                System.out.println("Please, try again!\n");
                break;
            }
        }
    }

    /**
     * 4.2.2 Ввод длины и содержимого массива с консоли
     */
    public static void arrayLengthAndInput() {
        Scanner in = new Scanner(System.in);
        int j = 0;

        System.out.println("Введите длину массива:");
        int i = in.nextInt();
        int[] arrayConsole = new int[i];
        do {
            System.out.println("Введите элемент массива: ");
            arrayConsole[j] = in.nextInt();
            j++;
        } while (j < arrayConsole.length);

        System.out.println("Длина массива равна " + arrayConsole.length + "\n");
        System.out.println("Новый массив: " + java.util.Arrays.toString(arrayConsole));
    }

    /**
     * 4.2.3 Метод меняет местами первый и последний элементы массива
     */
    public static void changePlaces() {
        int[] arrayOne = {25, 17, 36, 11, 45, 7};
        int i = arrayOne.length;
        int j = arrayOne[arrayOne.length - 1];
        int k = arrayOne[0];

        System.out.println(java.util.Arrays.toString(arrayOne));
        arrayOne[0] = j;
        arrayOne[i - 1] = k;
        System.out.println(java.util.Arrays.toString(arrayOne));
    }

    /**
     * 4.2.4 Поиск первого уникального элемента в массиве
     */
    public static void firstUnique() {
        int[] someArray = {1, 4, 7, 4, 10, 7, 1, 92, 34, 9, 15, 10};
        int i = 0;
        int j = 1;

        do {
            if (someArray.length == j) {
                System.out.println("Первый уникальный элемент - " + someArray[i]);
                break;
            } else if (someArray[i] != someArray[j]) {
                j++;
                if (j == i) {
                    j++;
                }
            } else {
                i++;
                j = 0;
            }
        } while (someArray.length - 1 >= i);
    }
}
