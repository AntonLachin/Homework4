package FirstPart;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AlgorithmMethods.odd();

        AlgorithmMethods.threeOrFive();

        AlgorithmMethods.isSummSuit();

        AlgorithmMethods.ifFirstSmallest();

        int[] array2 = {3, 10, 24, 22, 11, 7};
        int[] array3 = {10, 14, 42, 45, 34, 81, 3};

        int i = 10;
        Random rd = new Random();
        int[] randomArray = new int[i];
        for (int j = 0; j < i; j++) {
            randomArray[j] = rd.nextInt();
            System.out.println(randomArray[j]);
        }

        AlgorithmMethods.ifThereAreThirds(array3);

        int[] arrayOne = {1, 17, 7, 0, 51, 6, 3, 37, 14, 9, 45};
        int[] arrayTwo = {24, 22, 7, 0, 51, 6, 1, 37};
        int[] arrayThree = {24, 17, 7, 458, 51, 6, 102, 34, 14, 9, 22, 34, 58, 67};

        AlgorithmMethods.areThereSomeNumbers(arrayThree);

        int[] arraySorted = new int[]{1, 3, 5, 15, 22, 34, 51};
        int[] arrayUnsorted = {25, 34, 37, 551, 64, 78, 92};

        Arrays.ifArraySorted(arrayUnsorted);

        Arrays.arrayLengthAndInput();

        int[] arrayTest = {25, 17, 36, 11, 45, 7};

        Arrays.changePlaces(arrayTest);

        int[] someArray = {1, 4, 7, 4, 10, 7, 1, 92, 34, 9, 15, 10};

        Arrays.firstUnique(someArray);
    }
}