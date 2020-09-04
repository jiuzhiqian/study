package xin.jiuzhiqian.study.base;

import xin.jiuzhiqian.study.leetcode.ListNode;

/**
 * @author : feng
 */
public class Node<E> {
    E item;
    Node<E> next;

    public Node(E item) {
        this.item = item;
        this.next = null;
    }


    @Override
    public String toString() {
        Node<E> tmp = this;
        StringBuilder res = new StringBuilder();
        while (tmp != null) {
            res.append(tmp.item);
            tmp = tmp.next;
        }
        return res.toString();
    }
}