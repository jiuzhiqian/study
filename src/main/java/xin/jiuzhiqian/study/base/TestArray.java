package xin.jiuzhiqian.study.base;

import java.util.Arrays;

/**
 * @author : feng
 */
public class TestArray {
    public static void main(String[] args) {
        int[] oldArray = new int[10];
        int[] newArray = new int[20];
        oldArray[3] = 3;
        oldArray[4] = 5;
        oldArray[7] = 7;
        System.arraycopy(oldArray, 0, newArray, 3, 7);
        System.out.println(Arrays.toString(newArray));
    }
}