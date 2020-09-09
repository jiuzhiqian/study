package xin.jiuzhiqian.study;

/**
 * @author : feng
 */
public class Dp {
    public static void main(String[] args) {
        int[] weight = {10, 20, 40};
        int[] value = {60, 100, 120};
        int capacity = 50;  //容量
        int count = 3;
        int[][] packageValue = new int[count][capacity];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < capacity; j++) {
                if (weight[i] <= j) {
                    packageValue[i][j] = Math.max(packageValue[i][j], value[i] + packageValue[i][j - weight[i]]);
                } else {
                    packageValue[i][j] = packageValue[i][j];
                }
            }
        }
        System.out.println(packageValue[count - 1][capacity - 1]);
    }
}