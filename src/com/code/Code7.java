/**
 * 
 */
package com.code;

import java.util.Stack;

/**
 * @author 邓志立
 * @date 2018年7月25日 Description:给定两个非空链表来表示两个非负整数。
 *       位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *       输入：(2 -> 4 -> 3) + (5 -> 6 -> 4) 输出：7 -> 0 -> 8 原因：342 + 465 = 807
 */
public class Code7 {

	
	//思路  将两个数相加后结果 用前插入法倒叙插入（注意加0及处理进位）
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head=new ListNode(0);
        ListNode p=head;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0) {
            int val=(l1!=null?l1.val:0)+(l2!=null?l2.val:0)+carry;
            carry=val/10;
            l1 = l1!=null?l1.next:l1;  
            l2 = l2!=null?l2.next:l2; 
            p.next=new ListNode(val%10);
            p=p.next;
        }
        return head.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
