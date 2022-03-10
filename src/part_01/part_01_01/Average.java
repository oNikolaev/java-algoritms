package part_01.part_01_01;

import edu.princeton.cs.algs4.StdIn;

public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int cnt = 0;

        while (!StdIn.isEmpty()) {
            sum += StdIn.readDouble();
            cnt++;
        }
        double avg = sum / cnt;
        System.out.printf("Среднее - %.5f\n", avg);
    }
}
