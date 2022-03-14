package algs.core.basemodel.exercises;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;
import java.util.Random;

public class Ex_1_1_13 {
    public static void main(String[] args) {
        int M = StdIn.readInt();
        int N = StdIn.readInt();

        Random random = new Random();

        int[][] array = new int[M][N];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
            }
        }

        System.out.println("Исходный массив");
        System.out.println(Arrays.deepToString(array));

        int[][] transpArray = new int[N][M];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpArray[j][i] = array[i][j];
            }
        }

        System.out.println("Транспонированный массив");
        System.out.println(Arrays.deepToString(transpArray));

    }

}
