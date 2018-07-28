package com.codersmart.algorithms.trainings;

public class AddTwoNumbersLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    ;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int incremental = 0;

        while (l1 != null || l2 != null || incremental != 0) {
            int val1 = 0;
            int val2 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            int sum = val1 + val2 + incremental;
            int val = sum % 10;
            incremental = sum / 10;

            curr.next = new ListNode(val);
            curr = curr.next;

        }

        return head.next;

    }

    /**
     * getLinkedList based on value
     *
     * @param value, e.g., 579
     * @return NodeList { 9 -> 7 -> 5 }
     */
    public ListNode getLinkedList(int value) {
        ListNode head = new ListNode(value % 10);
        value = value / 10;
        ListNode curr = head;
        while (value > 0) {
            ListNode node = new ListNode(value % 10);
            value = value / 10;
            curr.next = node;
            curr = node;
        }

        return head;
    }
}
