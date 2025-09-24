class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class D302RemoveDuplicateShortedList {

    // Recursive method to remove duplicates completely
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        if (head.val == head.next.val) {
            // Skip all nodes with this value
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next); // Recur for rest
        } else {
            head.next = deleteDuplicates(head.next); // No duplicate at head
            return head;
        }
    }

    // Helper method to print linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        D302RemoveDuplicateShortedList solver = new D302RemoveDuplicateShortedList();

        // Create example list: 1->2->3->3->4->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        System.out.print("Original list: ");
        solver.printList(head);

        ListNode result = solver.deleteDuplicates(head);

        System.out.print("After removing duplicates: ");
        solver.printList(result);
    }
}
