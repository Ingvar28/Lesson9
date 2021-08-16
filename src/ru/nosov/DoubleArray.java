package ru.nosov;

import java.util.Random;


public  class DoubleArray {
    private final Random random = new Random();

    //1. Написать метод для поиска наибольшего элемента в двумерном массиве.
    public int findMaxInDoubleArray (int[][] array)  throws ArrayIndexOutOfBoundsException, NullPointerException {

        int max = 0;

        try{
            for (int[] ints : array) {
                for (int anInt : ints) {
                    if (anInt > max) {
                        max = anInt;
                    }
                }

            }

        }catch (ArrayIndexOutOfBoundsException | NullPointerException exceptionForAnEmptyArray) {
            System.out.println("An array need to be filled");
        }
        return max;
    }

    //2. Написать метод, который проверяет, является ли двумерный массив квадратным.
    public boolean checkSquareArray (int[][] array)  throws ArrayIndexOutOfBoundsException, NullPointerException  {
        boolean flag = true;

        try {
            for (int[] ints : array) {
                for (int j = 0; j < ints.length; j++) {
                    if (array.length != ints.length) {
                        flag = false;
                        break;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException exceptionForAnEmptyArray) {
            System.out.println("An array need to be filled");
        }
        return flag;
    }

    //3. Написать метод, который, в двумерном массиве (матрице) ищет строку, сумма
    //элементов которой является максимальной среди всех строк матрицы.
    public int findMaxRowSummary (int[][] array)  throws ArrayIndexOutOfBoundsException, NullPointerException  {
        double total = 0;
        double temp;
        int maxIndex = 0;

        try {
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
        } catch (ArrayIndexOutOfBoundsException | NullPointerException exceptionForAnEmptyArray) {
            System.out.println("An array need to be filled");
        }
        return maxIndex;
    }



    //4. Двумерный массив MxN заполнить случайными символами алфавита

    public char[][] fillDoubleArrayByRandomValue (int m, int n) {

        char[][] array = new char[0][];

        try {
            if(m == 0 && n == 0 || m < 0 || n < 0)
                throw new Exception("An array size should be more  then zero");

            array = new char[m][n];
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

            for (int i = 0; i <array.length ; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] =alphabet.charAt(random.nextInt(alphabet.length())) ;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return array;
    }



    //Print for Double Array
    public void printDoubleCharArray(char[][] array) throws ArrayIndexOutOfBoundsException, NullPointerException{
        try {
            for (char[] chars : array) {
                for (int j = 0; j < chars.length; j++) {
                    System.out.print(chars[j]);
                }
                System.out.println("");
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException exceptionForAnEmptyArray) {
            System.out.println("An array need to be filled");
        }
    }


}
