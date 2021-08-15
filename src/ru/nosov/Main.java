package ru.nosov;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Реализация в классе DoubleArray

        DoubleArray doubleArray = new DoubleArray();

        int[][] array = {{3, 2, 1}, {32, 1, 2}, {2, 1, 2}};
        int[][] emptyArray = {{}, {}};


        System.out.println("Exceptions Home Tasks");
        System.out.println("Наибольший эелемент в массиве: "
                +  doubleArray.findMaxInDoubleArray(array) + "\n");

        System.out.println("Является ли массив квадратным: "
                + doubleArray.checkSquareArray(array) + "\n");

        System.out.println("Строка с максимальной суммой элементов: "
                + doubleArray.findMaxRowSummary(array) + "\n");

        System.out.println("Массив со случайными значениями: ");
        doubleArray.printDoubleCharArray
                (doubleArray.fillDoubleArrayByRandomValue(5, 3));





    }

    static Random random = new Random();

    public static char[][] test (int m, int n) {
        char[][] array = new char[m][n];
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";



        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] =alphabet.charAt(random.nextInt(array.length)) ;
            }
        }
        return array;
    }


}
