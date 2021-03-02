package xin.jiuzhiqian.study.view;

import java.util.Arrays;

/**
 * @author : zhou
 */
public class Algo {
    public static void main(String[] args) {
        Algo algo = new Algo();
        int[] arr = {1, 3, 4, 7, 2, 5, 6};
        algo.insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void maopao(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

    public void select(int[] arr) {
        int min;
        int index;
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (index != i) {
                int tmp = arr[i];
                arr[i] = min;
                arr[index] = tmp;
            }
        }
    }

    public void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[--j] = tmp;
                } else {
                    break;
                }
            }
        }
    }

    public void shell(int[] arr) {
        int gap = arr.length;
        while (gap > 1) {
            gap /= 2;
            for (int i = gap; i < arr.length; i++) {

            }
        }
    }
}