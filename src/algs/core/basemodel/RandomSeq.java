package algs.core.basemodel;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);

        randomDemo(N, lo, hi);
    }

    /**
     * Выводит N раз случайное число от lo до hi.
     *
     * @param N количество вызовов метода получения случайного числа
     * @param lo начало диапазона
     * @param hi конец диапазона
     */
    public static void randomDemo(int N, double lo, double hi) {
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniform(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
