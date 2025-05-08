public class _013_InsertEleBeforeValueX {
    public static Node insertBeforeX(Node head, int ele, int val) {
        if (head.data == val) {
            return new Node(ele, head);
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next.data == val) {
                Node newNode = new Node(ele, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 9, 4, 56, 78 };
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        head = insertBeforeX(head, 100, 78);
        PrintLinkedList.printLinkedList(head);
    }
}
