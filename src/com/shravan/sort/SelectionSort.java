package com.shravan.sort;

import java.util.Random;

//selection sort.
//find the smallest, swap it with first
//find second smallest, swap it with second etc.
//https://www.khanacademy.org/computing/computer-science/algorithms/sorting-algorithms/a/selection-sort-pseudocode
//start at left  and move till the extream right
public class SelectionSort {

    public static void main(String[] args) {
        int[] input =new Random().ints(0, 11).limit(10).toArray();
//        int[] input ={6,6,0,5,4,2,8,0,3,8};
        System.out.println("-------Before--------");
        for (int i=0;i<input.length;i++) {
            System.out.println(input[i]);
        }
        int toSwap = 0;
        int swapBy = 0;

        for (int i = 0; i <= input.length - 1; i++) {
            toSwap = input[i];
            int swapByIndex = i;
            for (int j = i + 1; j <= input.length - 1; j++) {
                swapBy = input[j];
                if (toSwap < swapBy) {
                    continue;
                }
                if (toSwap >= swapBy) {
                    swapByIndex = j;
                    toSwap = swapBy;
                    continue;
                }
            }
            int tempNum =  input[i];
            input[i] = input[swapByIndex];
            input[swapByIndex] = tempNum;
        }
        System.out.println("-------After--------");
        // write your code here
        for (int i=0;i<input.length;i++) {
            System.out.println(input[i]);
        }
    }
}
