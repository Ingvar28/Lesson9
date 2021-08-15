package ru.nosov;


import java.sql.Array;
import java.util.Random;


public  class DoubleArray {
    private Random random = new Random();

    //1. Написать метод для поиска наибольшего элемента в двумерном массиве.
    public int findMaxInDoubleArray (int[][] array)  {

        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

        }
        return max;
    }

    //2. Написать метод, который проверяет, является ли двумерный массив квадратным.
    public boolean checkSquareArray (int[][] array) {
        boolean flag = true;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != array[i].length){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    //3. Написать метод, который, в двумерном массиве (матрице) ищет строку, сумма
    //элементов которой является максимальной среди всех строк матрицы.
    public int findMaxRowSummary (int[][] array) {
        double total = 0;
        double temp;
        int maxIndex = 0;

        for (int i = 0; i <array.length ; i++) {
            temp = 0;

            for (int j = 0; j < array[i].length; j++) {
                temp += array[i][j];
            }

            if (temp > total){
                total = temp;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    //4. Двумерный массив MxN заполнить случайными символами алфавита

    public char[][] fillDoubleArrayByRandomValue (int m, int n) {
        char[][] array = new char[m][n];
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] =alphabet.charAt(random.nextInt(array.length)) ;
            }
        }
        return array;
    }

    public void printDoubleCharArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }


}
