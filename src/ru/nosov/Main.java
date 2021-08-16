package ru.nosov;


public class Main {

    public static void main(String[] args){

        //Реализация в классе DoubleArray

        DoubleArray doubleArray = new DoubleArray();

        int[][] array = {{3, 2, 1}, {32, 1, 2}, {2, 1, 2}};


        System.out.println("Exceptions Home Tasks" + "\n");

        //Task1
        System.out.println("Task1");
        System.out.println("Max element in the array: "
                +  doubleArray.findMaxInDoubleArray(array) + "\n");

        System.out.println("Max element in the array: "
                +  doubleArray.findMaxInDoubleArray(null) + "\n");

        //Task2
        System.out.println("Task2");
        System.out.println("Is the array square:"
                + doubleArray.checkSquareArray(array) + "\n");

        System.out.println("Is the array square:"
                + doubleArray.checkSquareArray(null) + "\n");
        //Task3
        System.out.println("Task3");
        System.out.println("the string with the maximum sum of elements:"
                + doubleArray.findMaxRowSummary(array) + "\n");

        System.out.println("the string with the maximum sum of elements:"
                + doubleArray.findMaxRowSummary(null) + "\n");

        //Task4
        System.out.println("Task4");
        System.out.println("Array with random literal values:");
        doubleArray.printDoubleCharArray
                (doubleArray.fillDoubleArrayByRandomValue(3, 8));

        doubleArray.printDoubleCharArray
                (doubleArray.fillDoubleArrayByRandomValue(0, 0));

        doubleArray.printDoubleCharArray
                (doubleArray.fillDoubleArrayByRandomValue(-1, -1));

    }



}
