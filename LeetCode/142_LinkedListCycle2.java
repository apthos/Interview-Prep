public class Solution {
    /* NEEDS IMPROVEMENT
    Runtime: 1 ms (only faster than 27.21%)
    Time complexity: O(?)
    Space complexity: O(1)
    */
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        
        while(fast != null && fast.next != null && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast == null || fast.next == null) return null;
        System.out.print(slow.val + " " + fast.val);
        slow = head;
        
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}