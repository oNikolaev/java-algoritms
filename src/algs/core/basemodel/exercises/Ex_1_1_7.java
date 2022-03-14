package algs.core.basemodel.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_7 {
    public static void main(String[] args) {
//        calc1();
//        calc2();
        calc3();
    }

    public static void calc3() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    public static void calc2() {
        int sum = 0;

        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }

        StdOut.println(sum);
    }

    public static void calc1() {
        double t = 9.0;
        while ((Math.abs(t - 9.0/t)) > .001) {
            t = (9.0/t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
    }
}
