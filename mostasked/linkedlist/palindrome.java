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

  public boolean isPalindrome(ListNode head) {
    //         if the linkedlist is null or containing one element, it is a palindrome
    if (head == null || head.next == null) {
      return true;
    }
    //         finding the middle element of the linkedlist
    ListNode fast = head;
    ListNode slow = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    //         reverse the right half
    slow.next = reverseList(slow.next);

    //         move slow to right half
    slow = slow.next;

    //         check for the right half equal to left half or not
    while (slow != null) {
      if (head.val != slow.val) return false;
      head = head.next;
      slow = slow.next;
    }
    return true;
  }

  // reversing a linked List
  ListNode reverseList(ListNode head) {
    ListNode pre = null;
    ListNode next = null;
    while (head != null) {
      next = head.next;
      head.next = pre;
      pre = head;
      head = next;
    }
    return pre;
  }
}
