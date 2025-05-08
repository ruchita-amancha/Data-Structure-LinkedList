public class _012_InsertEleAtKthPosition {

    public static Node insertKthPosition(Node head, int ele, int k) {

        if (k == 1) {
            Node newNode = new Node(ele, head);
            return newNode;
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k - 1) {
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
        head = insertKthPosition(head, 100, 7);
        PrintLinkedList.printLinkedList(head);
    }
}
