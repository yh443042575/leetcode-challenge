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
     * @param node
     * @return
     */
    public static Node reverse(Node node) {
        Node preNext = node.next;
        Node last = null;
        while (preNext != null) {
            node.setNext(last);
            last = node;
            node = preNext;
            preNext = preNext.next;
        }
        node.setNext(last);
        return node;
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
//        node = reverse(head);
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
