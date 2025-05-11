
public class _017_OddEvenLL_2 {

    public static Node oddEvenLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 4, 30, 56, 78};
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        head = oddEvenLL(head);
        PrintLinkedList.printLinkedList(head);
    }
}


// Function: oddEvenLL(Node head)

// 1. Empty list or single node check:
//    If the list is empty or has only one node, return the head.

// 2. Initialize pointers:
//    odd = head      // Pointer to the first (odd) node
//    even = head.next // Pointer to the second (even) node
//    evenHead = even  // Store the head of the even node list

//    Initial list:
//    [1] -> [2] -> [3] -> [4] -> [5] -> NULL
//     ^    ^
//    odd  even
//    evenHead

// 3. Rearrange nodes:
//    while (even != NULL and even.next != NULL):

//        Iteration 1:
//            odd.next = even.next    // 1 -> 3
//            odd = odd.next        // odd = 3
//            even.next = odd.next   // 2 -> 4
//            even = even.next        // even = 4

//        List:
//        [1] -> [3] -> [2] -> [4] -> [5] -> NULL
//              ^    ^
//             odd  even

//        Iteration 2:
//            odd.next = even.next    // 3 -> 5
//            odd = odd.next        // odd = 5
//            even.next = odd.next   // 4 -> NULL
//            even = even.next        // even = NULL

//        List:
//        [1] -> [3] -> [5] -> [2] -> [4] -> NULL
//                    ^    ^
//                   odd  even

// 4. Connect even list to the end of odd list:
//    odd.next = evenHead  // 5 -> 2

//    Final List:
//    [1] -> [3] -> [5] -> [2] -> [4] -> NULL
//                      ^
//                     odd
//                      ^
//                   evenHead

// 5. Return head:
//    Returns the head of the modified linked list.