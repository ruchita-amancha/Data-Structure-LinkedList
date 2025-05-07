public class _007_DeleteTailLL {

    public static Node deleteTail(Node head){
        if(head==null || head.next==null)
        return null;

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }

        temp.next=null;
        return head;
    }


    public static void main(String[] args){
        int arr[]={2,4,7,9,4,56,78};
        Node head=_002_ConvertArray2LL.convertArray2LL(arr);
        head=deleteTail(head);
        PrintLinkedList.printLinkedList(head);

    }
}
