package algs.core.abstraction;

import com.sun.tools.javac.Main;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Flips {
    public static void main(String[] args) {
        int T = StdIn.readInt();

        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        for (int t = 0; t < T; t++) {
            if (StdRandom.bernoulli(0.5)) {
                heads.increment();
            }
            else {
                tails.increment();
            }
        }

        StdOut.println(heads);
        StdOut.println(tails);

        int d = (heads.tally() - tails.tally());
        StdOut.println("разница: " + Math.abs(d));
    }
}
