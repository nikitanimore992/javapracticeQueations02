

class O_MergeToShortList{
    public ListNode mergeTwoLists(ListNode first, ListNode second) {

     ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists
        while (first != null && second != null) {
            if (first.val <= second.val) {
                current.next = first;
                first = first.next;
            } else {
                current.next = second;
                second = second.next;
            }
            current = current.next;
        }

        // Attach the remaining elements (if any) from list1 or list2
        if (first != null) {
            current.next = first;
        } else if (second != null) {
            current.next = second;
        }

        // Return the next node of the dummy node as the head of the merged list
        return dummy.next;
} 



}