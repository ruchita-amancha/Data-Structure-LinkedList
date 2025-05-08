public class _011_InsertElementAtTail {

    public static Node insertTail(Node head, int ele) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(ele);
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 9, 4, 56, 78 };
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        head = insertTail(head, 100);
        PrintLinkedList.printLinkedList(head);
    }
}
