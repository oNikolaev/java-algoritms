package algs.core.basemodel.exercises;

import java.util.Random;

public class Ex_1_1_11 {
    public static void main(String[] args) {
        boolean[][] array = new boolean[10][10];
        final Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextBoolean();
            }
        }

        System.out.print("  ");
        for (int j = 0; j < array[0].length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((array[i][j] == true ? "*" : " ") + " ");
            }
            System.out.println();
        }
    }
}
