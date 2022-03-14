package algs.core.basemodel.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_3 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();

        if (a == b && b == c) {
            StdOut.println("равны");
        }
        else
            StdOut.println("не равны");
    }
}
