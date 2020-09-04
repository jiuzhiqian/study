package xin.jiuzhiqian.study.leetcode;

/**
 * @author : zhou
 */
public class Day5Solution {
    public static void main(String[] args) {
        Day5Solution solution = new Day5Solution();

    }

    // 110
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int dd = Math.abs(getDep(root.left) - getDep(root.right));
        return dd <= 1;
    }

    private int getDep(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getDep(node.left), getDep(node.right)) + 1;
    }
}