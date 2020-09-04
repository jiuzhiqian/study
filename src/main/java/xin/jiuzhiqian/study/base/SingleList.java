package xin.jiuzhiqian.study.base;

import lombok.Data;

/**
 * @author : feng
 */
public class SingleList {
    public static void main(String[] args) {
        SingleList singleList = new SingleList();
        Node<String> tail = null;
        Node<String> head = new Node<>("no1");
        tail = head;
        tail.next = new Node<>("no2");
        tail = tail.next;
        tail.next = new Node<>("no3");
//        System.out.println(head.toString());
//        System.out.println(singleList.revList(head));
        System.out.println(singleList.revList2(head));
//        System.out.println(singleList.revList3(head));
    }

    public void printNode(Node<String> root) {
        Node<String> curr = root;
        while (curr != null) {
            System.out.println(curr.item);
            curr = curr.next;
        }
    }

    public void printRevNode(Node<String> root) {
        if (root != null) {
            printRevNode(root.next);
            System.out.println(root.item);
        }
    }

    public Node<String> revList(Node<String> head) {
        if (head == null) {
            return null;
        }
        // 结果
        Node<String> res = null;
        // 前节点
        Node<String> pre = null;
        // 当前节点
        Node<String> cur = head;
        while (cur != null) {
            // 获取当前节点的下一个节点
            Node<String> next = cur.next;
            // 下个节点空时,结果为当前节点
            if (next == null) {
                res = cur;
            }
            // 当前节点的下一个节点为上一个节点
            cur.next = pre;
            // 上一个节点赋值了当前节点
            pre = cur;
            // 循环下一个节点
            cur = next;
        }
        return res;
    }

    public Node<String> revList2(Node<String> head) {
        Node<String> res = null;
        Node<String> next;
        while (head != null) {
            next = head.next;
            head.next = res;
            res = head;
            head = next;
        }
        return res;
    }

    public Node<String> revList3(Node<String> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<String> temp = head.next;
        Node<String> newHead = revList3(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }

    
}