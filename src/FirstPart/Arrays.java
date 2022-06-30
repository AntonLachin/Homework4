package FirstPart;

import java.util.Scanner;

public class Arrays {
    /**
     * 4.2.1 Проверка сортировки массива
     */
    public static int[] ifArraySorted(int[] array) {
        int i = 0;
        int j = 1;

        while (array.length - 1 >= i + 1) {
            if (array[i] < array[i + 1]) {
                i++;
                j++;
                if (j == array.length) {
                    System.out.println("OK!\n"+java.util.Arrays.toString(array));
                    break;
                }
            } else {
                System.out.println("Please, try again!\n"+java.util.Arrays.toString(array));
                break;
            }
        }
        return array;
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
    public static int[] changePlaces(int[] array) {
        int i = array.length;
        int j = array[array.length - 1];
        int k = array[0];

        System.out.println(java.util.Arrays.toString(array));
        array[0] = j;
        array[i - 1] = k;
        System.out.println(java.util.Arrays.toString(array));

        return array;
    }
    /**
     * 4.2.4 Поиск первого уникального элемента в массиве
     */
    public static int[] firstUnique(int[] array) {
        int i = 0;
        int j = 1;

        do {
            if (array.length == j) {
                System.out.println("Первый уникальный элемент - " + array[i]);
                break;
            } else if (array[i] != array[j]) {
                j++;
                if (j == i) {
                    j++;
                }
            } else {
                i++;
                j = 0;
            }
        } while (array.length - 1 >= i);
        return array;
    }
}
