
public class _016_OddEvenLL_1 {

    public static Node oddEvenLL(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        Node temp = head;

        while (temp.next != null && temp.next.next != null) {
            Node newNode = new Node(temp.data);
            curr.next = newNode;
            curr = curr.next;
            temp = temp.next.next;
        }
        if (temp != null) {
            Node newNode = new Node(temp.data);
            curr.next = newNode;
            curr = curr.next;
        }
        temp=head.next;
        while (temp.next != null && temp.next.next != null) {
            Node newNode = new Node(temp.data);
            curr.next = newNode;
            curr = curr.next;
            temp = temp.next.next;
        }
        // if (temp != null) {
            Node newNode = new Node(temp.data);
            curr.next = newNode;
            
        // }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 4, 56, 78};
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        head = oddEvenLL(head);
        PrintLinkedList.printLinkedList(head);

    }
}
