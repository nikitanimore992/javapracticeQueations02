// Node definition
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class D4AddTwoNumberLinkedList {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;  // extract carry
            curr.next = new ListNode(sum % 10); // new node with unit digit

            // Move pointers forward
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }    

    public static void main(String[] args) {
        D4AddTwoNumberLinkedList Nikita = new D4AddTwoNumberLinkedList();
        
        // Creating first linked list: 2 -> 4 -> 3 (represents number 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Creating second linked list: 5 -> 6 -> 4 (represents number 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Adding the two numbers
        ListNode result = Nikita.addTwoNumbers(l1, l2);

        // Printing the result linked list: should represent number 807 (7 -> 0 -> 8)
        System.out.print("Resultant Linked List: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
