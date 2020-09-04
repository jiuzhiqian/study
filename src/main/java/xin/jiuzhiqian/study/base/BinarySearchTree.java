package xin.jiuzhiqian.study.base;

import sun.reflect.generics.tree.Tree;

/**
 * @author : feng
 */
public class BinarySearchTree {
    private TreeNode<String> root;

    public BinarySearchTree() {
    }

    public boolean search(String e) {
        TreeNode<String> curr = root;
        while (curr != null) {
            if (e.compareTo(curr.element) < 0) {
                curr = curr.left;
            } else if (e.compareTo(curr.element) > 0) {
                curr = curr.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean insert(String e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            // 寻找合适的父节点
            TreeNode<String> parent = null;
            TreeNode<String> curr = root;
            while (curr != null) {
                if (e.compareTo(curr.element) < 0) {
                    parent = curr;
                    curr = curr.right;
                } else if (e.compareTo(curr.element) > 0) {
                    parent = curr;
                    curr = curr.right;
                } else {
                    return false;
                }
            }
            // 插入
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else if (e.compareTo(parent.element) > 0) {
                parent.right = createNewNode(e);
            }
        }
        System.out.println(root.toString());
        return true;
    }

    protected TreeNode<String> createNewNode(String e) {
        return new TreeNode<>(e);
    }

    public TreeNode<String> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<String> root) {
        this.root = root;
    }
}