class Solution {
    /*
    Runtime: 0 ms
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode probe = head;

        //create the probing space
        int i = 0;
        while(i < n && probe != null) {
            probe = probe.next;
            i++;
        }
        
        //if probe became null before fully creating the probing space, then the head is the nth node from the end
        if(probe == null) {
            head = current.next;
            return head;
        }
        else {
            //otherwise, move the pointers until the end is reached
            while(probe.next != null) {
                probe = probe.next;
                current = current.next;
            }

            //remove the next element, which is the nth node from the end
            current.next = current.next.next;

            return head;            
        }
    }
}