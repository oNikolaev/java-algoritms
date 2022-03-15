package algs.core.basemodel.exercises;

import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Ex_1_1_15 {
    public static void main(String[] args) {
        int M = StdIn.readInt();
        int[] a = new int[M];

        for (int i = 0; i < M; i++) {
            a[i] = StdRandom.uniform(M);
        }

        int[] h = histogram(a, M);
        StdArrayIO.print(a);
        StdArrayIO.print(h);
    }

    public static int[] histogram(int[] a, int M) {
        int[] result = new int[M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (a[j] == i) {
                    result[i] += 1;
                }
            }
        }
        return result;
    }
}
