package com.task71;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Создать 2мерный массив (матрица) M*N и заполнить его случайными числами.
// Отсортировать числа по возрастанию, чтобы с левом верхнем углу было самое маленькое число,
// справа от него следующее по значению, итд, в правом нижнем углу самое большое.

public class Main {

    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        int min = 1;
        int max = 50;

        ArrayList<Integer> list = new ArrayList<>();
        int[][] mArray = new int[row][column];
        Random random = new Random();

        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                mArray[i][j] = random.nextInt(max - min + 1) + min;

        System.out.println("Array before sorting");

        for (int[] rows : mArray) {
            for (int value : rows) {
                System.out.print(value + "   ");
            }
            System.out.println();
        }

        for (int[] rows : mArray) {
            for (int value : rows) {
                list.add(value);
            }
        }
        Collections.sort(list);
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mArray[i][j] = list.get(count++);
            }
        }

        System.out.println("Array after sorting");
        for (int[] rows : mArray) {
            for (int value : rows) {
                System.out.print(value + "   ");
            }
            System.out.println();
        }
    }
}
