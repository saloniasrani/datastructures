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
// Time Complexity: O(n)
// Auxiliary Space: O(1)
class Solution {

  public ListNode reverseList(ListNode head) {
    //         iterative method
    ListNode cur = head;
    ListNode prev = null, next = null;
    while (cur != null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    head = prev;
    return head;
  }
}

//approach 2 (Recursive)
// Time COmplexity:o(n);
// space complexity: O(n) because of the recursive call
class Solution {

  public ListNode reverseList(ListNode head) {
    //         recursive method
    if (head == null || head.next == null) {
      return head;
    }
    ListNode r = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return r;
  }
}
