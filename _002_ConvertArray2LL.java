
public class _002_ConvertArray2LL {

    public static Node convertArray2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node x = new Node(arr[i]);
            temp.next = x;
            temp = x;
        }
        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 4, 9};
        Node x = convertArray2LL(arr);
        printLinkedList(x);
    }
 

}
