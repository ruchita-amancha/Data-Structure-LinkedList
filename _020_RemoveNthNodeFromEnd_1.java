public class _020_RemoveNthNodeFromEnd_1 {
    
    public static Node removeNodeFromEnd(Node head,int n,int lengthOfLL){

        if(n==lengthOfLL){
            return head.next;
        }

        int no=lengthOfLL-n;
        Node temp=head;
        while(temp!=null){
            no--;
            if(no==0){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 4, 56, 78};
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        int lengthOfLL=_004_LengthOfLL.lengthOfLL(head);
        head = removeNodeFromEnd(head,7,lengthOfLL);
        PrintLinkedList.printLinkedList(head);

    }
}


// TC=> O(length)+O(length-N) ~ O(2length)
// SC=> O(1)