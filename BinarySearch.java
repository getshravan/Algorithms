package com.shravan.sort;

public class BinarySearch {
    static int[] input = {0,1,2,3,4,5,6,7,8,9,10,11,12};
    public static void main(String[] args) {
        int target = 12;
        int minIndex = 0;
        int maxIndex = input.length-1;
        while(true) {
            int midRange = (minIndex+maxIndex)/2;
            System.out.println("mid range: "+midRange);
            int guess = input[midRange];
            if (target < guess) {
                maxIndex = midRange - 1;
            } else if (target > guess) {
                minIndex = midRange + 1;
            } else {
                System.out.println("You guessed it right"+midRange);
                break;
            }
        }
    }
}
