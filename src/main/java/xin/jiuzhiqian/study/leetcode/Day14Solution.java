package xin.jiuzhiqian.study.leetcode;

import org.springframework.data.relational.core.sql.In;

import java.util.Arrays;
import java.util.Set;
import java.util.Stack;

/**
 * @author : zhou
 */
public class Day14Solution {
    public static void main(String[] args) {
        Day14Solution solution = new Day14Solution();
        int[] nums = {1, 3, 5, 7};
        // System.out.println(Arrays.toString(solution.findErrorNums(nums)));
        // String s = "LLDDUURR";
        System.out.println(solution.findLengthOfLCIS(nums));
    }

    // 674
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int curr = 0, max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (curr > 0) {
                    curr++;
                } else {
                    curr = 2;
                }
            } else {
                if (curr > 0) {
                    max = Math.max(curr, max);
                    curr = 0;
                }
            }
        }
        return Math.max(curr, max);
    }

    // 665
    public boolean checkPossibility(int[] nums) {
        if (nums.length < 1) {
            return true;
        }
        boolean a = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (!a) {
                    return false;
                }
                a = false;
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return true;
    }

    // 661
    public int[][] imageSmoother(int[][] M) {
        // official
        int R = M.length, C = M[0].length;
        int[][] ans = new int[R][C];

        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c) {
                int count = 0;
                for (int nr = r - 1; nr <= r + 1; ++nr)
                    for (int nc = c - 1; nc <= c + 1; ++nc) {
                        if (0 <= nr && nr < R && 0 <= nc && nc < C) {
                            ans[r][c] += M[nr][nc];
                            count++;
                        }
                    }
                ans[r][c] /= count;
            }
        return ans;

        /*int len1 = M.length;
        if (len1 < 1) {
            return M;
        }
        int len2 = M[0].length;
        int[][] res = new int[len1][len2];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                int tmp = 1, count = M[i][j];
                if (i > 0) {
                    tmp++;
                    count += M[i - 1][j];
                    if (j > 0) {
                        count += M[i - 1][j - 1];
                        tmp++;
                    }
                    if (j < len2 - 1) {
                        count += M[i - 1][j + 1];
                        tmp++;
                    }
                }
                if (i < len1 - 1) {
                    tmp++;
                    count += M[i + 1][j];
                    if (j > 0) {
                        count += M[i + 1][j - 1];
                        tmp++;
                    }
                    if (j < len2 - 1) {
                        count += M[i + 1][j + 1];
                        tmp++;
                    }
                }
                if (j > 0) {
                    tmp++;
                    count += M[i][j - 1];
                }
                if (j < len2 - 1) {
                    tmp++;
                    count += M[i][j + 1];
                }
                res[i][j] = count / tmp;
            }
        }
        return res;*/
    }

    // 657
    public boolean judgeCircle(String moves) {
        int[] circle = new int[2];
        for (int i = 0; i < moves.length(); i++) {
            handle(moves.charAt(i), circle);
        }
        return circle[0] == 0 && circle[1] == 0;
    }

    private void handle(char c, int[] circle) {
        switch (c) {
            case 'L':
                circle[0]--;
                break;
            case 'R':
                circle[0]++;
                break;
            case 'U':
                circle[1]--;
                break;
            case 'D':
                circle[1]++;
                break;
            default:
                break;
        }
    }

    // 645
    public int[] findErrorNums(int[] nums) {
        int dup = -1, total = 0, len = nums.length;
        int sum = len * (len + 1) / 2;
        for (int i = 0; i < len; i++) {
            int j = Math.abs(nums[i]);
            total += j;
            if (nums[j - 1] < 0) {
                dup = j;
            } else {
                nums[j - 1] = -nums[j - 1];
            }
        }
        int missing = sum - total + dup;
        return new int[]{dup, missing};
        // not sorted
        /*int correctNum = 0, errNum = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != i + 1) {
                correctNum = i + 1;
                errNum = nums[i];
            }
        }
        return new int[]{errNum, correctNum};*/
    }
}