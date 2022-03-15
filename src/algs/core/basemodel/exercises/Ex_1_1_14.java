package algs.core.basemodel.exercises;

public class Ex_1_1_14 {
    public static void main(String[] args) {
        int N = 15;
        System.out.println(lg(N));
        System.out.println(log(N));
    }

    public static int log(int x) {
        return (int) (Math.log(x) / Math.log(2) + 1e-10);
    }

    public static int lg( int bits ) // returns 0 for bits=0
    {
        int log = 0;
        if( ( bits & 0xffff0000 ) != 0 ) {
            bits >>>= 16; log = 16;
        }
        if( bits >= 256 ) {
            bits >>>= 8; log += 8;
        }
        if( bits >= 16  ) {
            bits >>>= 4; log += 4;
        }
        if( bits >= 4   ) {
            bits >>>= 2; log += 2;
        }
        return log + ( bits >>> 1 );
    }
}
