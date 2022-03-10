package algs.core;

import java.util.Scanner;

public class GreatCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int p = sc.nextInt();

        System.out.print("Введите второе число: ");
        int q = sc.nextInt();

        System.out.print("НОД = " + getGCD(p, q));
    }

    public static int getGCD(int p, int q) {
        if (q == 0)
            return p;

        int r = p % q;

        return getGCD(q, r);
    }
}
