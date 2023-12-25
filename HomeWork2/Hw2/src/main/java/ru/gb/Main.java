package ru.gb;

import java.util.Arrays;

public class Main {
    static int [] countEvens = new int[]{2, 1, 2, 3, 4, 0, 0};

    public static int count(int[] countEvens){
        int k = 0;
            for (int i : countEvens) {

            if(i % 2 == 0){
                k++;
            }
        }
        return k;
    }

    static int[] minMax = new int[]{3, 5, 2, 7, 0};
    public static int task_2(int[] array) {

        int a = 0;
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            a = max - min;
        }
        return a;
    }

    static int[] arr = new int[]{3, 5, 2, 7, 0};
    public static boolean task_3(int[] arr) {
        boolean difference = false;

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0){
                difference = true;
            }
            else   difference = false;
        }
        return difference;
    }

    public static void main(String[] args) {

        System.out.println("Количество четных элементов массива " + Arrays.toString(countEvens) + " равно " + count(countEvens));

        System.out.println("Разница между максимальным и минимальным элементомами массива " + Arrays.toString(minMax) +  " равна " + task_2(minMax));

        System.out.println("true-есть два соседних элемента с нулевым значением.\n false- нет двух соседних элементов с  нулевым значением. В массиве " + Arrays.toString(arr) + " " + task_3(arr));
    }
}