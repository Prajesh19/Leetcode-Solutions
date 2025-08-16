/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
            ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            int gcdVal = gcd(prev.val, curr.val);
            ListNode gcdNode = new ListNode(gcdVal);
            prev.next = gcdNode;
            gcdNode.next = curr;

            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    // Euclidean algorithm for GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}