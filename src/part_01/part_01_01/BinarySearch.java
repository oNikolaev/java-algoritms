package part_01.part_01_01;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            }
            else if (key > a[mid]) {
                lo = mid + 1;
            }
            else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);
        System.out.println("Сортировка выполнена, в массиве " + whiteList.length + " элементов.");

        System.out.print("Введите целое число для поиска: ");

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whiteList) == -1){
                System.out.println("Число не найдено! " + key);
            }
            else
                System.out.println("Число найдено. " + key);
            System.out.print("Введите целое число для поиска: ");
        }
    }
}
