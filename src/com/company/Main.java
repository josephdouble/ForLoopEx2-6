package com.company;

public class Main {

    public static void main(String[] args) {

        int smallestNumber = 1;

        for (int counter = 1; counter <= 5; counter++) {
            if (smallestNumber % counter != 0) {
                counter = 1;
                smallestNumber++;
            }
        }
        System.out.println("The smallest number is " + smallestNumber);
    }
}
