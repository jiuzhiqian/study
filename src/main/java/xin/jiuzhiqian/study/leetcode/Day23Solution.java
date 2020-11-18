package xin.jiuzhiqian.study.leetcode;


import org.springframework.data.relational.core.sql.In;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.logging.Level;

/**
 * @author : feng
 */
public class Day23Solution {

    public static void main(String[] args) {
        Day23Solution solution = new Day23Solution();
        // System.out.println(Arrays.toString(solution.getNoZeroIntegers(214)));
        int[][] arr = {{1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(solution.kWeakestRows(arr, 1)));
    }

    // 1337
    public int[] kWeakestRows(int[][] mat, int k) {
        String[] countArr = new String[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
        }
        Arrays.sort(countArr);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            String[] s = countArr[i].split("_");
            ans[i] = Integer.parseInt(s[1]);
        }
        return ans;
    }

    // 1323
    public int maximum69Number(int num) {
        StringBuilder sb = new StringBuilder();
        String s = "" + num;
        boolean replace = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6' && !replace) {
                sb.append('9');
                replace = true;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return Integer.parseInt(sb.toString());
    }

    // 1317
    public int[] getNoZeroIntegers(int n) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        int needOne = 0;
        while (n > 0) {
            if (n == needOne) {
                break;
            } else if (n - needOne == 1) {
                b.append(1);
                break;
            }
            if (n % 10 < (2 + needOne)) {
                int t = 10 + (n % 10) - needOne;
                needOne = 1;
                b.append(8);
                a.append(t - 8);
            } else {
                int t = (n % 10) - needOne;
                needOne = 0;
                a.append(1);
                b.append(t - 1);
            }
            n /= 10;
        }
        return new int[]{Integer.parseInt(a.reverse().toString()), Integer.parseInt(b.reverse().toString())};
    }

}