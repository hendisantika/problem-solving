package com.hendisantika.problemsolving;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * Project : problem-solving
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-07
 * Time: 22:14
 */
public class Case2 {

    static int removeDuplicates(int[] arr, int n) {
        // Return, if array is empty
        // or contains a single element
        if (n == 0 || n == 1)
            return n;

        int[] temp = new int[n];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }

    static void printPairs(int[] arr, int sum) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition
            if (temp >= 0 && s.contains(temp)) {
                System.out.println("Pair with given sum " +
                        sum + " is (" + arr[i] +
                        ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }

    public static int[] removeDupInIntArray(int[] ints) {
        Set<Integer> setString = new LinkedHashSet<Integer>();
        for (int i = 0; i < ints.length; i++) {
            setString.add(ints[i]);
        }
        System.out.println(setString);

        int[] array = setString.stream().mapToInt(Number::intValue).toArray();

        return array;
    }


    // Main to test the above function
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 9, 2, 3, 4, 5, 9, 8, 7, 2, 5, 6, 8, 3, 1, 4};
        int x = 15;

        int n = a.length;

//        n = removeDuplicates(a, n);
//
        // Print updated array
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");

        System.out.println("===================================");
        int[] temp = removeDupInIntArray(a);
        System.out.println("===================================");
        printPairs(temp, 15);


//        System.out.println("Remove Duplicate number: " + removeDuplicates(a, a.length));
//        printPairs(removeDuplicates(a, a.length));
    }
}
