package part_01.part_01_01;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class StdDrawDemo {
    public static void main(String[] args) {
        funcValues();
        randomArray();
        randomSortedArray();
    }

    public static void funcValues() {
        int N = 1000;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);

        for (int i = 1; i <= N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }

    public static void randomArray() {
        int N = 50;
        double[] a = new double[N];

        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random();
        }

        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    public static void randomSortedArray() {
        int N = 50;
        double[] a = new double[N];

        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random();
        }

        Arrays.sort(a);

        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
