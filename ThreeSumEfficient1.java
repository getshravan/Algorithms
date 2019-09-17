package com.shravan.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class ThreeSumEfficient1 {
    public List<List<Integer>> threeSum(int[] inputArray) {
        if (inputArray.length == 0) {
            throw new IllegalArgumentException("input array length zero");
        }

        List<List<Integer>> result = new ArrayList<>();
        // first sort the array in ascending order
        Arrays.sort(inputArray);
        for (int i = 0; i < inputArray.length - 1; i++) {
            int leftIndex = i + 1;
            int rightIndex = inputArray.length - 1;
            int sum = inputArray[i] + inputArray[leftIndex] + inputArray[rightIndex];
            while (leftIndex < rightIndex) {
                if (sum == 0) {
                    result.add(Arrays.asList(inputArray[i], inputArray[leftIndex], inputArray[rightIndex]));
                    leftIndex++;
                    rightIndex--;
                } else if (sum < 0) {
                    rightIndex--;
                } else { //sum > 0
                    leftIndex++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {-1, 0, 1, 2, -1, -4};
        ThreeSumEfficient1 threeSumEfficient1 = new ThreeSumEfficient1();
        List<List<Integer>> result = threeSumEfficient1.threeSum(inputArray);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
