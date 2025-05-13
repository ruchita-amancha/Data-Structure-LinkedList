
public class _018_SortLL012_1 {

    public static Node sortLL(Node head) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                cnt0++; 
            }else if (temp.data == 1) {
                cnt1++; 
            }else if (temp.data == 2) {
                cnt2++;
            }
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(cnt0!=0)
            {
                temp.data=0;
                cnt0--;
            }
            else if(cnt1!=0)
            {
                temp.data=1;
                cnt1--;
            }
            else if(cnt2!=0)
            {
                temp.data=2;
                cnt2--;
            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,0,2,1,0,0,1,2,1,2};
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        head = sortLL(head);
        PrintLinkedList.printLinkedList(head);
    }
}


// TC--> O(2N)
// SC--> O(1)

// Function: sortLL(Node head)

// Input:
// A linked list where each node's data is either 0, 1, or 2.

// Steps:

// 1.  Count the number of 0s, 1s, and 2s:
//     * Initialize cnt0, cnt1, and cnt2 to 0.
//     * Traverse the linked list.
//     * Increment cnt0 if the node's data is 0.
//     * Increment cnt1 if the node's data is 1.
//     * Increment cnt2 if the node's data is 2.

// 2.  Rewrite the linked list with the sorted data:
//     * Reset temp to head.
//     * Traverse the linked list.
//     * For each node:
//         * If cnt0 > 0, set node's data to 0 and decrement cnt0.
//         * Else if cnt1 > 0, set node's data to 1 and decrement cnt1.
//         * Else if cnt2 > 0, set node's data to 2 and decrement cnt2.

// 3.  Return the sorted linked list (head).

// Example:

// Input linked list:
// [1] -> [0] -> [2] -> [1] -> [2] -> [0] -> NULL

// 1. Counting 0s, 1s, and 2s:
//    cnt0 = 2
//    cnt1 = 2
//    cnt2 = 2

// 2. Rewriting the linked list:
//    Iteration 1: temp.data = 0, cnt0 = 1, List: [0] -> [0] -> [2] -> [1] -> [2] -> [0] -> NULL
//    Iteration 2: temp.data = 0, cnt0 = 0, List: [0] -> [0] -> [2] -> [1] -> [2] -> [0] -> NULL
//    Iteration 3: temp.data = 1, cnt1 = 1, List: [0] -> [0] -> [1] -> [1] -> [2] -> [0] -> NULL
//    Iteration 4: temp.data = 1, cnt1 = 0, List: [0] -> [0] -> [1] -> [1] -> [2] -> [0] -> NULL
//    Iteration 5: temp.data = 2, cnt2 = 1, List: [0] -> [0] -> [1] -> [1] -> [2] -> [2] -> NULL
//    Iteration 6: temp.data = 2, cnt2 = 0, List: [0] -> [0] -> [1] -> [1] -> [2] -> [2] -> NULL

// Output linked list:
// [0] -> [0] -> [1] -> [1] -> [2] -> [2] -> NULL