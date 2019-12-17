class Solution {
    /*
    Runtime: 2 ms
    Time complexity: O(n) (n = largest given number)
    Space complexity: O(n) (n = largest given number + 1)
    */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode sum = new ListNode(0);
        ListNode head = sum;
        ListNode p1 = l1;
        ListNode p2 = l2;
        boolean overflow = false;
        
        while(p1 != null && p2 != null) {
            int add = p1.val + p2.val;
            if(overflow) {
                add++; overflow = false;
            }
            if(add > 9) overflow = true;
            
            sum.next = new ListNode(add % 10);
            sum = sum.next;
            p1 = p1.next;
            p2 = p2.next;
        }
        
        while(p1 != null) {
            int add = p1.val;
            if(overflow) {
                add++; overflow = false;
            }
            if(add > 9) overflow = true;
            
            sum.next = new ListNode(add % 10);
            sum = sum.next;
            p1 = p1.next;
        }
        
        while(p2 != null) {
            int add = p2.val;
            if(overflow) {
                add++; overflow = false;
            }
            if(add > 9) overflow = true;
            
            sum.next = new ListNode(add % 10);
            sum = sum.next;
            p2 = p2.next;
        }
        
        if(overflow) {
            sum.next = new ListNode(1);
        }
        
        return head.next;
    }
}