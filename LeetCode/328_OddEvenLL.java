class Solution {
    /*
    Runtime: 0 ms
    Time complexity: O(n)
    Space complexity: ?
    */
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode removed = head.next;
        
        while(odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        
        odd.next = removed;
        
        return head;
    }
}