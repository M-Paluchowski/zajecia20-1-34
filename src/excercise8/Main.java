package excercise8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] integers = {7, 6, 5, 4, 3, 2, 0, 1};
//        bubbleSort(integers);
//        System.out.println(Arrays.toString(integers));

        int[] integers2 = {1, 2, 3, 4, 5, 6};
        bubbleSort(integers2);
        bubbleSortWhile(integers2);
    }

    //7, 6, 5, 4
    //6, 7, 4, 5 (1)
    //6, 4, 7, 5 (2)
    //4, 6, 5, 7 (3)
    //4, 5, 6, 7 (4)
    private static void bubbleSort(int[] numbersToSort) {
        int counter = 0;
        for (int i = 1; i <= numbersToSort.length; i++) {
            counter++;
            for (int j = 1; j < numbersToSort.length; j++) {
                int number = numbersToSort[j];
                int previousNumber = numbersToSort[j - 1];
                if (number < previousNumber) {
                    numbersToSort[j] = previousNumber;
                    numbersToSort[j - 1] = number;
                }
            }
        }
        System.out.println(counter);
    }

    private static void bubbleSortWhile(int[] numbersToSort) {
        int counter = 0;
        boolean hasChanged = true;
        while (hasChanged) {
            counter++;
            hasChanged = false;
            for (int i = 1; i < numbersToSort.length; i++) {
                int number = numbersToSort[i];
                int previousNumber = numbersToSort[i - 1];
                if (number < previousNumber) {
                    hasChanged = true;
                    numbersToSort[i] = previousNumber;
                    numbersToSort[i - 1] = number;
                }
            }
        }
        System.out.println(counter);
    }
}
