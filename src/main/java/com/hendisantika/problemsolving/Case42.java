package com.hendisantika.problemsolving;

/**
 * Created by IntelliJ IDEA.
 * Project : problem-solving
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-08
 * Time: 06:27
 */
public class Case42 {
    static int findNumber(int i, int j) {

        int k;

        int n = 0;

        for (k = 0; k < j; k++) {

            n = i % 3;

            i = i / 3;

        }

        return n;

    }

    public static void main(String[] args) {

        int i, j, k, current, result, operation = 0;

        for (i = 0; i < 19683; i++) {

            if (i % 3 == 0)

                continue;

            current = 0;

            result = 0;

            for (j = 1; j < 10; j++) {

                k = findNumber(i, j);

                if (k == 0) {

                    current = current * 10 + j;

                } else {

                    result = result + (operation == 1 ? current : -current);

                    current = j;

                    operation = k;

                }

            }

            result = result + (operation == 1 ? current : -current);

            if (result == 100) {

                for (j = 1; j < 10; j++) {

                    k = findNumber(i, j);

                    if (k == 0)

                        System.out.printf("%d", j);

                    else

                        System.out.printf("%s%d", k == 1 ? "+" : "-", j);

                }

                System.out.printf("\n");

            }

        }

    }
}
