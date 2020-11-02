package xin.jiuzhiqian.study.leetcode;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : feng
 */
public class Day22Solution {

    public static void main(String[] args) {
        Day22Solution solution = new Day22Solution();
        System.out.println(solution.reformatDate("6th Jun 1933"));
    }

    // 1507
    public String reformatDate(String date) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Map<String, Integer> monthMap = new HashMap<String, Integer>();
        for (int i = 1; i <= 12; i++) {
            monthMap.put(months[i - 1], i);
        }

        String[] arr = date.split(" ");
        int mon = monthMap.getOrDefault(arr[1], 1);
        int day = Integer.parseInt(arr[0].substring(0, arr[0].length() - 2));
        return String.format("%s-%02d-%02d", arr[2], mon, day);
    }

    // 1175
    public int numPrimeArrangements(int n) {
        if (n < 3) {
            return 1;
        }
        int count = 1;
        for (int i = 2; i < n + 1; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j < n + 1 && j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime) {
                count++;
            }
        }
        int primeCount = n - count;
        long res = 1;
        int i = 1;
        while (i <= primeCount) {
            res = (res * i++) % 1000000007;
        }
        i = 1;
        while (i <= count) {
            res = (res * i++) % 1000000007;
        }
        return (int) res;
    }
}