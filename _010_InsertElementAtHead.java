public class _010_InsertElementAtHead {

    public static Node insertAtHead(Node head, int ele) {

        Node newNode = new Node(ele, head);
        return newNode;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 7, 9, 4, 56, 78 };
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        head = insertAtHead(head, 100);
        PrintLinkedList.printLinkedList(head);
    }
}
