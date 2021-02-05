package xin.jiuzhiqian.study;

import java.util.Arrays;

/**
 * @author : feng
 */
public class TestTree {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b  = Arrays.copyOf(a,6);
        System.out.println(Arrays.toString(b));
    }
}