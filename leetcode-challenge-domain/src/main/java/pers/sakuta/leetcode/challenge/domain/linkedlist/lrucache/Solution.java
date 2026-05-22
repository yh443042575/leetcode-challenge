package pers.sakuta.leetcode.challenge.domain.linkedlist.lrucache;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    // 双向链表节点
    class Node {
        int key, value;
        Node prev, next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    class LRUCache{

        private int capacity;
        private Map<Integer,Node> map = new HashMap<>();

        private Node head = new Node(0,0);
        private Node tail = new Node(0,0);


        public LRUCache(int capacity) {
            this.capacity = capacity;
            head.next = tail;
            tail.prev = head;
        }




    }


}
