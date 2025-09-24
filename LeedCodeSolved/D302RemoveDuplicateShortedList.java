class D302RemoveDuplicateShortedList{
  
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class D302RemoveDuplicateShortedList{
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy; // Pointer to the last node before the sublist of duplicates
        ListNode current = head; // Pointer to traverse the list
        
        while(current != null) {
            // Move current until the end of duplicates sublist
            while(current.next != null && current.val == current.next.val) {
                current = current.next;
            }
            
            // If prev's next is still current, no duplicates were found
            if(prev.next == current) {
                prev = prev.next; // Move prev to next node
            } else {
                // Skip all duplicates
                prev.next = current.next;
            }
            
            // Move current forward
            current = current.next;
        }
        
        return dummy.next; // Return the modified list, skipping the dummy node
    }
    public static void main(String[] args) {
        D302RemoveDuplicateShortedList solver = new D302RemoveDuplicateShortedList();
        
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);
        
        ListNode result = solver.deleteDuplicates(head);
        
        // Print the result
        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
}