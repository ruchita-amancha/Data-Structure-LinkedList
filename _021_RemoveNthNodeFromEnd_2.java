
public class _021_RemoveNthNodeFromEnd_2 {
// Tortoise and hare algo
    public static Node removeNodeFromEnd(Node head, int n) {
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        Node slow = head;
        //We traverse the list using fast and slow pointers. Once the fast pointer reaches null, the slow pointer will point to the node just before the node that needs to be deleted.
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 4, 56, 78};
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        head = removeNodeFromEnd(head, 6);
        PrintLinkedList.printLinkedList(head);
    }
}

// TC->O(lengthOfLL)
// SC-> O(1)
