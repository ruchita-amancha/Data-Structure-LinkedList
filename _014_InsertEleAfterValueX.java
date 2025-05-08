public class _014_InsertEleAfterValueX {
    public static Node insertAfterX(Node head, int ele, int x) {
        if (head.data == x) {
            Node newNode = new Node(ele, head.next);
            head.next = newNode;
            return head;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == x) {
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
        head = insertAfterX(head, 100, 78);
        PrintLinkedList.printLinkedList(head);
    }

}
