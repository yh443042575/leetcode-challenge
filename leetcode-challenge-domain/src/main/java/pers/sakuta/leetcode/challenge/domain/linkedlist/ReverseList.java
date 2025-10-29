package pers.sakuta.leetcode.challenge.domain.linkedlist;

import lombok.Data;

/**
 * 翻转链表
 * 1、按照迭代方式实现
 * 2、可以按照递归的方式实现
 */
public class ReverseList {

    @Data
    static class Node {

        Integer val;

        Node next;

    }

    /**
     * 迭代方式实现
     * @param head
     * @return
     */
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;    // 保存下一个节点
            current.next = prev;    // 反转当前节点的指针
            prev = current;         // 移动prev指针
            current = next;         // 移动current指针
        }

        return prev; // prev现在是新的头节点
    }


    /**
     * 递归方式实现
     * 首先找到最末一个节点，并返回这个最末节点（此时的最末节点会变为链表的新节点）
     * @param head
     * @return
     */
    public static Node recursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        Node head = initLinkedList();
        Node node = head;
        while (node != null) {
            System.out.printf(String.valueOf(node.getVal()));
            node = node.next;
        }
        System.out.println();

        // 测试迭代方式翻转
        node = reverse(head);
        while (node != null) {
            System.out.printf(String.valueOf(node.getVal()));
            node = node.next;
        }
        System.out.println();

        // 重新初始化链表并测试递归方式翻转
        head = initLinkedList();
        node = recursion(head);
        while (node != null) {
            System.out.printf(String.valueOf(node.getVal()));
            node = node.next;
        }

    }

    private static Node initLinkedList() {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Node node5 = new Node();

        node1.setVal(1);
        node1.next = node2;

        node2.setVal(2);
        node2.next = node3;

        node3.setVal(3);
        node3.next = node4;

        node4.setVal(4);
        node4.next = node5;

        node5.setVal(5);
        node5.next = null;
        return node1;
    }

}
