package algs.core.basemodel.exercises;

public class Ex_1_1_9 {
    public static void main(String[] args) {
        int N = 100;
        String s = "";

        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }

        System.out.println(s);
        System.out.println(Integer.toBinaryString(N));
    }
}
