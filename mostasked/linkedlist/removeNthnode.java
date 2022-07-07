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

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode slow = null;
    ListNode fast = head;
    int i = 0;
    while (fast.next != null) {
      i++;
      if (i == n) slow = head; else if (i > n) slow = slow.next;
      fast = fast.next;
    }
    if (slow == null) return head.next;
    ListNode p = slow.next;
    slow.next = slow.next.next;
    p.next = null;
    return head;
  }
}
