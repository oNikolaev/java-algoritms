package algs.core.basemodel.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_6 {
    public static void main(String[] args) {
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
