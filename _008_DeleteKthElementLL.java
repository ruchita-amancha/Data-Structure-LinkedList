public class _008_DeleteKthElementLL {

    public static Node deleteKthEle(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 7, 9, 4, 56, 78 };
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        head = deleteKthEle(head, 2);
        PrintLinkedList.printLinkedList(head);
    }

}
