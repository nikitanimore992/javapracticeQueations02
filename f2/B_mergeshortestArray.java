
import java.util.Arrays;


class B_mergeshortestArray{
    class ListNode {
        int val;
        ListNode next;
    
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public class RemoveDuplicatesSortedList {

        // Function to remove duplicates from a sorted linked list
        public static ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;
    
            while (current != null && current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next; // Skip the duplicate
                } else {
                    current = current.next; // Move to the next node
                }
            }
    
            return head;
        }
    
        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
     
    public static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1 (excluding extra space)
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the end of nums1

        // Merge nums1 and nums2 from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements from nums2, if any
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        // Example usage for removing duplicates from linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        head = deleteDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);

        // Example usage for merging sorted arrays
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        mergeSortedArrays(nums1, m, nums2, n);

        System.out.println("Merged Sorted Array: " + Arrays.toString(nums1));
    }

    }
}