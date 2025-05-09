
public class _015_Add2NumbersInLL {

    public static Node add2LLNode(Node head1, Node head2) {

        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        int carry = 0;
        Node t1 = head1;
        Node t2 = head2;
        while (t1 != null || t2 != null) {
            int sum = carry;
            if (t1 != null) {
                sum = sum + t1.data;
            }
            if (t2 != null) {
                sum = sum + t2.data;
            }
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            curr.next = newNode;
            curr = curr.next;
            if (t1 != null) {
                t1 = t1.next;
            }
            if (t2 != null) {
                t2 = t2.next;
            }
        }
        if (carry != 0) {
            Node newNode = new Node(carry);
            curr.next = newNode;
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 4, 9};
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        int arr2[] = {2, 4, 7};
        Node head2 = _002_ConvertArray2LL.convertArray2LL(arr2);
        head = add2LLNode(head, head2);
        PrintLinkedList.printLinkedList(head);

    }
}
