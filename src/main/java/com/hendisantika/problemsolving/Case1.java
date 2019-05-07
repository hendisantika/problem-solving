package com.hendisantika.problemsolving;

/**
 * Created by IntelliJ IDEA.
 * Project : problem-solving
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-07
 * Time: 21:10
 */
public class Case1 {
    // Function to ind missing number
    static int getMissingNo(int[] a, int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }

    /* program to test above function */
    public static void main(String[] args) {
//        int a[] = {1,3,5,4};
//        int a[] = {2,3,5,4};
        int[] a = {1, 5, 3, 2};
        int miss = getMissingNo(a, a.length);
        System.out.println(miss);
    }
}
