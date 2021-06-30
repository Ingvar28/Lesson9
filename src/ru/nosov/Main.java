package ru.nosov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] array = {{1, -1, 1}, {32, 1, 2}};
        int[][] emptyArray = {{}, {}};

        System.out.println("array: " +  findMaxInDoubleArray(array));
        System.out.println("emptyArray: " +  findMaxInDoubleArray(emptyArray));



    }

    public static int findMaxInDoubleArray (int[][] array) {


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
}
