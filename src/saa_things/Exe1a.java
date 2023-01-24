package saa_things;

import java.util.Random;

public class Exe1a {
    public static void main(String[] args) {
        int[][] a = new int[31][31];
        initMatrix(a);

        // driver code
        int[] d2 = new int[31];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i + j == a.length - 1){
                    d2[i] = a[i][j];
                }
            }
        }

        // sort d2 with O(n)
        int[] sortedD2 = new int[101 /*range of elements in d2 [0; 100]*/];
        for (int i = 0; i < d2.length; i++) {
            sortedD2[d2[i]]++;
        }

        int[] resultArr = new int[d2.length];
        int resultIndex = 0;
        for (int i = 0; i < sortedD2.length; i++) {
            if (sortedD2[i] == 0) continue;
            for (int j = 0; j < sortedD2[i]; j++) {
                resultArr[resultIndex++] = i;
            }
        }

        System.out.println("Middle value element: " + resultArr[d2.length/2]);
        // to here
    }

    private static void initMatrix(int[][] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(1,101);
            }
        }
    }
}
