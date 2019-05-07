package com.hendisantika.problemsolving;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : problem-solving
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-08
 * Time: 04:19
 */
public class Case4 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printSumPairs(a, 100);

        System.out.println("================");
        findPair(a, 100);

    }


    public static void printSumPairs(int[] input, int k) {
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

        for (int i = 0; i < input.length; i++) {

            if (pairs.containsKey(input[i]))
                System.out.println(input[i] + ", " + pairs.get(input[i]));
            else
                pairs.put(k - input[i], input[i]);
        }

    }

    // Naive method to find a pair in an array with given sum
    public static void findPair(int[] A, int sum) {
        // consider each element except last element
        for (int i = 0; i < A.length - 1; i++) {
            // start from i'th element till last element
            for (int j = i + 1; j < A.length; j++) {
                // if desired sum is found, print it and return
                if (A[i] + A[j] == sum) {
                    System.out.println("Pair found at index "
                            + i + " and " + j);
                    return;
                }
            }
        }

        // No pair with given sum exists in the array
        System.out.println("Pair not found");
    }

}
