package xin.jiuzhiqian.study.base;

/**
 * @author : feng
 */
public class TreeNode<E extends Comparable<E>> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }

    public TreeNode(E element, TreeNode<E> left, TreeNode<E> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    // 前序遍历
    protected void preOrder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // 中序遍历
    protected void inOrder(TreeNode<String> head) {
        if (head == null) {
            return;
        }
        inOrder(head.left);
        System.out.println(head.element + " ");
        inOrder(head.right);
    }

    // 后序遍历
    protected void postOrder(TreeNode<String> head) {
        if (head == null) {
            return;
        }
        postOrder(head.left);
        postOrder(head.right);
        System.out.println(head.element);
    }
}