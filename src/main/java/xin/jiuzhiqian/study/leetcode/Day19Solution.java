package xin.jiuzhiqian.study.leetcode;

import java.util.*;

/**
 * @author : zhou
 */
public class Day19Solution {
    public static void main(String[] args) {
        Day19Solution solution = new Day19Solution();
        int x = 2, y = 3, bound = 10;
        int[] A = {1, 2, 3};
        int K = 123;
        // System.out.println(solution.powerfulIntegers(x, y, bound));
        System.out.println(solution.addToArrayForm(A, K));
    }

    // 989
    public List<Integer> addToArrayForm(int[] A, int K) {
        String s = K + "";
        char[] B = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        int a = A.length - 1, b = B.length - 1, addOne = 0;
        while (a >= 0 || b >= 0) {
            int tmp = addOne;
            if (b >= 0) {
                tmp += (B[b--] - '0');
            }
            if (a >= 0) {
                tmp += A[a--];
            }
            if (tmp >= 10) {
                addOne = 1;
                list.add(tmp % 10);
            } else {
                addOne = 0;
                list.add(tmp);
            }
        }
        if (addOne == 1) {
            list.add(addOne);
        }
        Collections.reverse(list);
        return list;

        // cao
        /*List<Integer> list = new ArrayList<>();
        int curr = 0, addNo = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            long tmp = (A[i] + addNo) * (long)Math.pow(10, curr++) + K;
            long divisionNum = (long) Math.pow(10, curr);
            if (tmp / divisionNum > K / divisionNum) {
                addNo = 1;
            } else {
                addNo = 0;
            }
            list.add((int) (tmp / (divisionNum / 10) % 10));
        }
        if (addNo == 1) {
            list.add(1);
        }
        Collections.reverse(list);
        return list;*/
    }

    // 985
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int preCount = 0, index = 0;
        int[] ans = new int[queries.length];
        for (int a : A) {
            if (a % 2 == 0) {
                preCount += a;
            }
        }
        for (int[] query : queries) {
            if (A[query[1]] % 2 == 0) {
                if (query[0] % 2 == 0) {
                    preCount += query[0];
                } else {
                    preCount -= A[query[1]];
                }
            } else {
                if (query[0] % 2 != 0) {
                    preCount += (A[query[1]] + query[0]);
                }
            }
            A[query[1]] += query[0];
            ans[index++] = preCount;
        }
        return ans;
    }

    private int handleQuery(int count, int curr, int query) {

        return count;
    }

    // 977
    public int[] sortedSquares(int[] A) {
        int[] ans = new int[A.length];
        int left = 0, right = A.length - 1, index = right;
        while (left <= right) {
            if (Math.abs(A[left]) >= Math.abs(A[right])) {
                ans[index--] = A[left] * A[left++];
            } else {
                ans[index--] = A[right] * A[right--];
            }
        }
        return ans;
    }

    // 976
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i - 1] + A[i - 2] > A[i]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }

    // 509
    public int fib(int N) {
        if (N < 1) {
            return 0;
        } else if (N < 3) {
            return 1;
        }
        int ans = 1;
        int pre = 1;
        for (int i = 3; i <= N; i++) {
            int tmp = pre;
            pre = ans;
            ans += tmp;
        }
        return ans;
    }

    // 970
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < bound; i++) {
            for (int j = 0; j < bound; j++) {
                double n = Math.pow(x, i) + Math.pow(y, j);
                if (n <= bound) {
                    set.add((int) n);
                } else {
                    break;
                }
            }
        }
        return new ArrayList<>(set);
    }
}