package org.anthonyBrown.leetCode.listNodeA;

public class ListNode {
        int val;
        ListNode next; // 链表指针指向下一个链表节点
        ListNode() {} // 提高灵活性，先创造节点后续再赋值
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
