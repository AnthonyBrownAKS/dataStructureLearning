package org.anthonyBrown.leetCode.listNodeA;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode pre = new ListNode(0);// previous前一个节点
        ListNode cur = pre;// current当前操作的节点
        int carry = 0;// 十进位
        while (l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            // 计算是否超过10，取个位并将进位给下一位
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);


            cur = cur.next;
            if (l1 != null){
                l1 = l1.next;
            }

            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (carry == 1){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}
